package com.example.demo2.service.impl;

import com.example.demo2.model.Datauser;
import com.example.demo2.model.Department;
import com.example.demo2.repository.DatauserRepository;
import com.example.demo2.service.DatauserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatauserServiceImpl implements DatauserService {
    @Autowired
    private DatauserRepository datauserRepository;

    public DatauserServiceImpl(DatauserRepository datauserRepository) {
        this.datauserRepository = datauserRepository;
    }

    @Override
    public List<Datauser> getAllDatausers() {
        return datauserRepository.findAll();
    }

    @Override
    public Datauser saveDatauser(Datauser datauser) {
        return datauserRepository.save(datauser);
    }

    @Override
    public Datauser getDatauserById(Long id) {
        return datauserRepository.findById(id).get();
    }

    @Override
    public Datauser updatedatauser(Datauser datauser) {
        return datauserRepository.save(datauser);
    }

    @Override
    public void deleteDatauserById(Long id) {
        datauserRepository.deleteById(id);
    }


    @Override
    public Iterable<Datauser> findAllByDepartment(Department department) {
        return datauserRepository.findAllByDepartment(department);
    }

    @Override
    public Iterable<Datauser> findAll(Department department) {
        return datauserRepository.findAll();
    }

    @Override
    public Iterable<Datauser> findAll() {
        return datauserRepository.findAll();
    }


}
