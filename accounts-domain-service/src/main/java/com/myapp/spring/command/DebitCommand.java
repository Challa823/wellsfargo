package com.myapp.spring.command;

public class DebitCommand extends BaseCommand<String> {

	private final Double accountBalance;
	public DebitCommand(String id,Double accountBalance) {
		super(id);
		
		this.accountBalance = accountBalance;
		// TODO Auto-generated constructor stub
	}

	
	
	
}
