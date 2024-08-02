package com.example.SpringProjectAngular.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringProjectAngular.Dto.EmployeeDTO;
import com.example.SpringProjectAngular.Dto.EmployeeSaveDTO;
import com.example.SpringProjectAngular.Dto.EmployeeUpdateDTO;
import com.example.SpringProjectAngular.Entity.Employee;
import com.example.SpringProjectAngular.repo.EmployeeRepo;

@Service
public class EmployeeServiceIMPL implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public String addEmployee(EmployeeSaveDTO emplyoeeSaveDTO) {

		Employee employee = new Employee(emplyoeeSaveDTO.getEmployeename(), emplyoeeSaveDTO.getEmployeeaddress(),
				emplyoeeSaveDTO.getMobile());

		employeeRepo.save(employee);
		return employee.getEmployeename();
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {

		List<Employee> getEmployees = employeeRepo.findAll();
		List<EmployeeDTO> employeeDTOList = new ArrayList<>();

		for (Employee e : getEmployees) {
			EmployeeDTO employeeDTO = new EmployeeDTO(e.getEmployeeid(), e.getEmployeename(), e.getEmployee_address(),
					e.getmobile()

			);

			employeeDTOList.add(employeeDTO);

		}

		return employeeDTOList;
	}

	@Override
	public String updateEmployee(EmployeeUpdateDTO emplyoeeUpdateDTO) {

		if (employeeRepo.existsById(emplyoeeUpdateDTO.getEmployeeid())) {
			Employee employee = employeeRepo.getById(emplyoeeUpdateDTO.getEmployeeid());

			employee.setEmployeename(emplyoeeUpdateDTO.getEmployeename());
			employee.setEmployee_address(emplyoeeUpdateDTO.getEmployeeaddress());
			employee.setmobile(emplyoeeUpdateDTO.getMobile());

			employeeRepo.save(employee);

		}

		else {
			System.out.println("Employee id not Foud");
		}
		return null;

	}

	@Override
	public boolean deleteEmployee(int id) {
		if (employeeRepo.existsById(id)) {

			employeeRepo.deleteById(id);

		} else {
			System.out.println("ID not found");
		}

		return false;
	}

}
