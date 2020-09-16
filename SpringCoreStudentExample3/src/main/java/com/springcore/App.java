package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )	
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World! Shiv" );
        ApplicationContext context =
       		 new ClassPathXmlApplicationContext("config.xml");
        StudentInfo tec=(StudentInfo)context.getBean("student");
        System.out.println(tec);
         
      
    }
}
