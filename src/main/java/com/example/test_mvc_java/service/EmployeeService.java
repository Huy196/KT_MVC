package com.example.test_mvc_java.service;

import com.example.test_mvc_java.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> showAll();

    void add(Employee employee);

    Employee searchName(int id , String name);

    void update(int id, Employee employee);
    void remove(int id);

    Employee searchById(int id);
}
