package com.betPawa.grpc.bitBioWallet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.betPawa.grpc.bitBioWallet.client.BitBioWalletUser;
import com.betPawa.grpc.bitBioWallet.client.BitWalletApplicationRunner;
import com.betPawa.grpc.bitBioWallet.client.BitWalletClientConfig;
import com.betPawa.grpc.bitBioWallet.client.Round;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=BitBioWalletUser.class)
@PropertySource("classpath:/application.properties")

public class SpringGrpcApplicationTests {
	private static final Logger LOGGER =LoggerFactory.getLogger(SpringGrpcApplicationTests.class);
	

	 
	
	/*
	 * @Test public void testDeposit() { ConfigurableApplicationContext
	 * context=SpringApplication.run(BitWalletApplicationRunner.class, new String[]
	 * {"args"}); BitWalletApplicationRunner app=
	 * context.getBean(BitWalletApplicationRunner.class); BitWalletClientConfig
	 * config= context.getBean(BitWalletClientConfig.class);; BitBioWalletUser[]
	 * user= config.users(); Round round=config.IntegartionRound(); Round
	 * rounds[]=config.rounds(); rounds[0]=round; user[0].starRound(rounds);
	 * 
	 * }
	 */
	 
	/*
	 * @Test(expected = RuntimeException.class) public void testWithdraw200USD() {
	 * LOGGER.info(" Starting testWithdraw200USD"); try {
	 * assertTrue(client.withdraw(1, 200, "USD"));
	 * LOGGER.info(" Ending testWithdraw200USD"); }catch(Exception exp) {
	 * LOGGER.error(exp.getMessage()); throw new RuntimeException(exp); } }
	 * 
	 * @Test(expected = RuntimeException.class) public void testDeposit200USD() {
	 * LOGGER.info(" Starting testDeposit200USD"); try {
	 * assertTrue(client.deposit(1, 200, "USD"));
	 * LOGGER.info(" Ending testDeposit200USD"); }catch(Exception exp) {
	 * LOGGER.error(exp.getMessage()); throw new RuntimeException(exp); } }
	 */
	/*
	 * @Test(expected = RuntimeException.class) public void testBalanceUSD() {
	 * LOGGER.info(" Starting testBalanceUSD"); try {
	 * //assertNotNull(client.balance(null,null));
	 * LOGGER.info(" Ending testBalanceUSD"); }catch(Exception exp) {
	 * LOGGER.error(exp.getMessage()); throw new RuntimeException(exp); } }
	 */
	 
	 }
