package com.beanscope;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.PaymentLifeCycle;
import com.kodewala.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ioc =new AnnotationConfigApplicationContext(SpringConfig.class);
        
        PaymentLifeCycle plc= (PaymentLifeCycle) ioc.getBean("PLifeCycle");
        
       System.out.println(plc.getPaymentId());
       
       /*
        * and if scope is singleton whenever we close the ioc bean will
        * be destroyed
        */
       
       /*
        * using scope prototype bean will be created every time we request
        * and we need to destroy manually plc1.destroy()
        */
       PaymentLifeCycle plc1= (PaymentLifeCycle) ioc.getBean("PLifeCycle");
       
       System.out.println(plc1.getPaymentId());
       
       
       plc1.destroy();
       
       
       ioc.close();
    }
}
