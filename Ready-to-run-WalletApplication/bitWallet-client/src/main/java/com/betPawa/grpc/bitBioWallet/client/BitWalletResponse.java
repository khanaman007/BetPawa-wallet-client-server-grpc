package com.betPawa.grpc.bitBioWallet.client;

import java.io.Serializable;
import java.util.List;

import com.betPawa.bitWallet.IBalance.BalanceResponse;
import com.betPawa.bitWallet.IBalance.BalanceResponse.Statement;
import com.google.protobuf.GeneratedMessageV3;

public class BitWalletResponse implements Serializable {
  private List<GeneratedMessageV3> responseList=null;
  private long userId;
  public BitWalletResponse(List<GeneratedMessageV3> responseList,long userId) {
	  this.responseList=responseList;
	  this.userId=userId;
  }
  
  @Override
  
  public String  toString() {
	  StringBuilder sb= new StringBuilder();
	  
	   
	  sb.append("\n"+" UserId :"+userId+"\n");
	  sb.append("Statement"+ "{"+"\n");
	 for(GeneratedMessageV3 message: responseList) {
		   if(message instanceof BalanceResponse) {
			   BalanceResponse local=(BalanceResponse)message;
			   sb.append("["+"\n");
			   for(BalanceResponse.Statement stmt:local.getStatementList()) {
			     sb.append(" Balance :"+ stmt.getAmount()+ " "+stmt.getCurrencyType()+"\n"); 
			   }
			   sb.append("]"+"\n");
		   }
	      
	  }
	 sb.append("}"+"\n");
	  return sb.toString();
	  
  }
}
