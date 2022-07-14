package com.example.demo2.controller;

import com.example.demo2.model.Datauser;
import com.example.demo2.repository.DatauserRepository;
import com.example.demo2.service.DatauserService;
import com.example.demo2.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class DatauserController {

    @Autowired
    private DatauserService datauserService;
    @Autowired
    private DatauserRepository datauserRepository;

    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/datausers")
    public  String listDatausers(Model model){
        model.addAttribute("datausers",datauserService.getAllDatausers());

        return "datauser/datausers";
    }

    @GetMapping("/datausers/new")
    public String showNewUserForm(Model model) {
        Datauser datauser = new Datauser();
        model.addAttribute("datauser", datauser);
        model.addAttribute("departments",departmentService.getAllDepartments());
        return "datauser/create_datauser";
    }

    @PostMapping("/saveDatauser")
    public String saveDatauser( Datauser datauser) {
        datauserService.saveDatauser(datauser);
        return "redirect:/datausers";
    }

    @GetMapping("/datausers/edit/{id}")
    public String editDatauserForm(@PathVariable Long id, Model model){
        model.addAttribute("datauser",datauserService.getDatauserById(id));
        model.addAttribute("departments",departmentService.getAllDepartments());
        return "datauser/edit_datauser";
    }

    @PostMapping("/datausers/edit")
    public String updateDatauser(Datauser datauser,Model model)
    {
        //get datauser from database by id
        Datauser existingDatauser = datauserService.getDatauserById(datauser.getId());
        existingDatauser.setId(datauser.getId());
        existingDatauser.setFullname(datauser.getFullname());
        existingDatauser.setDescrip(datauser.getDescrip());
        existingDatauser.setDatebirth(datauser.getDatebirth());
        existingDatauser.setAddress(datauser.getAddress());
        existingDatauser.setCreator(datauser.getCreator());
        existingDatauser.setUpdater(datauser.getUpdater());
        existingDatauser.setUpdate_day(datauser.getUpdate_day());
        existingDatauser.setEmail(datauser.getEmail());
        existingDatauser.setDepartment(datauser.getDepartment());
        //save updated student object
        datauserService.updatedatauser(existingDatauser);
        return "redirect:/datausers";
    }

    @GetMapping("/deleteDatauser/{id}")
    public String deleteDatauser(@PathVariable(value = "id") Long id) {
        // call delete user method
        datauserService.deleteDatauserById(id);

        return "redirect:/datausers";
    }
}
