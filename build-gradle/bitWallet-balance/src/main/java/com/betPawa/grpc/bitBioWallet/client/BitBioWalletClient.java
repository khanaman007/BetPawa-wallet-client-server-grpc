package com.betPawa.grpc.bitBioWallet.client;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.betPawa.bitWallet.BitWallletBalanceServiceGrpc;
import com.betPawa.bitWallet.IBalance.BalanceRequest;
import com.betPawa.bitWallet.IBalance.BalanceResponse;

import com.google.protobuf.GeneratedMessageV3;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class BitBioWalletClient {
	private  long userId;
	public long getUserId() {
		return userId;
	}
	public BitBioWalletClient(long userId){
		this.userId=userId;
		
	}
	public BitBioWalletClient(){
		
	}
	
	@Autowired
	@Qualifier("BITWALLET_THREADPOOL")
	private ExecutorService threadPool;
	
	
	
	
	private static final Logger LOGGER =LoggerFactory.getLogger(BitBioWalletClient.class);
	 
	 private BitWallletBalanceServiceGrpc.BitWallletBalanceServiceBlockingStub bitBioWalletStub;
	 
	  @PostConstruct private void init() { ManagedChannel managedChannel =
	  ManagedChannelBuilder .forAddress("localhost", 6565).usePlaintext().build();
	  bitBioWalletStub= BitWallletBalanceServiceGrpc.newBlockingStub(managedChannel);
	  
  }
  public GeneratedMessageV3 execute(com.google.protobuf.GeneratedMessageV3 message) {
	  GeneratedMessageV3 response=null;
		/*
		 * if(message instanceof DepositRequest) { DepositRequest
		 * request=(DepositRequest) message;
		 * response=deposit(request.toBuilder().setUserId(userId).build()); }else
		 * if(message instanceof WithdrawRequest) { WithdrawRequest
		 * request=(WithdrawRequest) message;
		 * response=withdraw(request.toBuilder().setUserId(userId).build()); }else
		 * if(message instanceof BalanceRequest) { BalanceRequest
		 * request=(BalanceRequest) message;
		 * response=balance(request.toBuilder().setUserId(userId).build()); }
		 */
		 
	  return response;
  }
  public List<Future<GeneratedMessageV3>> starRound(Round[] rounds){
	  List<Future<GeneratedMessageV3>> futures= new ArrayList<Future<GeneratedMessageV3>>(rounds.length);
	  for(int ii=0;ii<rounds.length;ii++) {
		  Future<GeneratedMessageV3> future= threadPool.submit(rounds[ii]);
		  futures.add(future);
	  }
	  return futures;
  }
	/*
	 * public EmpltyResponse deposit(DepositRequest request) { EmpltyResponse
	 * response=null; try {
	 * 
	 * //response
	 * =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).
	 * setCurrency("CAD").setUserId(userId).build()); response
	 * =bitBioWalletStub.deposit(request);
	 * 
	 * }catch (Exception e) { throw new RuntimeException(e.getMessage()); } return
	 * response; } public WithdrawResponse withdraw(WithdrawRequest request) {
	 * WithdrawResponse response=null; try {
	 * 
	 * //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).
	 * setCurrency(currency).setAmount(amount).build()); response
	 * =bitBioWalletStub.withdraw(request); }catch (Exception e) { throw new
	 * RuntimeException(e.getMessage());
	 * 
	 * } return response; } public BalanceResponse balance(BalanceRequest request) {
	 * BalanceResponse response =null; try {
	 * 
	 * // response=
	 * bitBioWalletStub.balance(BalanceRequest.newBuilder().setUserId(id).build());
	 * response= bitBioWalletStub.balance(request); }catch (Exception e) { throw new
	 * RuntimeException(e.getMessage());
	 * 
	 * } return response; }
	 */
}
