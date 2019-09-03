package com.betPawa.bitWallet.common.dao;


import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.betPawa.bitWallet.IBalance.BalanceResponse;
import com.betPawa.bitWallet.common.TransactionType;
import com.betPawa.bitWallet.common.model.BitWalletAccount;
import com.betPawa.bitWallet.common.model.BitWalletTransaction;
import com.betPawa.bitWallet.util.Transformer;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;









@Repository
@Transactional
public class BitWalletBalanceRepository{
    private static final Logger LOGGER =LoggerFactory.getLogger(BitWalletBalanceRepository.class); 
	public static final String WALLET_BALANCE_QUERY= "Select bb.bit_wallet_id, bb.wallet_amount ,bb.currency_name from bit_wallet_account  bb where bb.bit_wallet_id =?";
	@Autowired
	private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
   
   
    @SuppressWarnings("unchecked")
	public Stream<BitWalletAccount> balance(BitWalletAccount account,StreamObserver<BalanceResponse> responseObserver) throws Exception{
    	LOGGER.info("Retreiving records from storage");
    	List<BitWalletAccount> list=null;
    	Object rows=null;
    	try {
    	String hql =BitWalletBalanceRepository.WALLET_BALANCE_QUERY; 
    	Query query = getSession().createNativeQuery(hql,BitWalletAccount.class);
    	query.setParameter(1, account.getBitWalletId().getId());
        list=(List<BitWalletAccount>)query.getResultList();
    	}catch(Exception exp) {
    		LOGGER.error(exp.getMessage());
    		responseObserver.onError(Status.NOT_FOUND.asException());
    	}
    	
    	return list.stream();
    	  
    }
    

	

}
