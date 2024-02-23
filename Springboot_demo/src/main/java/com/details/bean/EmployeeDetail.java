package com.details.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Employee")
public class EmployeeDetail 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int emp_no;
	String name;
	String email;
	double salary;

}
