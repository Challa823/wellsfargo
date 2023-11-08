package com.myapp.spring.domain.aggregate;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class AccountEntityAggregate {
	
	@AggregateIdentifier
	private String id;
	
	private Double balance;
	
	private Status status;
	
	
	private Currency currency;
	
	
	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public Double getBalance() {
		return balance;
	}





	public void setBalance(Double balance) {
		this.balance = balance;
	}





	

	




	public Currency getCurrency() {
		return currency;
	}





	public void setCurrency(Currency currency) {
		this.currency = currency;
	}






	public Status getStatus() {
		return status;
	}





	public void setStatus(Status status) {
		this.status = status;
	}





	@Override
	public String toString() {
		return "AccountEntityAggregate [id=" + id + ", balance=" + balance + ", status=" + status + ", currency="
				+ currency + "]";
	}






	private enum Currency{
		INR,USD
	}
	
	private enum Status{
		HOLD,COMPLETED
	}

}
