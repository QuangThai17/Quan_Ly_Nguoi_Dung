package com.example.demo2.model;

import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
//@Table(name = "datausers")
public class Datauser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "fullname")
    private String fullname;

    @Column(name = "descrip")
    private String descrip;

    @Column(name = "datebirth")
    private String datebirth;

    @Column(name = "address")
    private String address;

    @Column(name = "creator")
    private String creator;


    @Column(name = "updater")
    private String updater;

   // @Column(name = "update_day")
    private String update_day;

    @Column(name = "email")
    private String email;


    @ManyToOne
    @JoinColumn(name = "departmentid")
    private Department department;


    public Datauser(String fullname, String descip, String datebirth, String address,
                    String creator, String updater,String update_day, String email, Department department) {
        this.fullname = fullname;
        this.descrip = descip;
        this.datebirth = datebirth;
        this.address = address;
        this.creator = creator;
        this.updater = updater;
        this.update_day = update_day;
        this.email = email;
        this.department = department;

    }

    public Datauser() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getUpdate_day() {
        return update_day;
    }

    public void setUpdate_day(String update_day) {
        this.update_day = update_day;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
