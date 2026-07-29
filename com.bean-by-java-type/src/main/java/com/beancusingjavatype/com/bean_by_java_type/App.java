package com.beancusingjavatype.com.bean_by_java_type;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import org.springframework.context.ApplicationContext;

import com.kw.account.pojo.SavingsAccount;
import com.kw.bean.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        SavingsAccount s = (SavingsAccount) context.getBean("sa");
        
        s.isAccountCreated();
        
        SavingsAccount s1 = (SavingsAccount) context.getBean("ca");
        
        s1.isAccountCreated();
    }
}
