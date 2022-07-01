package com.example.demo2.repository;

import com.example.demo2.model.Datauser;
import com.example.demo2.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatauserRepository  extends JpaRepository<Datauser, Long> {

    Iterable<Datauser> findAllByDepartment(Department department);
    // Spring Data JPA còn hỗ trợ thêm tự truy vấn đến cơ sở dữ liệu theo tên
    // như tên tương đương với câu truy vấn: select * from department where departmentid = ?
}
