package com.kw.acedemy;

public class Parent {

	private String name;
	
	private String from;
	
	private boolean wallet;
	
	Parent()
	{
		
	}
	
	Parent(String _name,String _from,boolean _wallet)
	{
		this.name = _name;
		this.from = _from;
		this.wallet = _wallet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public boolean isWallet() {
		return wallet;
	}

	public void setWallet(boolean wallet) {
		this.wallet = wallet;
	}
	
	
}
