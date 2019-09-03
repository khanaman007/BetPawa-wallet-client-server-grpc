package com.betPawa.bitWallet.common.dao;


import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.betPawa.bitWallet.IWithdraw.WithdrawResponse;
import com.betPawa.bitWallet.common.TransactionType;
import com.betPawa.bitWallet.common.model.BitWalletAccount;
import com.betPawa.bitWallet.common.model.BitWalletId;
import com.betPawa.bitWallet.common.model.BitWalletTransaction;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;


@Repository
@Transactional
public class BitWalletWithdrawRepository{
  private static Logger LOGGER= LoggerFactory.getLogger(BitWalletWithdrawRepository.class);
	@Autowired
	private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
   
   
    public void withdraw(BitWalletAccount account,StreamObserver<WithdrawResponse> responseObserver) throws Exception {
  	  BitWalletId returnedId = null;
  	  List<BitWalletAccount> list=null;
  	  BitWalletAccount sessionAccount=null;
  	 
  	  Session session=null;
  	LOGGER.info(" Withdrawing "+account.getAmount()+":"+account.getBitWalletId().getCurrency());
  	saveTransaction(account);
  	  try {
  	
  	   session =getSession();
  	  sessionAccount= session.get(BitWalletAccount.class, new BitWalletId( account.getBitWalletId().getId(),account.getBitWalletId().getCurrency()));
  	if(sessionAccount==null){
  		responseObserver.onError(Status.NOT_FOUND.asException());
  		return ;
  				  	  
  	}
  	   if(sessionAccount.getBitWalletId().getCurrency()!=account.getBitWalletId().getCurrency())
  		 responseObserver.onError(Status.UNKNOWN.withDescription("Unknown Currency").asRuntimeException());
  	   double net=sessionAccount.getAmount()-account.getAmount();
  	     if(net<0) {
  	    	responseObserver.onError(Status.OUT_OF_RANGE.withDescription("Insufficient Fund").asRuntimeException());
  	    	return;
  	     }
  	     
  	 	 sessionAccount.setAmount(net);
  	 	session.update(sessionAccount);
  	 	responseObserver.onNext(WithdrawResponse.getDefaultInstance());
  		responseObserver.onCompleted();
  	   }catch(Exception exp) {
  		 responseObserver.onError(Status.INTERNAL.fromThrowable(exp).asException());
  		LOGGER.error("Exception while Withdrawal->"+exp);
  	  }
  
    }


	private void saveTransaction(BitWalletAccount account) {
		LOGGER.info(" Saving transcation details  "+account.getAmount()+":"+account.getBitWalletId().getCurrency());
		BitWalletTransaction transactionalObject=new BitWalletTransaction();
    	transactionalObject.setAmount(account.getAmount());
    	transactionalObject.setBitWalletId(account.getBitWalletId().getId());
    	transactionalObject.setCurrency(account.getBitWalletId().getCurrency());
    	transactionalObject.setDateTime(LocalDateTime.now());
    	transactionalObject.setTransactionType(TransactionType.WITHDRAW);
    	getSession().save(transactionalObject);
    	LOGGER.info(" Ended saving transcation details  "+account.getAmount()+":"+account.getBitWalletId().getCurrency());
	}
    
	
	

	

}
