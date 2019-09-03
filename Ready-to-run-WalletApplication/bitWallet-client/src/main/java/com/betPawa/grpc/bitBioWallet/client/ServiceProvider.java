package com.betPawa.grpc.bitBioWallet.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.betPawa.bitWallet.BitWallletServiceGrpc;
import com.betPawa.bitWallet.BitWallletServiceGrpc.BitWallletServiceBlockingStub;
import com.betPawa.bitWallet.IBalance.BalanceRequest;
import com.betPawa.bitWallet.IBalance.BalanceResponse;
import com.betPawa.bitWallet.IBalance.BalanceResponse.Statement;
import com.betPawa.bitWallet.IDeposit.DepositRequest;
import com.betPawa.bitWallet.IDeposit.EmpltyResponse;
import com.betPawa.bitWallet.IWithdraw.WithdrawRequest;
import com.betPawa.bitWallet.IWithdraw.WithdrawResponse;
import com.google.protobuf.GeneratedMessageV3;

public class ServiceProvider implements BitWalletService {

   private static final long serialVersionUID = 1L;
   private static final Logger LOGGER =LoggerFactory.getLogger(ServiceProvider.class);
   private BitWallletServiceBlockingStub bitBioWalletStub;
   public ServiceProvider( BitWallletServiceBlockingStub bitBioWalletStub) {
	this.bitBioWalletStub=bitBioWalletStub;
    }
   
   public static ServiceProvider getInstance(BitWallletServiceBlockingStub stub) {
	   return new ServiceProvider(stub);
   }

   @Override
	public  EmpltyResponse deposit(DepositRequest request) {
		 EmpltyResponse  response=null;
			try {
				 LOGGER.info("User: "+request.getUserId()+" started deposite transaction");
				//response =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).setCurrency("CAD").setUserId(userId).build());
				response =bitBioWalletStub.deposit(request);
				 LOGGER.info("User: "+request.getUserId()+" Ended deposite transaction Succesfully");  
			  }catch (Exception e) {
				  LOGGER.error("User: "+request.getUserId()+" Failed deposite transaction "+e.getMessage());  
			}
			return response;
	}

	@Override
	public WithdrawResponse withdraw(WithdrawRequest request)  {
		WithdrawResponse  response=null;
		try {
			
			 LOGGER.info("User: "+request.getUserId()+" started Withdraw transaction");
			response =bitBioWalletStub.withdraw(request);	
			LOGGER.info(" Withdrawl->OK");
             LOGGER.info("User :"+request.getUserId()+" Ended Withdraw transaction Succesfully"); 
		  }catch (Exception e) {
			  
			  LOGGER.error("User :"+request.getUserId()+" Failed Withdraw transaction "+e.getMessage()); 
			
		}
		return response;
	}

	@Override
	public BalanceResponse balance(BalanceRequest request) {
		BalanceResponse response =null;
		try {
			
			 LOGGER.info("User: "+request.getUserId()+" started Balance transaction");
			 response= bitBioWalletStub.balance(request);
			  LOGGER.info("User :"+request.getUserId()+" Ended Balance transaction Succesfully"); 
		  }catch (Exception e) {
			  
			  LOGGER.error("User "+request.getUserId()+" Failed Balance transaction "+e.getMessage());
			
		}
		return response;
	 
	}
	
}
