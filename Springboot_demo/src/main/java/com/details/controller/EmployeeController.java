package com.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.details.bean.EmployeeDetail;
import com.details.service.EmployeeService;


@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService es;
	
	@GetMapping("/getdetails")
	public List<EmployeeDetail> getEmployee()
	{
		return es.getEmployee();
	}
	
	@PostMapping("/saveDetails")
	 public EmployeeDetail saveDetail(@RequestBody EmployeeDetail detail) {
		return es.saveDetail(detail);
	}
	
	@PutMapping("/updateDetails/{id}")
	public EmployeeDetail updateDetail(@RequestBody EmployeeDetail detail,@PathVariable int id) {
		return es.updateDetail(detail,id);
	}
	
	@DeleteMapping("/deleteDetails")
	public void deleteDetail(@RequestBody EmployeeDetail detail,@PathVariable int id)
	{
		es.deleteDetail(detail, id);
		
	}
}
