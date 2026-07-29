package com.beancusingxmltype.com.beanbyxmltype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kw.acedemy.Parent;
import com.kw.acedemy.Students;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String setterInjection = "SetterInjection.xml";
    	
    	String constructorInjection = "ConstructorInjection.xml";
    	
    	String beanDefinitionInheritance = "BeanDefinitionInheritance.xml";
    	
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(beanDefinitionInheritance);
    	
        /*
         * if you use setter injection this is not needed because in child class parent variables
         * are inherited so
         */
//    	 Parent pobj=(Parent) iocContainer.getBean("ParentId");
    	 
    	Students sobj= (Students) iocContainer.getBean("StudentId");
    	
    	sobj.displayStudentProfile();
    }
}
