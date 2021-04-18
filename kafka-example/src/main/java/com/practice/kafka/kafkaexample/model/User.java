package com.practice.kafka.kafkaexample.model;

public class User {
    private String name;
    private String dept;
    private Long salary;

    public User(String n, String d, long sal){
        this.name = n; this.dept = d; this.salary = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
