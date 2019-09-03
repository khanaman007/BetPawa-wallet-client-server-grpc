package com.betPawa.bitWallet.common.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.betPawa.bitWallet.common.CurrencyType;
import com.betPawa.bitWallet.common.TransactionType;

@Entity
@Table(name = "BIT_WALLET_ACCOUNT_TRANSACTION")
public class BitWalletTransaction implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	long id;
	@Column(name = "BIT_WALLET_ID", unique = true, nullable = false)
	private Long bitWalletId;
	@Column(name = "WALLET_AMOUNT", unique = true, nullable = false)
	private double amount;
	@Column(name = "CURRENCY_NAME")
    @Enumerated(EnumType.STRING)
	private CurrencyType currency;
	@Column(name = "TIMESTAMP", nullable = false)
	private LocalDateTime dateTime;
	@Column(name = "TRANSACTION", nullable = false)
	 @Enumerated(EnumType.STRING)
	private TransactionType transactionType;
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public CurrencyType getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyType currency) {
		this.currency = currency;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	
}
