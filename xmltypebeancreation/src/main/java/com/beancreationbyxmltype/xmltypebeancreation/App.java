package com.beancreationbyxmltype.xmltypebeancreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revision.kodewala.KodeWalaAcademy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String beanDef = "Beans.xml";
    	
    	
        ApplicationContext iocContainer =new ClassPathXmlApplicationContext(beanDef);
    	
    	KodeWalaAcademy kwObj		 =	(KodeWalaAcademy) iocContainer.getBean("kw");
    	
    	kwObj.display();
    }
}
