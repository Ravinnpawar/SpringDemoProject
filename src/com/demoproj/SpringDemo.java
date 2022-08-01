package com.demoproj;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/* */
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
		
		//AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("vehiclesbean.xml");

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("vehiclesbean.xml");
		
		/*Vehicle vehicle=(Vehicle)applicationContext.getBean("vehicle");
		vehicle.setVehicleName("Hero");
		vehicle.getVehicleName();*/

		Bike bike=(Bike) applicationContext.getBean("bike");

		Engine engine=new Engine();
		Vehicle vehicle=new Vehicle(engine);
		System.out.println("Bike Colour : "+bike.getbColour());
		System.out.println("Bike Name : "+bike.getVehicleName());
		System.out.println("Bike Gears : "+bike.getGears());
//		applicationContext.registerShutdownHook();

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
