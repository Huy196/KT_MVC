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
import java.util.Random;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServicelmpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null) {
            action = "  ";
        }
        switch (action) {
            case "add":
                showEmployeeForm(req, resp);
                break;
            case "delete":
                deleteEmployee(req, resp);
                break;
            case "update":
                updateEmployee(req, resp);
                break;
            default:
                showEmployee(req, resp);
        }
    }

//    private void updateEmployeeForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/employee/UpdateEmployee.jsp");
//        dispatcher.forward(req, resp);
//    }

    private void updateEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            int age = Integer.parseInt(req.getParameter("age"));
            String jobPosition = req.getParameter("jobPosition");
            String departments = req.getParameter("departments");
            double salary = Double.parseDouble(req.getParameter("salary"));

            Employee employee = employeeService.searchById(id);

            if (employee != null) {
                employee.setName(name);
                employee.setAge(age);
                employee.setJobPosition(jobPosition);
                employee.setDepartments(departments);
                employee.setSalary(salary);

                employeeService.update(id, employee);

                req.setAttribute("employee", employee);
                RequestDispatcher dispatcher = req.getRequestDispatcher("/employee/UpdateEmployee.jsp");
                dispatcher.forward(req, resp);
            } else {
                req.setAttribute("error", "Không tìm thấy nhân viên với ID: " + id);
                req.getRequestDispatcher("/update.jsp").forward(req, resp);
            }
        } catch (NumberFormatException e) {
            req.setAttribute("error", "Dữ liệu đầu vào không hợp lệ.");
            req.getRequestDispatcher("/update.jsp").forward(req, resp);
        }
    }

    private void showEmployeeForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/employee/AddEmployee.jsp");
        dispatcher.forward(req, resp);
    }

    private void showEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = employeeService.showAll();
        req.setAttribute("employees", employees);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/employee/List.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                addEmployee(req, resp);
            case "update":
//                updateEmployee(req, resp);
            default:
                break;
        }
    }

    private void deleteEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        employeeService.remove(id);
        showEmployee(req, resp);
    }

    private void addEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = (int) (Math.random() * 1000);
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String jobPosition = req.getParameter("jobPosition");
        String departments = req.getParameter("departments");
        double salary = Double.parseDouble(req.getParameter("salary"));
        System.out.println(name + age);

        Employee employee = new Employee(id, name, age, jobPosition, departments, salary);

        this.employeeService.add(employee);

        showEmployee(req, resp);

    }


}

