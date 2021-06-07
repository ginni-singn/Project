package com.mongo.test;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongo.test.model.Employees;
import com.mongo.test.repository.EmployeesRepository;
import com.mongo.test.service.EmployeesService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {
	@Autowired
	private EmployeesService employeesService;
	
	@MockBean
	private EmployeesRepository employeeRepository;
	
	@Test
	public void testEmployeelist() {
		Employees employee = new Employees();
		employee.setDesignation("Developer");
		employee.setDomain("Image recognition");
		employee.setFirstName("Raja");
		employee.setJoiningDate(new Date());
		employee.setLastName("Singh");
		employee.setActive(true);
		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
		assertThat(employeesService.addEmployee(employee)).isEqualTo(employee);
		
	}
	
	@Test
	public void testallEmployee() {
		Employees employee = new Employees();
		employee.setId("1");
		employee.setDesignation("Developer");
		employee.setDomain("Image recognition");
		employee.setFirstName("Raja");
		employee.setJoiningDate(new Date());
		employee.setLastName("Singh");
		employee.setActive(true);
		Employees employee1 = new Employees();
		employee1.setId("1");
		employee1.setDesignation("Manager");
		employee1.setDomain("Image recognition");
		employee1.setFirstName("ja");
		employee1.setJoiningDate(new Date());
		employee1.setLastName("Singh");
		employee1.setActive(true);
		
		List<Employees> empylist = new ArrayList<>();
		empylist.add(employee);
		empylist.add(employee1);
		
		
		Mockito.when(employeeRepository.findAll()).thenReturn(empylist);
		assertThat(employeesService.getAll()).isEqualTo(empylist);
		
	}
	
	@Test
	public void testDeleteEmployee(){
		Employees employee = new Employees();
		employee.setId("1");
		employee.setDesignation("Developer");
		employee.setDomain("Image recognition");
		employee.setFirstName("Raja");
		employee.setJoiningDate(new Date());
		employee.setLastName("Singh");
		employee.setActive(true);
		
	    Mockito.when(employeeRepository.deleteById("1")).thenReturn(employee);
	    Mockito.when(employeeRepository.existsById(employeesService.delete("1"))).thenReturn(false);
	   assertFalse(employeeRepository.existsById(employeesService.delete("1")));
	}
	
	@Test
	public void testUpdateEmployee(){
		Employees employee = new Employees();
		employee.setId("1");
		employee.setDesignation("Developer");
		employee.setDomain("Image recognition");
		employee.setFirstName("Raja");
		employee.setJoiningDate(new Date());
		employee.setLastName("Singh");
		employee.setActive(true);
		
		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
		
		employee.setDomain("Artificial Intelligence");
		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
		
		assertThat(employeesService.update(employee)).isEqualTo(employee);
		
	}
	
	
	
	
	

}
