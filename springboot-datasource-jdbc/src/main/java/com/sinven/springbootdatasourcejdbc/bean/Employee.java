package com.sinven.springbootdatasourcejdbc.bean;

import java.util.Date;

public class Employee {

    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Department dId;
    private Date birth;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getdId() {
        return dId;
    }

    public void setdId(Department dId) {
        this.dId = dId;
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }



    public Employee() {
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Employee(Integer id, String lastName, Integer gender, String email, Department dId, Date birth) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
        this.birth = birth;
    }
}
