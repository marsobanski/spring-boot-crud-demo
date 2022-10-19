package com.luv2code.springboot.springbootcruddemo.dao;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee getById(int id);

    void saveEmployee(Employee employee);

    void deteleById(int id);

}
