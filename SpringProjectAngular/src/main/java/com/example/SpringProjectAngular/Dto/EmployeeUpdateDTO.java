package com.example.SpringProjectAngular.Dto;

public class EmployeeUpdateDTO {

	
	private int employeeid;
	private String employeename;
	private String employeeaddress;
	private long mobile;
	
	public EmployeeUpdateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeUpdateDTO(int employeeid, String employeename, String employeeaddress, long mobile) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeeaddress = employeeaddress;
		this.mobile = mobile;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
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
		return "EmployeeDTO [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeaddress="
				+ employeeaddress + ", mobile=" + mobile + "]";
	}
}
