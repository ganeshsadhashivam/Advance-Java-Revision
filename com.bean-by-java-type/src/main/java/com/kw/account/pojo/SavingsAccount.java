package com.kw.account.pojo;

public class SavingsAccount extends Account{

	private double minimumBalance;

	public SavingsAccount(String name, String accNo, int mobileNo, String accType,double minimumBalance) {
		super(name, accNo, mobileNo, accType, minimumBalance);
		// Validation: Minimum 500 to create account
//        if (balance < 500) {
//            throw new IllegalArgumentException("Minimum balance to open a Savings Account is 500");
//        }
        this.minimumBalance = minimumBalance;
		
	}
	
	
	
	
	
}
