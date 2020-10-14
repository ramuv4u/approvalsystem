package com.demo.repo;

import com.demo.model.Emp;
import com.demo.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, String>{
    @Override
    List<Manager> findAll();
}
