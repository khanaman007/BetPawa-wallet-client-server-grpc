package com.betPawa.bitWallet.common.dao;


import java.util.stream.Stream;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.betPawa.bitWallet.common.model.BitWalletAccount;









@Repository
public class BitWalletDAO implements IBitWalletRepository{
	@Autowired
	private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void deposit(BitWalletAccount account)throws Exception {
    	
        Long isSuccess = (Long)getSession().save(account);
        
        
    }
    @Override
    public Stream<BitWalletAccount> withdraw(BitWalletAccount account) throws Exception {
    	String jpql =IBitWalletRepository.WALLET_SELECT_QUERY; 
    	Query query = getSession().createQuery(jpql,BitWalletAccount.class);
    	query.setParameter("bitWalletId", account.getBitWalletId());
    	query.setParameter("currency", account.getCurrency());
    	Stream<BitWalletAccount> stream=(Stream<BitWalletAccount>)query.getResultStream();
    	 
    	return stream;
    	  
    }
    @Override
    @SuppressWarnings("unchecked")
    public Stream<BitWalletAccount> getBalance(Long accountId) throws Exception{
    	
    	String hql =IBitWalletRepository.WALLET_BALANCE_QUERY; 
    	Query query = getSession().createQuery(hql);
    	query.setParameter(0, accountId);
    	Stream<BitWalletAccount> stream=(Stream<BitWalletAccount>)query.getResultStream();
   	 
    	
    	return stream;
    }
	
	

	

}
