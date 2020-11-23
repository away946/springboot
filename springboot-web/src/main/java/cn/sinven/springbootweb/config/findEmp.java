package cn.sinven.springbootweb.config;

import cn.sinven.springbootweb.entities.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author shkstart
 * @create 2020-09-25 11:38
 * @email 251830091@qq.com
 */
public class findEmp implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        //从结果集里把数据得到
        Integer id=rs.getInt("id");
        String name=rs.getString("userName");
        String pwd= rs.getString("password");
        String gender=rs.getString("gender");
        Date birth=rs.getDate("birth");
        User user=new User();
        user.setId(id);
        user.setUserName(name);
        user.setBirth(birth);
        user.setPassword(pwd);
        user.setGender(gender);
        return user;
    }
}
