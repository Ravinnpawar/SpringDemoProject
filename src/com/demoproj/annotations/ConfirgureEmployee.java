package com.demoproj.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(AnnotationSpring.class)
public class ConfirgureEmployee {
    @Bean
    @Scope("singleton")
    public Employee employee(){
        return new Employee(pEmployee());
    }
    @Bean
    public PEmployee pEmployee(){
        return new PEmployee();
    }
}
