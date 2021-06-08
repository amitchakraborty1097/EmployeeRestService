package com.example.demo.model;

public class Department {

	private int deptId;
	private int deptName;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getDeptName() {
		return deptName;
	}
	public void setDeptName(int deptName) {
		this.deptName = deptName;
	}
	public Department(int deptId, int deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	
}
