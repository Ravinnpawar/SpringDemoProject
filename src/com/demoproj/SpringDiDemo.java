package com.demoproj;

import com.demoproj.springdi.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDiDemo {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springdi.xml");
        TextEditor textEditor=(TextEditor)context.getBean("texteditor");
        textEditor.spellCheck();
    }
}
