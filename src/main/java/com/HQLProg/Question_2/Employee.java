package com.HQLProg.Question_2;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int EmpId;
	private String EmpName;
	private int Sal;
	private int DeptId;
	private int Gender; 
	private String DOB;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	public int getDeptId() {
		return DeptId;
	}
	public void setDeptId(int deptId) {
		DeptId = deptId;
	}
	public int getGender() {
		return Gender;
	}
	public void setGender(int gender) {
		Gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public Employee(int empId, String empName, int sal, int deptId, int gender, String dOB) {
		super();
		EmpId = empId;
		EmpName = empName;
		Sal = sal;
		DeptId = deptId;
		Gender = gender;
		DOB = dOB;
	}
	
}