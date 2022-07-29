package com.demoproj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <!-- A simple bean definition -->
   <bean id = "..." class = "...">
      <!-- collaborators and configuration for this bean go here -->
   </bean>

   <!-- A bean definition with lazy init set on -->
   <bean id = "..." class = "..." lazy-init = "true">
      <!-- collaborators and configuration for this bean go here -->
   </bean>

   <!-- A bean definition with initialization method -->
   <bean id = "..." class = "..." init-method = "...">
      <!-- collaborators and configuration for this bean go here -->
   </bean>

   <!-- A bean definition with destruction method -->
   <bean id = "..." class = "..." destroy-method = "...">
      <!-- collaborators and configuration for this bean go here -->
   </bean>

   <!-- more bean definitions go here -->
   
</beans>
*/
//Application context is built on top of beanfactory - 
//Beanfactory creates object when you request for a object using getbeans method.
//Where application context crreates an object even if you not request.
public class SpringDemo implements InitializingBean {

	public static void main(String[] args) {
		/*
		 * Student student=new Student(); student.setAddress("Pune");
		 * student.setAge(30); student.setName("Name"); student.setRollNo(122);
		 */
		
		Resource resource=new  ClassPathResource("vehiclesbean.xml");
		
		//BeanFactory beanFactory=new XmlBeanFactory(resource);
		
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("vehiclesbean.xml");
		
		Vehicle vehicle=(Vehicle)applicationContext.getBean("vehicle");
		vehicle.setVehicleName("Hero");
		vehicle.getVehicleName();

		applicationContext.registerShutdownHook();

		/*Vehicle vehicle1=(Vehicle)applicationContext.getBean("vehicle");
		vehicle1.setVehicleName("Honda");
		vehicle1.getVehicleName();
*/

		//Student student3=(Student)applicationContext.getBean("student1",Student.class);
		
		//System.out.println("Student 1 details : "+student2.getName());
		//System.out.println("Student 2 Details"+student3.getAge());	
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("All Properties are set in init");
	}
}
