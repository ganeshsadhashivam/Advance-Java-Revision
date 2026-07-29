package com.primaryandqualifierannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.SpringConfig;
import com.kodewala.service.StudentService;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext iocContainer = new AnnotationConfigApplicationContext(SpringConfig.class);
   
    
     StudentService   studentService= iocContainer.getBean(StudentService.class);
     
     studentService.displayStudentDetails();
    }
}
