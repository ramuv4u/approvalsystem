package com.demo.repo;

import com.demo.model.Emp;
import com.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepository extends JpaRepository<Emp, String>{
    @Override
    List<Emp> findAll();
}
