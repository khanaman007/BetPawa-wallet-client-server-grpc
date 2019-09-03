package com.betPawa.bitWallet;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.betPawa.bitWallet.BitWallletWithdrawServiceGrpc.BitWallletWithdrawServiceImplBase;
import com.betPawa.bitWallet.IWithdraw.WithdrawRequest;
import com.betPawa.bitWallet.IWithdraw.WithdrawResponse;
import com.betPawa.bitWallet.common.dao.BitWalletWithdrawRepository;
import com.betPawa.bitWallet.util.Transformer;

import io.grpc.stub.StreamObserver;
@GRpcService
public class BitWallletWithdrawServiceImpl extends BitWallletWithdrawServiceImplBase {
  @Autowired private BitWalletWithdrawRepository repso;
  private static final Logger LOGGER =LoggerFactory.getLogger(BitWallletWithdrawServiceImpl.class); 
	public BitWallletWithdrawServiceImpl() {
		// TODO Auto-generated constructor stub
	}
 
@Override
	public void withdraw(WithdrawRequest request, StreamObserver<WithdrawResponse> responseObserver) {
	try {
		repso.withdraw(Transformer.getBitWalletAccount(request),responseObserver);
		} catch (Exception e) {
		
		LOGGER.error("Withdrawal - Failed");
		}

	}
}
