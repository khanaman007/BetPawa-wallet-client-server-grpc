package com.betPawa.bitWallet.util;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import com.betPawa.bitWallet.IBalance.BalanceRequest;
import com.betPawa.bitWallet.IBalance.BalanceResponse;
import com.betPawa.bitWallet.IBalance.BalanceResponse.Statement;
import com.betPawa.bitWallet.common.model.BitWalletAccount;
import com.betPawa.bitWallet.common.model.BitWalletId;



public class Transformer {
	
 public static BitWalletAccount getBitWalletAccount(BalanceRequest request) {
	 BitWalletAccount acount= new BitWalletAccount();
	 BitWalletId bitWalletId= new BitWalletId();
	 bitWalletId.setId(request.getUserId());
	 acount.setBitWalletId(bitWalletId);
	return acount;
 }
 public static BalanceResponse getBalanceResponse(Stream<BitWalletAccount> stream) {
	 Set<BalanceResponse.Statement> stmts= new HashSet<BalanceResponse.Statement>();
	 Long user=Long.MIN_VALUE;
	 stream.forEach(e->{
	     BalanceResponse.Statement.Builder builder= BalanceResponse.Statement.newBuilder();
		 builder.setAmount(e.getAmount());
		 builder.setCurrencyType(e.getBitWalletId().getCurrency().name());
		Statement stmt= builder.build();
		stmts.add(stmt);
		
		
	 });
	 
	 BalanceResponse balanceRespons= BalanceResponse.newBuilder().addAllStatement(stmts).build();
	
	return balanceRespons;
 }
 
}
