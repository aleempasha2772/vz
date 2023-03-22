package com.example.vz.service;

import com.example.vz.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department updateDepartment(Department department,Long departmentId);

    void deleteDepartmentById(Long departmentId);
}
