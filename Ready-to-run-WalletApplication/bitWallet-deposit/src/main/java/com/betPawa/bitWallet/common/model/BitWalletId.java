package com.betPawa.bitWallet.common.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.betPawa.bitWallet.common.CurrencyType;
@Embeddable
public class BitWalletId implements Serializable {
	
	@Column(name = "BIT_WALLET_ID", unique = true, nullable = false)
	private Long id;
	@Column(name = "CURRENCY_NAME",unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
	private CurrencyType currency;
	
	public BitWalletId(Long id,CurrencyType currency) {
		this.id =id;
		this.currency=currency;
	}
	public BitWalletId() {}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BitWalletId other = (BitWalletId) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (currency != other.currency)
			return false;
		return true;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long bitWalletId) {
		this.id = bitWalletId;
	}
	public CurrencyType getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyType currency) {
		this.currency = currency;
	}

	
	
	
}
