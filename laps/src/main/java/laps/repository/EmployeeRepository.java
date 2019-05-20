package laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import laps.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
}
