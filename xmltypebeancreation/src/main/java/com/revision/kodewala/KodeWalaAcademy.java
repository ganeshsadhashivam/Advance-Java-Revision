package com.revision.kodewala;

public class KodeWalaAcademy {

	private String name;
	
	private int yearOfPassOut;
	
	private double totalFeesPaid;
	
	private double pendingAmountToPay;

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
