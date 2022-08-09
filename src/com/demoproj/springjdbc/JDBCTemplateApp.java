package com.demoproj.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JDBCTemplateApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbctemplate.xml");

        SpringJDBCExample studentJDBCTemplate =
                (SpringJDBCExample)context.getBean("studentJDBCTemplate");

      /*  System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("ABC", 23);
        studentJDBCTemplate.create("BCD", 25);
        studentJDBCTemplate.create("CDE", 26);
*/
        /*System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2, 26);

        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());*/

        System.out.println("----Deleting Record with ID = 3 -----" );
        studentJDBCTemplate.delete(3);
    }
}
