package com.betPawa.bitWallet.common.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;







@Entity
@Table(name = "BIT_WALLET_ACCOUNT")
public class BitWalletAccount implements Serializable {
	private static final long serialVersionUID = -1798070786993154676L;
	
	@EmbeddedId
	private BitWalletId bitWalletId;
    @Column(name = "WALLET_AMOUNT")
	private double amount;
    public BitWalletAccount() {}
	
    public BitWalletAccount(BitWalletId bitWalletId,double amount) {
    	this.bitWalletId=bitWalletId;
    	this.amount =amount;
    }
    
    
    
    public BitWalletId getBitWalletId() {
		return bitWalletId;
	}
	@EmbeddedId
	public void setBitWalletId(BitWalletId bitWalletId) {
		this.bitWalletId = bitWalletId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
	
	    
}
