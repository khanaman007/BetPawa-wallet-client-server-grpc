package com.betPawa.bitWallet;

import java.util.stream.Stream;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.betPawa.bitWallet.BitWallletBalanceServiceGrpc.BitWallletBalanceServiceImplBase;
import com.betPawa.bitWallet.IBalance.BalanceRequest;
import com.betPawa.bitWallet.IBalance.BalanceResponse;
import com.betPawa.bitWallet.common.dao.BitWalletBalanceRepository;
import com.betPawa.bitWallet.common.model.BitWalletAccount;
import com.betPawa.bitWallet.util.Transformer;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
@GRpcService
public class BitWallletBalanceServiceImpl extends BitWallletBalanceServiceImplBase {
  @Autowired 
  private BitWalletBalanceRepository repso;
  private static final Logger LOGGER =LoggerFactory.getLogger(BitWallletBalanceServiceImpl.class); 
	public BitWallletBalanceServiceImpl() {
		super();
	}
 @Override
	public void balance(BalanceRequest request,StreamObserver<BalanceResponse> responseObserver) { // TODO Auto-generated
		LOGGER.info("Balance Service :-> check balance for"+request.getUserId() );
		try {
			Stream<BitWalletAccount> balance =repso.balance(Transformer.getBitWalletAccount(request),responseObserver);
			BalanceResponse response=Transformer.getBalanceResponse(balance);
			responseObserver.onNext(response);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			
		}
		responseObserver.onCompleted();
	  
	}
	 
}
