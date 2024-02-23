package com.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.details.bean.EmployeeDetail;
import com.details.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo er;

	public List<EmployeeDetail> getEmployee() {
		List<EmployeeDetail> employee = er.findAll();
		return employee;
	}
	public EmployeeDetail saveDetail(EmployeeDetail detail) {
		return er.save(detail);
	}
	public EmployeeDetail updateDetail(EmployeeDetail detail, int id) {
		
		return er.save(detail);
	}
	public void deleteDetail(EmployeeDetail detail,int id) {
		
		er.delete(detail);
	}
}
