package cn.sinven.mapper;
/*
 @author lj

 @create 2020-10-12 17:30
 
 @email 1624058512@qq.com 
 */

import cn.sinven.entity.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {
    @Select("select *from employee where id=#{id}")
     Employee finEmpById(Integer id);
    @Update("update  employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
     Integer editEmp(Employee employee);
    @Delete(" delete from employee where id=#{id}")
    Integer delEmp(Integer id);
    @Insert("INSERT INTO  employee values(null,#{lastName},#{email},#{gender},#{dId})")
    Employee instEmp(Employee employee);
}
