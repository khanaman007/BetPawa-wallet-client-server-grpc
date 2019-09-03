package com.betPawa.bitWallet;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@SpringBootApplication
@PropertySource("classpath:/application.properties")
public class DepositApplicationRunner {
	
 
  public static void main(String[] args) throws InterruptedException, IOException {
	 
	  ConfigurableApplicationContext context=SpringApplication.run(DepositApplicationRunner.class, args);
		/*
		 * BitWallletDepositServiceImpl service =
		 * context.getBean(BitWallletDepositServiceImpl.class, args);
		 * //BitWallletDepositServiceImpl service= new BitWallletDepositServiceImpl();
		 * Server server=
		 * ServerBuilder.forPort(Integer.valueOf(service.getPort())).addService(service)
		 * .build(); server.start(); server.awaitTermination();
		 */
  
  }
}
