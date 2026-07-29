package com.singleton.pattern;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterestCalculation int1 = InterestCalculation.getInstance();
		
		InterestCalculation int2 = InterestCalculation.getInstance();
		
		InterestCalculation int3 = InterestCalculation.getInstance();
	
		System.out.println(int1 == int2);
		
		
		
	}

}
