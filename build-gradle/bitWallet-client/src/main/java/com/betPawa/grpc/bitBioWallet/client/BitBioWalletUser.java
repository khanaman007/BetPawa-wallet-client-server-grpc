package com.betPawa.grpc.bitBioWallet.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.GeneratedMessageV3;

import io.grpc.ManagedChannel;


public class BitBioWalletUser {
	private static final Logger LOGGER =LoggerFactory.getLogger(BitBioWalletUser.class);
	private  long userId;
	private ExecutorService threadPool;
	private ManagedChannel managedChannel;
	public ManagedChannel getManagedChannel() {
		return managedChannel;
	}
	public long getUserId() {
		return userId;
	}
	public BitBioWalletUser(long userId,ExecutorService threadPool,ManagedChannel managedChannel){
		this.userId=userId;
		this.threadPool=threadPool;
		this.managedChannel =managedChannel;
		
	}
	public BitBioWalletUser(){
		
	}
 
  public Future<BitWalletResponse> starRound(BitWalletRequest request){
	  LOGGER.info("User-> "+userId+" initiated his transaction");
	  BitWalletResponse bitWalletResponse=null;
	  Future<BitWalletResponse> future=null;;
	try {
		   future= threadPool.submit(request);
		   
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		 this.threadPool.shutdown();
	  }
	  
	  LOGGER.info("User-> "+userId+" ended his transaction");
	  return future;
  }
  
  
}
