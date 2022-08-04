package com.demoproj.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfirgureEmployee.class);

        Employee employee=context.getBean(Employee.class);

        Student student=context.getBean(Student.class);
        student.setName("Sagar");
        student.getName();
        employee.setName("Manoj");
        employee.getName();
    }
}
