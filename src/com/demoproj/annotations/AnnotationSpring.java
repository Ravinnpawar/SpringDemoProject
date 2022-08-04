package com.demoproj.annotations;
/*
* Sr.No.	Annotation & Description
1	@Required
The @Required annotation applies to bean property setter methods.

2	@Autowired
The @Autowired annotation can apply to bean property setter methods, non-setter methods, constructor and properties.

3	@Qualifier
The @Qualifier annotation along with @Autowired can be used to remove the confusion by specifiying which exact bean will be wired.

4	JSR-250 Annotations
Spring supports JSR-250 based annotations which include @Resource, @PostConstruct and @PreDestroy annotations.
*
* @Configuration - To configure pojo into Containers.
* @Bean -- Model class (Pojo)
* @Import
* @Scope
* @
*
* */
//Autowiring feature of spring framework enables you to inject the object dependency implicitly.
// It internally uses setter or constructor injection.
//Autowiring can't be used to inject primitive and string values. It works with reference only.
//Advantage of Autowiring
//It requires the less code because we don't need to write the code to inject the dependency explicitly.
//Disadvantage of Autowiring
//No control of programmer.


/*
* No.	            Mode	                Description
1)	                 no	                        It is the default autowiring mode. It means no autowiring bydefault.
2)	                byName	                    The byName mode injects the object dependency according to name of the bean. In such case, property name and bean name must be same. It internally calls setter method.
3)	                byType	                    The byType mode injects the object dependency according to type. So property name and bean name can be different. It internally calls setter method.
4)	                constructor	                The constructor mode injects the dependency by calling the constructor of the class. It calls the constructor having large number of parameters.
5)	                autodetect	                It is deprecated since Spring 3.
* */

import com.demoproj.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationSpring {
    @Bean
    public Student student(){
        return new Student();
    }
}
