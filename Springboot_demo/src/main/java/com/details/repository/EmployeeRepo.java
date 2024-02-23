package com.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.details.bean.EmployeeDetail;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDetail,Integer>{

}
