package com.betPawa.bitWallet.common.dao;


import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.betPawa.bitWallet.IDeposit.EmpltyResponse;
import com.betPawa.bitWallet.common.TransactionType;
import com.betPawa.bitWallet.common.model.BitWalletAccount;
import com.betPawa.bitWallet.common.model.BitWalletId;
import com.betPawa.bitWallet.common.model.BitWalletTransaction;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

@Repository
@Transactional
public class BitWalletDepositRepository{
	public static final String SELECT_QUERY= "from BitWalletAccount bb where bb.bitWalletId =:userId and bb.currency=:currencyType";
	@Autowired
	private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
  
  public void deposit(BitWalletAccount account,StreamObserver<EmpltyResponse> responseObserver){
	  BitWalletId returnedId = null;
	  List<BitWalletAccount> list=null;
	  BitWalletAccount sessionAccount=null;
	  String hql =BitWalletDepositRepository.SELECT_QUERY;
	  Session session=null;
	  try {
	
	   session =getSession();
	  sessionAccount= session.get(BitWalletAccount.class, new BitWalletId( account.getBitWalletId().getId(),account.getBitWalletId().getCurrency()));
	if(sessionAccount==null){
		returnedId = (BitWalletId)getSession().save(account);
	     return;
				  	  
	}
	   double net=sessionAccount.getAmount()+account.getAmount();
	 	 sessionAccount.setAmount(net);
	 	session.update(sessionAccount);
	 	BitWalletTransaction transactionalObject=new BitWalletTransaction();
    	transactionalObject.setAmount(account.getAmount());
    	transactionalObject.setBitWalletId(account.getBitWalletId().getId());
    	transactionalObject.setCurrency(account.getBitWalletId().getCurrency());
    	transactionalObject.setDateTime(LocalDateTime.now());
    	transactionalObject.setTransactionType(TransactionType.DEPOSIT);
    	getSession().save(transactionalObject);
	 }catch(Exception exp) {
		  responseObserver.onError(Status.UNKNOWN.asRuntimeException());
		  exp.printStackTrace();
	  }finally {
		session.flush();
	}
  }
}
