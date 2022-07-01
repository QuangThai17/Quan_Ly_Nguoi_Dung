package com.example.demo2.model;

import javax.persistence.*;

@Table
@Entity
public class Department {

    @Id
    @Column(name = "departmentid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentid;

    @Column(name = "departmentname")
    private String departmentname;

    @Column(name = "descrip")
    private String descrip;

    @Column(name = "createdate")
    private String createdate;

    @Column(name = "creator")
    private String creator;

    @Column(name = "updater")
    private String updater;

    @Column(name = "updateday")
    private String updateday;


    public Department() {
        super();
    }

    public Department(Long departmentid, String departmentname, String descrip, String creator, String createdate,
                      String updater, String updateday) {
        this.departmentid = departmentid;
        this.departmentname = departmentname;
        this.descrip = descrip;
        this.creator = creator;
        this.createdate = createdate;
        this.updater = updater;
        this.updateday = updateday;
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }


    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmentname() {return departmentname;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getUpdateday() {
        return updateday;
    }

    public void setUpdateday(String updateday) {
        this.updateday = updateday;
    }

}
