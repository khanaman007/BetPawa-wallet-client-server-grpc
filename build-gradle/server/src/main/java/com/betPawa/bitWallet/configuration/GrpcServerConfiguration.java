package com.betPawa.bitWallet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.betPawa.bitWallet.BitWallletBalanceServiceGrpc;
import com.betPawa.bitWallet.BitWallletBalanceServiceGrpc.BitWallletBalanceServiceBlockingStub;
import com.betPawa.bitWallet.BitWallletDepositServiceGrpc;
import com.betPawa.bitWallet.BitWallletDepositServiceGrpc.BitWallletDepositServiceBlockingStub;
import com.betPawa.bitWallet.BitWallletWithdrawServiceGrpc;
import com.betPawa.bitWallet.BitWallletWithdrawServiceGrpc.BitWallletWithdrawServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Configuration
public class GrpcServerConfiguration {

	@Bean(name = "BALANCE")
	public BitWallletBalanceServiceBlockingStub balanceServiceStub() {
		ManagedChannel channel =
				  ManagedChannelBuilder .forAddress("localhost", 9091).usePlaintext().build();
		BitWallletBalanceServiceBlockingStub stub = BitWallletBalanceServiceGrpc.newBlockingStub(channel);
		return stub;
	}
	@Bean(name = "DEPOSIT")
	public BitWallletDepositServiceBlockingStub depositServiceStub() {
		ManagedChannel channel =
				  ManagedChannelBuilder .forAddress("localhost", 1011).usePlaintext().build();
		BitWallletDepositServiceBlockingStub stub = BitWallletDepositServiceGrpc.newBlockingStub(channel);
		return stub;
	}
	@Bean(name = "WITHDRAW")
	public BitWallletWithdrawServiceBlockingStub withdrawServiceStub() {
		ManagedChannel channel =
				  ManagedChannelBuilder .forAddress("localhost", 1101).usePlaintext().build();
		BitWallletWithdrawServiceBlockingStub stub = BitWallletWithdrawServiceGrpc.newBlockingStub(channel);
		return stub;
	}

}
