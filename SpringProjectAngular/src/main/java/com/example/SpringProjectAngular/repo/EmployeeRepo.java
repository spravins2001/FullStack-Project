package com.example.SpringProjectAngular.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.SpringProjectAngular.Entity.Employee;


@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
