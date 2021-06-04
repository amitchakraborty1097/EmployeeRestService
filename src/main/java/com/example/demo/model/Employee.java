package com.example.demo.model;

/**
 * Employee Resource Class
 * @author amitc
 *
 */
public class Employee {

	private int employeeId;
	
	private String empName;
	
	private String empAddress;
	
	private String empDepartment;

	public Employee(int employeeId, String empName, String empAddress, String empDepartment) {
		this.employeeId = employeeId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empDepartment = empDepartment;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	
	
}
