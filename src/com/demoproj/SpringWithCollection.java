package com.demoproj;

import com.demoproj.springdi.JavaCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringWithCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionBeans.xml");
        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
