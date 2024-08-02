package com.example.SpringProjectAngular.EmployeeController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringProjectAngular.Dto.EmployeeDTO;
import com.example.SpringProjectAngular.Dto.EmployeeSaveDTO;
import com.example.SpringProjectAngular.Dto.EmployeeUpdateDTO;
import com.example.SpringProjectAngular.Service.EmployeeService;
@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

	
	@Autowired

	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public String saveEmployee (@RequestBody EmployeeSaveDTO emplyoeeSaveDTO) 
	{
		String id = employeeService.addEmployee(emplyoeeSaveDTO);
		return id;

	}
	
	@GetMapping("/getAllEmployee")
	public List<EmployeeDTO>  getAllEmployee(){
		
		List<EmployeeDTO>allEmployee = employeeService.getAllEmployee();
		return allEmployee; 
	}
	
	@PutMapping("/update")
	
	public String updateEmployee (@RequestBody EmployeeUpdateDTO emplyoeeUpdateDTO)
	{
		
		String id = employeeService.updateEmployee(emplyoeeUpdateDTO);
		return id; 
	}
	
@DeleteMapping("/delete/{id}")
	
	public String deleteEmployee (@PathVariable(value = "id")int id)
	{
		
		boolean deleteEmployee = employeeService.deleteEmployee(id);
		return "Deleted";
		
	}
	
}