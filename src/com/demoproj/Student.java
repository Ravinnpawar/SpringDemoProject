package com.demoproj;


//Pojo- Plain old java object.
//Model class-
//data class.
//How to create a bean
//Bean's lifecycle details
//Bean's dependencies
public class Student {
	private String name;
	private int rollNo;
	private int age;
	private String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String name, int rollNo, int age, String address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.address = address;
	}
	

}
