package com.demo.controller;

import com.demo.model.Emp;
import com.demo.model.Employee;
import com.demo.model.Manager;
import com.demo.model.Summary;
import com.demo.repo.EmpRepository;
import com.demo.repo.EmployeeRepository;
import com.demo.repo.ManagerRepository;
import com.demo.repo.SummaryRepository;
import com.demo.response.ApprovalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Demo")
public class DemoController {
    @Autowired
    private EmpRepository empRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private SummaryRepository summaryRepository;

    @GetMapping("/getApprovals")
    public List<Employee> getApprovalDetails(){
        ApprovalResponse response = new ApprovalResponse();
        //List<Approve> approveList =  approvalRepository.findApprove();

        List<Employee> approvalList =  employeeRepository.findAll();
        return approvalList;
    }

    @GetMapping("/getAllEmployee")
    public List<Emp> getAllEmployee(){
        List<Emp> employeeList =  empRepository.findAll();
        return employeeList;
    }

    @GetMapping("/getAllManagers")
    public List<Manager> getAllManagers(){
        List<Manager> managerList =  managerRepository.findAll();
        return managerList;
    }

    @PostMapping("/assignManger")
    public  void assignManager(@RequestBody Summary summary){
       summaryRepository.save(summary);
    }

    @GetMapping("/getSummary")
    public List<Summary> getSummary(){
        List<Summary> summaryList =  summaryRepository.findAll();
        return summaryList;
    }
}
