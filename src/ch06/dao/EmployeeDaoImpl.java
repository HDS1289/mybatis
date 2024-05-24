package ch06.dao;

import java.util.List;

import ch06.dao.map.EmployeeMap;
import ch06.domain.Employee;
import config.Configuration;

public class EmployeeDaoImpl implements EmployeeDao {
	// EmployeeMap은 EmployeeDao의 dependency가 된다.
	private EmployeeMap employeeMap;
	
	public EmployeeDaoImpl() {
		this.employeeMap = Configuration.getMapper(EmployeeMap.class);
	}
	
	@Override
	public List<Employee> selectEmployees() {
		return employeeMap.selectEmployees();
	}
}
