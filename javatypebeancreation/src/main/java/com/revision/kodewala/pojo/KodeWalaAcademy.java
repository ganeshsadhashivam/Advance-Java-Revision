package com.revision.kodewala.pojo;

public class KodeWalaAcademy {

private String name;
	
	private int yearOfPassOut;
	
	private double totalFeesPaid;
	
	private double pendingAmountToPay;

	public KodeWalaAcademy(String name, int yearOfPassOut, double totalFeesPaid, double pendingAmountToPay) {
		super();
		this.name = name;
		this.yearOfPassOut = yearOfPassOut;
		this.totalFeesPaid = totalFeesPaid;
		this.pendingAmountToPay = pendingAmountToPay;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfPassOut() {
		return yearOfPassOut;
	}

	public void setYearOfPassOut(int yearOfPassOut) {
		this.yearOfPassOut = yearOfPassOut;
	}

	public double getTotalFeesPaid() {
		return totalFeesPaid;
	}

	public void setTotalFeesPaid(double totalFeesPaid) {
		this.totalFeesPaid = totalFeesPaid;
	}

	public double getPendingAmountToPay() {
		return pendingAmountToPay;
	}

	public void setPendingAmountToPay(double pendingAmountToPay) {
		this.pendingAmountToPay = pendingAmountToPay;
	}
	
	
	public void display() {
		System.out.println("Name " + name + " yearOfPassOut " + yearOfPassOut + " totalFeesPaid " +totalFeesPaid + " pendingAmountToPay " + pendingAmountToPay);
	}
}
