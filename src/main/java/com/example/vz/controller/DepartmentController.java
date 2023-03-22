package com.example.vz.controller;


import com.example.vz.entity.Department;
import com.example.vz.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public ResponseEntity<Object> saveDepartment(@Valid @RequestBody
                                         Department department){

                departmentService.saveDepartment(department);
        return new ResponseEntity<>("Inserted Successfully", HttpStatus.CREATED);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @PutMapping("/departments/{id}")
    public ResponseEntity<Object>  updateDepartment(@RequestBody Department department,@PathVariable("id") Long departmentId){
                departmentService.updateDepartment(department,departmentId);
                return new ResponseEntity<>("Updated Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/departments/{id}")
    public ResponseEntity<Object> deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
    }

}
