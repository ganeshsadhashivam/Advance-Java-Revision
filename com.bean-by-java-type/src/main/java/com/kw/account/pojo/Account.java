package com.kw.account.pojo;

public class Account {

	private String name;
	
	private String accNo;
	
	private int mobileNo;
	
	private double balance;
	
	private String accType;
	
	private double openingCash;
	
	private boolean accCreation;
	
	private int total;

	public Account(String name, String accNo, int mobileNo, String accType,double openingCash) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.mobileNo = mobileNo;
		
		this.accType = accType;
		this.openingCash = openingCash;
		
		
		// Validation: Minimum 500 to create account
        if ((accType == "current") && openingCash < 4900) {
            throw new IllegalArgumentException("Minimum balance to open a Current Account is 5000");
        }
        else if((accType == "savings") && openingCash < 499)
        {
        	throw new IllegalArgumentException("Minimum balance to open a Savings Account is 500");
        	
        }
        else
        {
        	accCreation = true;
        	total+=balance+openingCash;
        }
	}
	
	public void isAccountCreated()
	{
		
			System.out.println( accType + " Account creation is " + accCreation + " balance is " + total);
		
	}
}
