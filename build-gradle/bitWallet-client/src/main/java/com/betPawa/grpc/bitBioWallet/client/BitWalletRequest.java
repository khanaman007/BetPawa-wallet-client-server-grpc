package com.betPawa.grpc.bitBioWallet.client;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.GeneratedMessageV3;

public class BitWalletRequest implements Callable<BitWalletResponse> {
	private static final Logger LOGGER =LoggerFactory.getLogger(BitWalletRequest.class);
	private Set<Round> rounds;
	private BitBioWalletUser user;
	public BitWalletRequest SetRounds(Set<Round> rounds) {
		this.rounds=rounds;
		return this;
	}
	
	
	public Set<Round> getRounds() {
		return rounds;
	}
	public BitWalletRequest getRequest() {
		return request;
	}
	private BitWalletRequest request;
   public BitWalletResponse call() throws Exception {
	   BitWalletResponse response=null;
	   List<GeneratedMessageV3> responseList=null;
	  
	    for(Round round:rounds) {
	    	  responseList=	round.play(this.user);
	    }
	    response = new BitWalletResponse(responseList,user.getUserId());
		return response;
	}
   
   public Future<BitWalletResponse> accept(BitBioWalletUser user) {
	   this.user=user;
	   Future<BitWalletResponse> response= user.starRound(this);
	    return response;
   }

}
