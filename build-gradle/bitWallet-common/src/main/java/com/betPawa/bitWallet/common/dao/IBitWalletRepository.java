package com.betPawa.bitWallet.common.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.betPawa.bitWallet.common.model.BitWalletAccount;

@Repository
@Transactional
public interface IBitWalletRepository {
	public static final String WALLET_WITHDRAW_QUERY= "SELECT bwa FROM BitWalletAccount as bwa  WHERE bwa.bitWalletId=:bitWalletId AND bwa.currency= :currency";
	public static final String WALLET_BALANCE_QUERY= "Select bwa.bitWalletId, sum(bwa.amount),bwa.currency FROM BITWalletAccount bwa where bwa.bitWalletId  = ? group by bwa.currency order by bwa.bitWalletId";

	 public void deposit(BitWalletAccount account )throws Exception; 
	 public Stream<BitWalletAccount>  withdraw(BitWalletAccount account)throws Exception; 
	 public Stream<BitWalletAccount>  getBalance(Long accountId)throws Exception;
	
	/*
	 * @Query("SELECT bwa FROM BitWalletAccount account  WHERE bwa.bwa.bitWalletId=(:bitWalletId) AND bwa.currency= (:currency)"
	 * ) List<BitWalletAccount> findByWalletIdAndCurrencye(@Param("bitWalletId")
	 * Long bitWalletId, @Param("currency") BitWallet.CurrencyType currency);
	 */
}
