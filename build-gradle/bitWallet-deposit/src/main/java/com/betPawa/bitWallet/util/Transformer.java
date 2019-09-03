package com.betPawa.bitWallet.util;


import com.betPawa.bitWallet.IDeposit.DepositRequest;
import com.betPawa.bitWallet.common.CurrencyType;
import com.betPawa.bitWallet.common.model.BitWalletAccount;
import com.betPawa.bitWallet.common.model.BitWalletId;



public class Transformer {
	public static final String ERROR="Unknown Currency";
 public static BitWalletAccount getBitWalletAccount(DepositRequest request) {
	 BitWalletAccount account= new BitWalletAccount();
	 account.setAmount(request.getAmount());
	 BitWalletId id= new BitWalletId();
	 id.setId(request.getUserId());
	 id.setCurrency(CurrencyType.valueOf(request.getCurrency()));
     account.setBitWalletId(id);
	
	 return account;
 }
 
}
