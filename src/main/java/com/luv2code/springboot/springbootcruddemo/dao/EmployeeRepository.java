package com.luv2code.springboot.springbootcruddemo.dao;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.NamedQuery;
import java.util.List;

//zastepuje ścieżkę, która normalnie byłaby /employees, a zamiast tego /members
@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByFirstNameContaining(String namePart); // nazwę podpowiada, więc samo kmini

    //jest jeszcze JPQL, @NamedQuery, @Query, Query Derivation (to chyba to na górze jest) i inne opcje z wykorzystanie JpaRepository

    //sprawdzić jeszcze HATEOAS, HAL, Query DSL,
}
