package com.betPawa.bitWallet.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.betPawa.bitWallet.common.CurrencyType;







@Entity
@Table(name = "BIT_WALLET_ACCOUNT")
public class BitWalletAccount {
	public Long getBitWalletId() {
		return bitWalletId;
	}
	public void setBitWalletId(Long bitWalletId) {
		this.bitWalletId = bitWalletId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BIT_WALLET_ID")
	private Long bitWalletId;
    @Column(name = "WALLET_AMOUNT")
	private double amount;
	@Column(name = "CURRENCY_NAME")
    @Enumerated(EnumType.STRING)
	private CurrencyType currency;
	public CurrencyType getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyType currency) {
		this.currency = currency;
	}
	

}
