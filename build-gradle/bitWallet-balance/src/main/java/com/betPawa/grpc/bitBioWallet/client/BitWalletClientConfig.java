package com.betPawa.grpc.bitBioWallet.client;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.google.protobuf.GeneratedMessageV3;

@Configuration
public class BitWalletClientConfig {
	@Value("${concurrent.users}")
    private String concurrentUsers;
	@Value("${concurrent.threads.per.user}")
	private String concurrentThreads;
	@Value("${rounds.per.thread}")
	private String roundsPerThread;
	
	@Bean
	 public  BitBioWalletClient[] users() {
		 BitBioWalletClient[] pool = new  BitBioWalletClient[Integer.parseInt(concurrentUsers)];
	     for(int ii=0;ii< pool.length;ii++) {
	    	 pool[ii]= new BitBioWalletClient(ii+1);
	     }
		 return pool;
	 
	 }
	@Bean
	 public  BitBioWalletClient bitBioWalletClient() {
		
	     
		 return new BitBioWalletClient();
	 
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
	 public  Round round() {
		 Round rounds =new Round();
		/*
		 * Queue<GeneratedMessageV3> queue=message();
		 * queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").
		 * build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00)
		 * .build());
		 * queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").
		 * build()); queue.offer(BalanceRequest.newBuilder().build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00)
		 * .build()); queue.offer(BalanceRequest.newBuilder().build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00)
		 * .build()); //response
		 * =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).
		 * setCurrency("CAD").setUserId(userId).build());
		 * //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).
		 * setCurrency(currency).setAmount(amount).build());
		 * 
		 * rounds.setMessage(queue);
		 */
	   return rounds;
	 
	 }
	 @Bean("ROUND_A")
	 public  Round roundA() {
		 Round rounds =new Round();
		/*
		 * Queue<GeneratedMessageV3> queue=message();
		 * queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").
		 * build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00)
		 * .build());
		 * queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").
		 * build()); queue.offer(BalanceRequest.newBuilder().build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00)
		 * .build()); queue.offer(BalanceRequest.newBuilder().build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00)
		 * .build()); //response
		 * =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).
		 * setCurrency("CAD").setUserId(userId).build());
		 * //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).
		 * setCurrency(currency).setAmount(amount).build()); //Round rounds =new
		 * Round(); rounds.setMessage(queue);
		 */
	   return rounds;
	 
	 }
	 @Bean("ROUND_B")
	 public  Round roundB() {
		 Round rounds =new Round();
		/*
		 * Queue<GeneratedMessageV3> queue=message();
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("GBP").setAmount(200.00)
		 * .build());
		 * queue.offer(DepositRequest.newBuilder().setAmount(300.00).setCurrency("GBP").
		 * build());
		 * queue.offer(WithdrawRequest.newBuilder().setAmount(100.00).setCurrency("GBP")
		 * .build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("GBP").setAmount(100.00)
		 * .build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("GBP").setAmount(100.00)
		 * .build()); //response
		 * =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).
		 * setCurrency("CAD").setUserId(userId).build());
		 * //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).
		 * setCurrency(currency).setAmount(amount).build()); //Round rounds =new
		 * Round(); rounds.setMessage(queue);
		 */
	   return rounds;
	 
	 }
	 @Bean("ROUND_C")
	 public  Round roundC() {
		 Round rounds =new Round();
		/*
		 * Queue<GeneratedMessageV3> queue=message();
		 * queue.offer(BalanceRequest.newBuilder().build());
		 * queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").
		 * build());
		 * queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").
		 * build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(100.00)
		 * .build());
		 * queue.offer(DepositRequest.newBuilder().setAmount(100.00).setCurrency("USD").
		 * build()); queue.offer(BalanceRequest.newBuilder().build());
		 * queue.offer(WithdrawRequest.newBuilder().setCurrency("USD").setAmount(200.00)
		 * .build()); queue.offer(BalanceRequest.newBuilder().build());
		 * 
		 * //response
		 * =bitBioWalletStub.deposit(DepositRequest.newBuilder().setAmount(23.98).
		 * setCurrency("CAD").setUserId(userId).build());
		 * //bitBioWalletStub.withdraw(WithdrawRequest.newBuilder().setUserId(id).
		 * setCurrency(currency).setAmount(amount).build()); // Round rounds =new
		 * Round(); rounds.setMessage(queue);
		 */
	   return rounds;
	 
	 }
	 @Bean
	 public  Round[] rounds() {
		 
		 Round[]  rounds =new Round[Integer.parseInt(roundsPerThread)];
		 for(Round local:rounds) {
			 local= round();
		 }
		 
			 
	   return rounds;
	 
	 }

}
