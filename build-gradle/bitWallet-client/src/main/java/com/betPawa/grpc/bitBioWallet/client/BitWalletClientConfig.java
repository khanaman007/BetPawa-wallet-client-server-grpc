package com.betPawa.grpc.bitBioWallet.client;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.betPawa.bitWallet.IBalance.BalanceRequest;
import com.betPawa.bitWallet.IDeposit.DepositRequest;
import com.betPawa.bitWallet.IWithdraw.WithdrawRequest;
import com.google.protobuf.GeneratedMessageV3;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Configuration
public class BitWalletClientConfig {
	@Value("${concurrent.users}")
    private String concurrentUsers;
	@Value("${concurrent.threads.per.user}")
	private String concurrentThreads;
	@Value("${rounds.per.thread}")
	private String roundsPerThread;
	@Value("${grpc.port}")
	private String port;
	/*
	 * @Value("${grpc.host}") private String host;
	 */
	
	@Bean("USERS")
	 public  BitBioWalletUser[] users() {
		ManagedChannel managedChannel = ManagedChannelBuilder .forAddress("localhost", Integer.parseInt(port)).usePlaintext().build();
		
		 BitBioWalletUser[] users = new  BitBioWalletUser[Integer.parseInt(concurrentUsers)];
		 int processors=Runtime.getRuntime().availableProcessors();
		 int configuredThreads=Integer.parseInt(concurrentThreads);
		 int perUserThreads=(configuredThreads<processors)? configuredThreads:processors;
	     for(int ii=0;ii< users.length;ii++) {
	    	 ExecutorService pool =Executors.newFixedThreadPool(perUserThreads);
	    	 
	    	 users[ii]= new BitBioWalletUser(ii+1,pool,managedChannel);
	     }
		 return users;
	 
	 }
	
	 @Bean("BITWALLET_THREADPOOL")
	 
	 public  ExecutorService threadPool() {
		 ExecutorService pool =Executors.newFixedThreadPool(Integer.parseInt(concurrentThreads));
	   return pool;
	 
	 }
	 @Bean
	 public  Queue<GeneratedMessageV3> message() {
		Queue<GeneratedMessageV3> queue =new ConcurrentLinkedQueue<GeneratedMessageV3>();
	   return queue;
	 
	 }
	 @Bean("ROUND")
	 @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	 public  Round round() {
		 Queue<GeneratedMessageV3> queue =new ConcurrentLinkedQueue<GeneratedMessageV3>();

		 queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00).build());
		 queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").build());
		 queue.offer(BalanceRequest.newBuilder().build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00).build());
		 queue.offer(BalanceRequest.newBuilder().build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00).build());
		 //response =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).setCurrency("CAD").setUserId(userId).build());
		 //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).setCurrency(currency).setAmount(amount).build());
		 Round rounds =new Round();
		 		 rounds.setMessage(queue);
		 		rounds.setRoundName(Thread.currentThread().getName());
	   return rounds;
	 
	 }
	 @Bean("ROUND_A")
	 @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	 public  Round roundA() {
		 Queue<GeneratedMessageV3> queue =new ConcurrentLinkedQueue<GeneratedMessageV3>();
		 queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00).build());
		 queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").build());
		 queue.offer(BalanceRequest.newBuilder().build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00).build());
		 queue.offer(BalanceRequest.newBuilder().build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00).build());
		 //response =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).setCurrency("CAD").setUserId(userId).build());
		 //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).setCurrency(currency).setAmount(amount).build());
		 Round rounds =new Round();
		 rounds.setMessage(queue);
		 rounds.setRoundName("ROUND_A");
	   return rounds;
	 
	 }
	 @Bean("ROUND_B")
	 @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	 public  Round roundB() {
		 Queue<GeneratedMessageV3> queue =new ConcurrentLinkedQueue<GeneratedMessageV3>();
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("GBP").setAmount(200.00).build());
		 queue.offer(DepositRequest.newBuilder().setAmount(300.00).setCurrency("GBP").build());
		 queue.offer(WithdrawRequest.newBuilder().setAmount(100.00).setCurrency("GBP").build());
	     queue.offer(WithdrawRequest.newBuilder().setCurrency("GBP").setAmount(100.00).build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("GBP").setAmount(100.00).build());
		 //response =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).setCurrency("CAD").setUserId(userId).build());
		 //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).setCurrency(currency).setAmount(amount).build());
		 Round rounds =new Round();
		 rounds.setRoundName("ROUND_B");
		 rounds.setMessage(queue);
	   return rounds;
	 
	 }
	 @Bean("ROUND_C")
	 @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	 public  Round roundC() {
		 Queue<GeneratedMessageV3> queue =new ConcurrentLinkedQueue<GeneratedMessageV3>();
		 queue.offer(BalanceRequest.newBuilder().build());
		 queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").build());
		 queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00).build());
		 queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").build());
		 queue.offer(BalanceRequest.newBuilder().build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00).build());
		 queue.offer(BalanceRequest.newBuilder().build());
		 
		 //response =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).setCurrency("CAD").setUserId(userId).build());
		 //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).setCurrency(currency).setAmount(amount).build());
		 Round rounds =new Round();
		 rounds.setRoundName("ROUND_C");
		 rounds.setMessage(queue);
	   return rounds;
	 
	 }
	 @Bean("INTEGRATION_TEST")
	 @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	 public  Round IntegartionRound() {
		 Queue<GeneratedMessageV3> queue =new ConcurrentLinkedQueue<GeneratedMessageV3>();
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00).build());
		 queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").build());
		 queue.offer(BalanceRequest.newBuilder().build());
		 queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00) .build()); queue.offer(BalanceRequest.newBuilder().build());
		queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("EURO").build());
		queue.offer(BalanceRequest.newBuilder().build());
		queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD"). build());
		queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00)
		.build());
		queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00).build());
		queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").build());
		queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00).build());
		queue.offer(BalanceRequest.newBuilder().build());
		queue.offer(BalanceRequest.newBuilder().build());
		queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00).build());
		 //response =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).setCurrency("CAD").setUserId(userId).build());
		 //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).setCurrency(currency).setAmount(amount).build());
		 Round rounds =new Round();
		 rounds.setRoundName("INTEGRATION_TEST");
		 rounds.setMessage(queue);
	   return rounds;
	 
	 }
	 @Bean
	 @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	 public  Set<Round> rounds() {
		 int roundsPerThreda=0;
		   try {
		  roundsPerThreda=Integer.parseInt(roundsPerThread);
		   }catch(Exception exp) {
			   
		   }
		 Set<Round> rounds= new HashSet<Round>(roundsPerThreda);
		  for(int ii=0;ii<roundsPerThreda;ii++){
			  rounds.add(round());
		  }
		 
			 
	   return rounds;
	 
	 }
	 
}
