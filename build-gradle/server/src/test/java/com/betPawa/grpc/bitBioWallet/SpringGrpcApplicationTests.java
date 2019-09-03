package com.betPawa.grpc.bitBioWallet;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.betPawa.bitWallet.BitWallletBalanceServiceGrpc;


import junit.framework.Assert;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=BitWallletBalanceServiceGrpc.class)
public class SpringGrpcApplicationTests {
	private static final Logger LOGGER =LoggerFactory.getLogger(SpringGrpcApplicationTests.class);
	


	/*
	 * @Test public void testDeposit() { assertThat(client.testDeposit( 67.98,
	 * "CAD")).isEqualTo("Hello John Doe!");
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
	@Test(expected = RuntimeException.class)
	 public void testBalanceUSD() { 
		LOGGER.info(" Starting testBalanceUSD");
	    try {
	    	//assertNotNull(client.balance(null,null));
		LOGGER.info(" Ending testBalanceUSD");
	    }catch(Exception exp) {
	    	LOGGER.error(exp.getMessage());
	    	throw new RuntimeException(exp);
	    }
	 }
	 
	 }
