package com.example.test_mvc_java.controller;

import com.example.test_mvc_java.model.Employee;
import com.example.test_mvc_java.service.EmployeeService;
import com.example.test_mvc_java.service.EmployeeServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value ="/employee" )
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServicelmpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null){
            action = " ";
        }
        switch (action){
            default:
                showEmployee(req,resp);
        }
    }

    private void showEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = employeeService.showAll();
        req.setAttribute("employees", employees);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/employee/List.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
