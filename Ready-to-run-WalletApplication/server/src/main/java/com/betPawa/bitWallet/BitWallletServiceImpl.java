package com.betPawa.bitWallet;

import javax.annotation.PostConstruct;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.betPawa.bitWallet.BitWallletBalanceServiceGrpc.BitWallletBalanceServiceBlockingStub;
import com.betPawa.bitWallet.BitWallletDepositServiceGrpc.BitWallletDepositServiceBlockingStub;
import com.betPawa.bitWallet.BitWallletServiceGrpc.BitWallletServiceImplBase;
import com.betPawa.bitWallet.BitWallletWithdrawServiceGrpc.BitWallletWithdrawServiceBlockingStub;
import com.betPawa.bitWallet.IBalance.BalanceRequest;
import com.betPawa.bitWallet.IBalance.BalanceResponse;
import com.betPawa.bitWallet.IDeposit.DepositRequest;
import com.betPawa.bitWallet.IDeposit.EmpltyResponse;
import com.betPawa.bitWallet.IWithdraw.WithdrawRequest;
import com.betPawa.bitWallet.IWithdraw.WithdrawResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
@GRpcService
public class BitWallletServiceImpl extends BitWallletServiceImplBase{

	@Autowired
	@Qualifier("BALANCE")
	private BitWallletBalanceServiceBlockingStub balanceStub;
	@Autowired
	@Qualifier("WITHDRAW")
	private BitWallletWithdrawServiceBlockingStub withdrawStub;
	@Autowired
	@Qualifier("DEPOSIT")
	private BitWallletDepositServiceBlockingStub depositStub;
	public BitWallletServiceImpl() {
		
	}
	

	@Override
	public void balance(BalanceRequest request, StreamObserver<BalanceResponse> responseObserver) {
	try {
		BalanceResponse  value=balanceStub.balance(request);
		responseObserver.onNext(value);
		responseObserver.onCompleted();
		}catch(Exception ex) {
			responseObserver.onError(Status.fromThrowable(ex).asRuntimeException());
		}
	}
	@Override
	public void withdraw(WithdrawRequest request, StreamObserver<WithdrawResponse> responseObserver) {
		
		try {
			WithdrawResponse  response=withdrawStub.withdraw(request);
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}catch(Exception ex) {
			responseObserver.onError(Status.fromThrowable(ex).asRuntimeException());
		}
	}
	@Override
	public void deposit(DepositRequest request, StreamObserver<EmpltyResponse> responseObserver) {
		
		try {
			EmpltyResponse emptyResponse=depositStub.deposit(request);
			responseObserver.onNext(emptyResponse);
			responseObserver.onCompleted();
			
		}catch(Exception ex) {
			responseObserver.onError(Status.fromThrowable(ex).asRuntimeException());
		}
	}
}
