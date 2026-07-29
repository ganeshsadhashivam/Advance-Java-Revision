package com.javatypebeancreation.singletonusingmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.Payment;
import com.kodewala.config.SpringConfig;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Payment pObj=(Payment) iocContainer.getBean("Payment");
        
        System.out.println(pObj.getPaymentReference());
        
//        ApplicationContext iocContainer2 = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Payment pObj2=(Payment) iocContainer.getBean("Payment");
        
        System.out.println(pObj2.getPaymentReference());
        
        System.out.println(pObj2 == pObj);
    }
}
