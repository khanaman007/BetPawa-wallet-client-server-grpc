package com.betPawa.grpc.bitBioWallet.client;

import java.util.Queue;
import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.protobuf.GeneratedMessageV3;

@Component
public class Round implements Callable<GeneratedMessageV3> {
   @Autowired
   private Queue<GeneratedMessageV3> message;
   public Queue<GeneratedMessageV3> getMessage() {
	return message;
}

public void setMessage(Queue<GeneratedMessageV3> message) {
	this.message = message;
}

public BitBioWalletClient getBitBioWalletClient() {
	return bitBioWalletClient;
}

public void setBitBioWalletClient(BitBioWalletClient bitBioWalletClient) {
	this.bitBioWalletClient = bitBioWalletClient;
}

@Autowired
   private BitBioWalletClient bitBioWalletClient;
	
   @Override
	public GeneratedMessageV3 call() throws Exception {
		while(message.isEmpty()==false) {
			GeneratedMessageV3 request=this.message.poll();
			GeneratedMessageV3 response=bitBioWalletClient.execute(request);
			return response;
		}
		
		return null;
	}

}
