package com.example.SpringProjectAngular.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name="employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;
    
    @Column(name="employee_name", length = 255)
    private String employeename;
    @Column(name="employee_address", length = 255)
    private String employeeaddress;
    @Column(name="employee_mobile", length = 255)
    private long mobile;
    
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeid, String employeename, String employee_address, String employee_mobile, String employeeaddress, long mobile) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeeaddress = employeeaddress;
		this.mobile = mobile;
	}
	
	public Employee(String employeename, String employeeaddress, long mobile) {
		super();
		
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
	public String getEmployee_address() {
		return employeeaddress;
	}
	public void setEmployee_address(String employee_address) {
		this.employeeaddress = employee_address;
	}
	public long getmobile() {
		return mobile;
	}
	public void setmobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employee_address="
				+ employeeaddress + ", employee_mobile=" + mobile + "]";
	}
    
    
}