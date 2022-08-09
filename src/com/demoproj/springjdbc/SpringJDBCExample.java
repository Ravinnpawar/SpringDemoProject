package com.demoproj.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/*
* It becomes complicated to write unnecessary code to handle exceptions, opening and closing database connections, etc.
*  However, Spring JDBC Framework takes care of all the low-level details starting from opening the connection,
*  prepare and execute the SQL statement, process exceptions, handle transactions and finally close the connection.
*
* So what you have to do is just define the connection parameters and specify the SQL statement to be executed and do the
* required work for each iteration while fetching data from the database.

Spring JDBC provides several approaches and correspondingly different classes to interface with the database.
* I'm going to take classic and the most popular approach which makes use of JdbcTemplate class of the framework.
*  This is the central framework class that manages all the database communication and exception handling.
*
* The JDBC Template class executes SQL queries, updates statements, stores procedure calls, performs iteration over ResultSets,
*  and extracts returned parameter values. It also catches JDBC exceptions and translates them to the generic,
* more informative, exception hierarchy defined in the org.springframework.dao package.
*
* Instances of the JdbcTemplate class are threadsafe once configured. So you can configure a single instance of a
* JdbcTemplate and then safely inject this shared reference into multiple DAOs.

A common practice when using the JDBC Template class is to configure a DataSource in your Spring configuration file,
*  and then dependency-inject that shared DataSource bean into your DAO classes, and the JdbcTemplate is created in the
* setter for the DataSource.

* Add Spring JDBC specific latest libraries mysql-connector-java.jar, org.springframework.jdbc.jar
* and org.springframework.transaction.jar in the project. You can download required libraries if you do not have them already.

 * */
public class SpringJDBCExample implements StudentDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(String name, Integer age) {
        String SQL = "insert into Student (name, age) values (?, ?)";
        jdbcTemplateObject.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }
    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new StudentMapper());

        return student;
    }
    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }
    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }
    public void update(Integer id, Integer age){
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }
}
