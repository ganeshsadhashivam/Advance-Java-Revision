package com.singleton.pattern;

public class InterestCalculation {

	private static InterestCalculation intCalculation;
	
	private InterestCalculation()
	{
		
	}
	
	
	public synchronized static InterestCalculation getInstance()
	{
		if(intCalculation == null)
		{
			System.out.println("creating obj as it was null first time obj created...");
			
			intCalculation = new InterestCalculation();
		}
		else
		{
			System.out.println("obj already created");
		}
		
		return intCalculation;
	}
}
