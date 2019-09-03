package com.betPawa.bitWallet;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.betPawa.bitWallet.BitWallletDepositServiceGrpc.BitWallletDepositServiceImplBase;
import com.betPawa.bitWallet.IDeposit.DepositRequest;
import com.betPawa.bitWallet.IDeposit.EmpltyResponse;
import com.betPawa.bitWallet.common.dao.BitWalletDepositRepository;
import com.betPawa.bitWallet.common.model.BitWalletAccount;
import com.betPawa.bitWallet.util.Transformer;

import io.grpc.stub.StreamObserver;
@GRpcService
public class BitWallletDepositServiceImpl extends BitWallletDepositServiceImplBase {
  @Autowired
  private BitWalletDepositRepository repso;
  @Value("${port}")
  private String port;
  public String getPort() {
	return port;
}

private static final Logger LOGGER =LoggerFactory.getLogger(BitWallletDepositServiceImpl.class); 
	public BitWallletDepositServiceImpl() {
		// TODO Auto-generated constructor stub
	}
 
 @Override
public void deposit(DepositRequest request, StreamObserver<EmpltyResponse> responseObserver) {
	       BitWalletAccount account=null;
			LOGGER.info("server received {}", request);
			 account =Transformer.getBitWalletAccount(request);
			 repso.deposit(account,responseObserver);
			 responseObserver.onNext(EmpltyResponse.getDefaultInstance());
			 responseObserver.onCompleted();
				
}
}
