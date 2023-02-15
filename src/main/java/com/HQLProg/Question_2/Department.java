package com.HQLProg.Question_2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int DeptId;
	private String DeptName;
	public int getDeptId() {
		return DeptId;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setDeptId(int deptId) {
		DeptId = deptId;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public Department(int deptId, String deptName) {
		super();
		DeptId = deptId;
		DeptName = deptName;
	}
	
}
