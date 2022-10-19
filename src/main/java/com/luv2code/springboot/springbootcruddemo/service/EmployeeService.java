package com.luv2code.springboot.springbootcruddemo.service;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee getById(int id);

    void saveEmployee(Employee employee);

    void deteleById(int id);
}
