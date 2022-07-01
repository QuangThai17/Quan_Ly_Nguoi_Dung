package com.example.demo2.service;




import com.example.demo2.model.Department;

import java.util.List;

public interface DepartmentService {

    Iterable<Department> findAll();

    List<Department> getAllDepartments();

    Department saveDepartment(Department department);

    Department getDepartmentById(Long id);

    Department updatedepartment(Department department);

    void deleteDepartmentById(Long id);

}
