package com.luv2code.springboot.springbootcruddemo.rest;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import com.luv2code.springboot.springbootcruddemo.exception.CustomerNotFoundException;
import com.luv2code.springboot.springbootcruddemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api")
//@RequiredArgsConstructor
public class EmployeeRestControllerStandard {

//    private final EmployeeService employeeService;
//
//    @GetMapping("/employees")
//    public List<Employee> findAll() {
//        return employeeService.findAll();
//    }
//
//    @GetMapping("/employees/{employeeId}")
//    public Employee getById(@PathVariable int employeeId) {
//
//        Employee employee = employeeService.getById(employeeId);
//        if (employee == null) {
//            throw new RuntimeException("Employee not found, id: " + employeeId);
//        }
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee add(@RequestBody Employee employee) {
//        employee.setId(0);
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @PutMapping("/employees")
//    public Employee update(@RequestBody Employee employee) {
//        // fragment nie działa z EmployeeDAOHibernateImpl
//        Employee dbEmployee = employeeService.getById(employee.getId());
//        if (dbEmployee == null) {
//            throw new CustomerNotFoundException("Employee not found, id: " + employee.getId());
//        }
//        // do tutaj
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @DeleteMapping("/employees/{employeeId}")
//    public String delete(@PathVariable int employeeId) {
//        Employee employee = employeeService.getById(employeeId);
//        if (employee == null) {
//            throw new CustomerNotFoundException("Employee not found, id: " + employee.getId());
//        }
//        employeeService.deteleById(employeeId);
//        return "Deleted employee with id: " + employeeId;
//    }
}
