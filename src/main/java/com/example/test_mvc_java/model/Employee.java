package com.example.test_mvc_java.model;

public class Employee {
    private int ma;
    private String name;
    private int age;
    private String jobPosition;
    private String departments;
    private double salary;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ma=" + ma +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", departments='" + departments + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int ma, String name, int age, String jobPosition, String departments, double salary) {
        this.ma = ma;
        this.name = name;
        this.age = age;
        this.jobPosition = jobPosition;
        this.departments = departments;
        this.salary = salary;
    }
}
