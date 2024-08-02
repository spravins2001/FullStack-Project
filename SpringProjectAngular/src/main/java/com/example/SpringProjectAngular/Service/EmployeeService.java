package com.example.SpringProjectAngular.Service;

import java.util.List;

import com.example.SpringProjectAngular.Dto.EmployeeDTO;
import com.example.SpringProjectAngular.Dto.EmployeeSaveDTO;
import com.example.SpringProjectAngular.Dto.EmployeeUpdateDTO;

public interface EmployeeService {

	String addEmployee(EmployeeSaveDTO emplyoeeSaveDTO);

	List<EmployeeDTO> getAllEmployee();

	String updateEmployee(EmployeeUpdateDTO emplyoeeUpdateDTO);

	boolean deleteEmployee(int id);

}
