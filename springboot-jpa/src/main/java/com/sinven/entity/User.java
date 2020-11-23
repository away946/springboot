package com.sinven.entity;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

/**
 * @author lj
 * @create 2020-09-28 16:39
 * @email 1624058512@qq.com
 */
@Entity
//关闭缓存 停止加载
@Proxy(lazy = false)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "user_name")
    String userName;
    String password;
    String sex;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
