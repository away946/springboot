package cn.sinven.springbootelasticsearch.entity;
/*
 @author lj

 @create 2020-10-12 17:27
 
 @email 1624058512@qq.com 
 */

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Integer gender, Integer dId) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dId = dId;
    }

    private Integer dId;

}
