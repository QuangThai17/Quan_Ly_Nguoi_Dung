package com.example.demo2.service;


import com.example.demo2.model.Datauser;
import com.example.demo2.model.Department;

import java.util.List;

public interface DatauserService extends IGeneralService<Datauser> {

    List<Datauser> getAllDatausers();

    Datauser getDatauserById(Long id);

    Datauser updatedatauser(Datauser datauser);

    void deleteDatauserById(Long id);

    Iterable<Datauser> findAllByDepartment(Department department);

    Iterable<Datauser> findAll(Department department);

    Datauser saveDatauser(Datauser datauser);
}
