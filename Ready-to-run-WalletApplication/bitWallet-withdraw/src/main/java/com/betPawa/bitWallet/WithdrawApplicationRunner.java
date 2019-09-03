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

public class WithdrawApplicationRunner {

  public static void main(String[] args) throws IOException, InterruptedException {
	  ConfigurableApplicationContext context=SpringApplication.run(WithdrawApplicationRunner.class, args);
	    
  }
}
