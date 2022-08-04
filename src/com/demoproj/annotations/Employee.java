package com.demoproj.annotations;

public class Employee {
    private String name;

    PEmployee employee;

    public Employee(PEmployee pEmployee) {
        System.out.println("Obj created for P Employee");
        this.employee=pEmployee;
    }

    public void setEmployee(PEmployee employee) {
        this.employee = employee;

    }

    public String getName() {
        System.out.println("Name Of the Employee: "+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
