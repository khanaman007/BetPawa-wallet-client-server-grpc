package com.betPawa.bitWallet.util;



import com.betPawa.bitWallet.IWithdraw.WithdrawRequest;
import com.betPawa.bitWallet.common.CurrencyType;
import com.betPawa.bitWallet.common.model.BitWalletAccount;
import com.betPawa.bitWallet.common.model.BitWalletId;





public class Transformer {
	public static final String WALLET_WITHDRAW_QUERY= "SELECT bwa FROM BitWalletAccount as bwa  WHERE bwa.bitWalletId=:bitWalletId AND bwa.currency= :currency";
	
	 public static BitWalletAccount getBitWalletAccount(WithdrawRequest request) {
	  BitWalletAccount account= new BitWalletAccount();
	  account.setAmount(request.getAmount());
	  BitWalletId id= new BitWalletId(request.getUserId(),CurrencyType.valueOf(request.getCurrency()));
	   account.setBitWalletId(id);
	  
	  return account;
	  }
	 
 
}
