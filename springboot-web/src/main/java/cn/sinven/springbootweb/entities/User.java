package cn.sinven.springbootweb.entities;

import lombok.Data;

import java.util.Date;

/**
 * @author lj
 * @create 2020-09-25 10:14
 * @email 1624058512@qq.com
 */
@Data
public class User {
    Integer id;
    String userName;
    String password;
    String gender;
    Date birth;
    
}
