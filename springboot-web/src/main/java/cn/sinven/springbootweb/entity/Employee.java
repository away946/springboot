package cn.sinven.springbootweb.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Employee {

    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer dId;
    private Department department;
    private Date birth;


}
