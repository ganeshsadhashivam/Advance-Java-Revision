package com.javatypebeancreation.javatypebeancreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revision.kodewala.pojo.KodeWalaAcademy;
import com.spring.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext iocContainer = new AnnotationConfigApplicationContext(SpringConfig.class);
       
       		KodeWalaAcademy	obj=(KodeWalaAcademy) iocContainer.getBean("createObjOfKw");
       		
       		obj.display();
    }
}
