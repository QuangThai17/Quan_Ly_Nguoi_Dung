package com.example.demo2.controller;



import com.example.demo2.model.Department;
import com.example.demo2.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Locale;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

//    Phuong phap xu ly giai quyet danh sach department yeu cau va quay lai mo hinh va che do xem
    @ModelAttribute("departments")
    public Iterable<Department> departments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments")
    public  String listDepartments(Model model){
        model.addAttribute("departments",departmentService.getAllDepartments());
        return "department/departments";
    }

    @GetMapping("/departments/new")
    public String showNewDepartmentForm(Model model) {
        Department department = new Department();
        model.addAttribute("department", department);
        return "department/create_department";
    }

    @PostMapping("/saveDepartment")
    public String saveDepartment( Department department) {
        departmentService.saveDepartment(department);
        return "redirect:/departments";
    }

    @GetMapping("/departments/edit/{id}")
    public String editDepartmentForm(@PathVariable Long id,Model model){
        model.addAttribute("department",departmentService.getDepartmentById(id));
        return "department/edit_department";
    }

    @PostMapping("/departments/edit")
    public String updateDepartment(
                                 Department department,Model model){
        //get datauser from database by id
        Department existingDepartment = departmentService.getDepartmentById(department.getDepartmentid());
        existingDepartment.setDepartmentid(department.getDepartmentid());
        existingDepartment.setDepartmentname(department.getDepartmentname());
        existingDepartment.setDescrip(department.getDescrip());
        existingDepartment.setCreatedate(department.getCreatedate());
        existingDepartment.setCreator(department.getCreator());
        existingDepartment.setUpdater(department.getUpdater());
        existingDepartment.setUpdateday(department.getUpdateday());
        //save updated student object
        departmentService.updatedepartment(existingDepartment);
        return "redirect:/departments";
    }

    @GetMapping("/deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable(value = "id") Long id) {
        // call delete user method
        departmentService.deleteDepartmentById(id);

        return "redirect:/departments";
    }

    public String print(Department object, Locale locale) {
        return "[" + object.getDepartmentid() + ", " +object.getDepartmentname() + "]";
    }
}