package laps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import laps.model.Employee;
import laps.repository.PositionRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private PositionRepository pr;
	
	public void SetAnnualLeaveDays(Employee employee) {
		int annualLeaveDaysLeft = pr.findByPositionName(employee.getPosition().getPositionName()).getAnnualLeaveDays();
		employee.setAnnualLeaveDaysLeft(annualLeaveDaysLeft); 
	}
}
