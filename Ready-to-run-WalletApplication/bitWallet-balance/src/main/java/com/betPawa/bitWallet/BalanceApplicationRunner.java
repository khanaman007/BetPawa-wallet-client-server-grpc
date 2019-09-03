package com.betPawa.bitWallet;

import java.io.IOException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@SpringBootApplication
@PropertySource("classpath:/application.properties")
@Component
public class BalanceApplicationRunner implements ApplicationRunner {

  public static void main(String[] args) throws IOException, InterruptedException {
	  ConfigurableApplicationContext context=SpringApplication.run(BalanceApplicationRunner.class, args);
	    
  }

@Override
public void run(ApplicationArguments args) throws Exception {
	// TODO Auto-generated method stub
	
}
}
