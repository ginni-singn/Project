package com.mongo.test.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.mongo.test.model.Department;
import com.mongo.test.model.Domain;
import com.mongo.test.model.Employees;
import com.mongo.test.repository.DepartmentRepository;
import com.mongo.test.repository.DomainRepository;
import com.mongo.test.repository.EmployeesRepository;

@Service
public class EmployeesService {
	@Autowired
	EmployeesRepository employeeRepository;
	
	@Autowired
	DomainRepository domaRepository;
	
	@Autowired
	DepartmentRepository deptRepository;
	

	public List<Employees> getAll() {
		return employeeRepository.findAll();
	}

	public Employees addEmployee(Employees emp) {
		emp.setJoiningDate(new Date());
		return employeeRepository.insert(emp);
	}
	
	public Employees updateDomain(Employees emp) {
		return employeeRepository.save(emp);
	}
	
	public List<Employees> getActive(Employees emp) {
		Example<Employees> e = Example.of(emp);
		return employeeRepository.findAll(e);
	}


	public Employees update(Employees emp) {
		return employeeRepository.save(emp);
	}

	public void delete(String id) {
		employeeRepository.deleteById(id);
	}

	public void deleteall() {
		 employeeRepository.deleteAll();
		
	}

	public List<Employees> getAllExample(Employees emp) {
		Example<Employees> e = Example.of(emp);
		return employeeRepository.findAll(e);
	}

	public List<Domain> getDetails() {
		return domaRepository.findAll();
	}

	public Domain addDomain(Domain doma) {
		doma.setJoiningDate(new Date());
		return domaRepository.insert(doma);
	}

	public void deletedoma() {
		domaRepository.deleteAll();
		
	}

	public List<Department> getDept() {
		return deptRepository.findAll();
	}
	
	public Department addDept(Department dept) {
		dept.setJoiningDate(new Date());
		return deptRepository.insert(dept);
	}

	public void deleteDept() {
		deptRepository.deleteAll();
	
	}

	
	

	
	
}
