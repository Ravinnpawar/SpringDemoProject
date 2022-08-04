package com.demoproj.annotations;

public class Student {
    private String name;

    public String getName() {
        System.out.println("Student Name: "+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
