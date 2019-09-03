package com.betPawa.grpc.bitBioWallet.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@PropertySource("classpath:/application.properties")
@Component
public class BitWalletApplicationRunner implements ApplicationRunner {
	private static final Logger LOGGER =LoggerFactory.getLogger(BitWalletApplicationRunner.class);
	@Autowired
	private BitBioWalletUser[] users;
	public BitBioWalletUser[] getUsers() {
		return users;
	}
	public void setUsers(BitBioWalletUser[] users) {
		this.users = users;
	}
	
	
	
	
  public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
	  
	  ConfigurableApplicationContext context=SpringApplication.run(BitWalletApplicationRunner.class, args);
	  BitWalletApplicationRunner app= context.getBean(BitWalletApplicationRunner.class);
	  BitWalletClientConfig config= context.getBean(BitWalletClientConfig.class);
	  //app.IntegrationTest(context);
	  app.start(config);
	  
  }

	
	  private void start(BitWalletClientConfig config) {
		 Set<Round> rounds=config.rounds();
		  BitWalletRequest request=null;
		  Set< Future<BitWalletResponse>> futures= new HashSet<Future<BitWalletResponse>>();
		  for(BitBioWalletUser user:users) {
			 request= new BitWalletRequest();
			  rounds=config.rounds();
			  request.SetRounds(rounds);
			  Future<BitWalletResponse> futureResponse=  request.accept(user);
			  futures.add(futureResponse);
			  }
		    for( Future<BitWalletResponse> future:futures) {
		    	try {
					BitWalletResponse response=future.get();
					LOGGER.info(response.toString());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		    
	  }
	 
private void IntegrationTest(ConfigurableApplicationContext context) throws InterruptedException, ExecutionException {
	BitWalletClientConfig config= context.getBean(BitWalletClientConfig.class);
	BitWalletRequest request= new BitWalletRequest();
	Set<Round> rounds= new HashSet<Round>();
	Round round =config.IntegartionRound();
	rounds.add(round);
	request.SetRounds(rounds);
	Future<BitWalletResponse>  future=request.accept(users[0]);
	LOGGER.info(future.get().toString());
   //BitWalletResponse response=users[0].starRound(request);
	
	
		
	}
@Override
public void run(ApplicationArguments args) throws Exception {
	
	
}
}
