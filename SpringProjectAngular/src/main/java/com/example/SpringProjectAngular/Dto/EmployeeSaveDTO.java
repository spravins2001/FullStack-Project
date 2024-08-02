package com.example.SpringProjectAngular.Dto;

public class EmployeeSaveDTO {
	
	private String employeename;
	private String employeeaddress;
	private long mobile;
	public EmployeeSaveDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeSaveDTO(String employeename, String employeeaddress, long mobile) {
		super();
		this.employeename = employeename;
		this.employeeaddress = employeeaddress;
		this.mobile = mobile;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "EmployeeSaveDTO [employeename=" + employeename + ", employeeaddress=" + employeeaddress + ", mobile="
				+ mobile + "]";
	}
	
	
}
