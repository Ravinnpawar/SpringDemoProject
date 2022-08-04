package com.demoproj.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationContextClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AnnotationSpring.class);
        Student student = context.getBean(Student.class);
        student.setName("Aniket!");
        student.getName();
    }
}
