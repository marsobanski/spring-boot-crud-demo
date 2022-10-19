package com.luv2code.springboot.springbootcruddemo.service;

import com.luv2code.springboot.springbootcruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.springbootcruddemo.dao.EmployeeDAOJpaImpl;
import com.luv2code.springboot.springbootcruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDAO;
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(@Qualifier ("employeeDAOJpaImpl") EmployeeDAO employeeDAO, EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Employee getById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public void deteleById(int id) {
        employeeRepository.deleteById(id);
    }

//    @Override
//    @Transactional
//    public List<Employee> findAll() {
//        return employeeDAO.findAll();
//    }
//
//    @Override
//    @Transactional
//    public Employee getById(int id) {
//        return employeeDAO.getById(id);
//    }
//
//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//        employeeDAO.saveEmployee(employee);
//    }
//
//    @Override
//    @Transactional
//    public void deteleById(int id) {
//        employeeDAO.deteleById(id);
//    }
}
