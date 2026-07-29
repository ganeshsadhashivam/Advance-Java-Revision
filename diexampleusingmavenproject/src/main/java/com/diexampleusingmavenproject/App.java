package com.diexampleusingmavenproject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.constructorinjection.SpringConfigOfConstructorInjection;
import com.fieldinjection.SpringConfigOfFieldInjection;
import com.setterinjection.InstituteOfSetterInjection;
import com.setterinjection.SpringConfigOfSetterInjection;
import com.constructorinjection.Institute;



import com.fieldinjection.InstituteOfFieldInjection;

public class App 
{
    public static void main( String[] args )
    {
    	
    	/*
    	 * for constructor based injection
    	 */
        ApplicationContext iocContainerForCI = new AnnotationConfigApplicationContext(SpringConfigOfConstructorInjection.class);
        
       Institute instituteBean =(Institute) iocContainerForCI .getBean("BeanOfInstitute");
       
    	
    	System.out.println(instituteBean  );
        
    	/*
    	 * for setter based injection
    	 */
        ApplicationContext iocContainerForSI = new AnnotationConfigApplicationContext(SpringConfigOfSetterInjection.class);
        
        InstituteOfSetterInjection createdBeanUsingSI = (InstituteOfSetterInjection) iocContainerForSI.getBean("BeanOfInstitute");
       
    	
    	 System.out.println(createdBeanUsingSI );
    	
    	
    	/*
    	 * for field based injection
    	 */
    	
    	ApplicationContext iocContainerForFI = new AnnotationConfigApplicationContext(SpringConfigOfFieldInjection.class);
      
      InstituteOfFieldInjection createdBeanUsingFI = ( InstituteOfFieldInjection) iocContainerForFI.getBean(InstituteOfFieldInjection.class);
     
    	
       System.out.println(createdBeanUsingFI );
       
       
       
       
    }
}
