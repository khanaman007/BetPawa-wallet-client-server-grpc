package com.betPawa.grpc.bitBioWallet.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.betPawa.bitWallet.BitWallletServiceGrpc;
import com.betPawa.bitWallet.BitWallletServiceGrpc.BitWallletServiceBlockingStub;
import com.betPawa.bitWallet.IBalance.BalanceRequest;
import com.betPawa.bitWallet.IBalance.BalanceResponse;
import com.betPawa.bitWallet.IBalance.BalanceResponse.Statement;
import com.betPawa.bitWallet.IDeposit.DepositRequest;
import com.betPawa.bitWallet.IWithdraw.WithdrawRequest;
import com.betPawa.bitWallet.IWithdraw.WithdrawResponse;
import com.google.protobuf.GeneratedMessageV3;


public class Round  {
	private static final Logger LOGGER =LoggerFactory.getLogger(Round.class);
   private Queue<GeneratedMessageV3> message;
   private BitBioWalletUser bitBioWalletClient;
   private String roundName;
   


public String getRoundName() {
	return roundName;
}

public void setRoundName(String roundName) {
	this.roundName = roundName;
}

public Queue<GeneratedMessageV3> getMessage() {
		return message;
	}

public void setMessage(Queue<GeneratedMessageV3> message) {
	this.message = message;
}

public BitBioWalletUser getBitBioWalletClient() {
	return bitBioWalletClient;
}

public void setBitBioWalletClient(BitBioWalletUser bitBioWalletClient) {
	this.bitBioWalletClient = bitBioWalletClient;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((roundName == null) ? 0 : roundName.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Round other = (Round) obj;
	if (roundName == null) {
		if (other.roundName != null)
			return false;
	} else if (!roundName.equals(other.roundName))
		return false;
	return true;
}


	public  List<GeneratedMessageV3>  play(BitBioWalletUser bitBioWalletClient) throws Exception {
	   long userId=bitBioWalletClient.getUserId();
	   LOGGER.info("User: "+userId+" is playing "+roundName+ "  Round");
	   BitWallletServiceBlockingStub stub = BitWallletServiceGrpc.newBlockingStub(bitBioWalletClient.getManagedChannel());
	   List<GeneratedMessageV3> responseList=new ArrayList<GeneratedMessageV3>(message.size());
	   while(message.isEmpty()==false) {
			
		   GeneratedMessageV3 request=this.message.poll();
			try {
				GeneratedMessageV3 response=execute(request,stub,userId);
				responseList.add(response);
			
			}catch(Exception ex) {
				LOGGER.error(ex.getMessage());
			}
			
		}
		
	   return responseList;
	}
 
	private GeneratedMessageV3 execute(GeneratedMessageV3 message,BitWallletServiceBlockingStub stub,long userId ) {
		  GeneratedMessageV3 response=null;
		   ServiceProvider serviceProvider= ServiceProvider.getInstance(stub);
		 if(message instanceof DepositRequest) {
			 DepositRequest request=(DepositRequest) message;
			 
			  response=serviceProvider.deposit(request.toBuilder().setUserId(userId).build());
		  }else if(message instanceof WithdrawRequest) {
			 
			  WithdrawRequest request=(WithdrawRequest) message;
			  WithdrawResponse withdrawResponse=serviceProvider.withdraw(request.toBuilder().setUserId(userId).build());
			  
			  response =withdrawResponse;
		  }else if(message instanceof BalanceRequest) {
			  BalanceRequest request=(BalanceRequest) message;
			  response =serviceProvider.balance(request.toBuilder().setUserId(userId).build());
			 
		  }
		  
			 
		  return response;
	  }
}
