package com.demoproj;

import com.demoproj.autowire.AutoWired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredDemo {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("autowiringbean.xml");

        AutoWired autoWired=context.getBean("AutoWired",AutoWired.class);
        autoWired.display();
    }
}
