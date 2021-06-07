package com.mongo.test;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongo.test.model.Address;
import com.mongo.test.model.Employees;
import com.mongo.test.repository.EmployeesRepository;
import com.mongo.test.service.EmployeesService;


@RunWith(SpringRunner.class)

@SpringBootTest
class TestApplicationTests {
	@Autowired
	private EmployeesService employeesService;
	@MockBean
	private EmployeesRepository employeerepository;
	
	@org.junit.Test
	public void get() {
		when(employeerepository.findAll()).thenReturn(Stream.of(new Employees("Ginni","Singh","Manager",new Address("Helo","Society","Nagpur","Maharashtra",1234),"Image reconition",new Date(),true),new Employees("Minni","Singh","Developer",new Address("Helo","Society","Nagpur","Maharashtra",2341),"Image Neural Net",new Date(),true)).collect(Collectors.toList()));
		assertEquals(2,employeesService.getAll().size());
	}
	
	@org.junit.Test
	public void updating() {
		Employees e = new Employees("Sinni","Singh","Tester",new Address("Helo","Society","Magpur","Maharashtra",3455)," ML",new Date(),true);
		when(employeerepository.save(e)).thenReturn(e);
		assertEquals(e,employeesService.update(e));
	}
	
	@org.junit.Test
	public void deletion() {
		Employees em = new Employees("Sinni","Singh","Tester",new Address("Helo","Society","Magpur","Maharashtra",3455)," ML",new Date(),true);
		employeesService.deleteall();

	}
	
	

	@Test
	void contextLoads() {
	}

}
