package com.betPawa.grpc.bitBioWallet.client;

import java.io.Serializable;

import com.betPawa.bitWallet.BitWallletServiceGrpc;
import com.betPawa.bitWallet.IBalance.BalanceRequest;
import com.betPawa.bitWallet.IBalance.BalanceResponse;
import com.betPawa.bitWallet.IDeposit.DepositRequest;
import com.betPawa.bitWallet.IDeposit.EmpltyResponse;
import com.betPawa.bitWallet.IWithdraw.WithdrawRequest;
import com.betPawa.bitWallet.IWithdraw.WithdrawResponse;

public interface BitWalletService extends Serializable {
	
	public EmpltyResponse deposit(DepositRequest request)throws Exception;
		
	 public WithdrawResponse withdraw(WithdrawRequest request)throws Exception;
		 
	 public BalanceResponse balance(BalanceRequest request)throws Exception;
		
}
