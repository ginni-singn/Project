package com.mongo.test.Controller;
import java.util.*;

import com.mongo.test.exception.ProductNotFoundException;
import com.mongo.test.model.Department;
import com.mongo.test.model.Domain;
import com.mongo.test.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.mongo.test.service.EmployeesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/employee")
@Api(value= "Employees")
public class EmployeesController {
	@Autowired
	EmployeesService employeesService;
	
	@GetMapping("/getall")
	@ApiOperation(value ="Get all the Employee Details")
	@ApiResponse(code =200, message = "Success")
		public List<Employees> getAll() throws Exception{
			return employeesService.getAll();
			
		}
	
	@GetMapping("/getActive")
	@ApiOperation(value ="Get details of active Employees")
	@ApiResponse(code =200, message = "Success")
	public List<Employees> getAllExample(@RequestBody Employees emp) throws Exception{
		return employeesService.getAllExample(emp);
	}
	
	@GetMapping("/getDomain")
	@ApiOperation(value ="Get all the Domain related Details")
	@ApiResponse(code =200, message = "Success")
		public List<Domain> getDetails() throws Exception{
		return employeesService.getDetails();
			
	}
	
	@PostMapping("/postDomain")
	
	public Domain addDomain(@ApiParam(value="Post",required = true)@RequestBody Domain doma) throws Exception{
		return employeesService.addDomain(doma);
	}
	
	@DeleteMapping("/deletedoma")
	public void deletedoma() throws Exception{
		employeesService.deletedoma();
	}
	
	@GetMapping("/getDept")
	public List<Department> getDept() throws Exception{
	return employeesService.getDept();
		
	}

	@PostMapping("/postDept")
	public Department addDept(@ApiParam(value="Post",required = true)@RequestBody Department dept) throws Exception{
		return employeesService.addDept(dept);
	}
	
	@DeleteMapping("/deleteDept")
	public void deleteDept() throws Exception{
		employeesService.deleteDept();
	}
	
	
	@PostMapping("/post")
	public Employees addEmployee(@ApiParam(value="Post",required = true)@RequestBody Employees emp) throws Exception{
		return employeesService.addEmployee(emp);
	}
	
	@PutMapping(path="/{domain}")
	public Employees updateDomain(@RequestBody Employees emp) throws Exception {
		return employeesService.updateDomain(emp);
	}
	
	@GetMapping(path="/{isactive}")
	public List<Employees> getActive(@RequestBody Employees emp) throws Exception{
		return employeesService.getActive(emp);
	}
	
	@PutMapping("/put")
	public Employees update(@RequestBody Employees emp) throws Exception{
		return employeesService.update(emp);
	}
	
	@DeleteMapping("/deleteall")
	public void deleteall() throws Exception{
		employeesService.deleteall();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@RequestParam("id") String id) throws Exception{
		employeesService.delete(id);
	}
	
	

}
