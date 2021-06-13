package com.openclassrooms.MyFirstAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	Iterable<Employee> findAll();

	void deleteById(Long id);

	Employee save(Employee employee);

}