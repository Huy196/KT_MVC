package com.example.test_mvc_java.service;

import com.example.test_mvc_java.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServicelmpl implements EmployeeService{
    private static Map<Integer, Employee> employees = new HashMap<>();

    static {
        employees.put(1,new Employee(1,"doquochuy",18,"Giam doc","quan tri nhan su",10000));
        employees.put(2,new Employee(2,"levandan",38,"Bao ve","Bao ve",10000));
        employees.put(3,new Employee(3,"huyentrang",18,"Thu ky","Ke toan",10000));
    }


    @Override
    public List<Employee> showAll() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public Employee searchName(int id, String name) {
        return null;
    }

    @Override
    public void update(int id, Employee employee) {

    }

    @Override
    public void remove(int id) {

    }
}
