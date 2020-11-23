package cn.sinven.springbootweb.dao;

import cn.sinven.springbootweb.entity.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
@Component
public interface DepartmentDao {
    @Select("select * from department where id=#{id}")
    public Department findById(Integer id);

    @Select("select * from department ")
    public List<Department> findAll();

    @Delete("delete from department where id=#{id}" )
    public int delete(Integer id);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int edit(Department department);
    @Options(useGeneratedKeys = true,keyProperty ="id")
    @Insert("insert into department values(null,#{departmentName})")
    public int add(Department department);
}
