package com.sinven.springbootdatasourcejdbc.Mapper;

import com.sinven.springbootdatasourcejdbc.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.Collection;

//@Mapper
@Component
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDepartId(Integer id);

    @Select("select * from department ")
    public Collection<Department> getDepartAll();

    @Delete("delete from department where id=#{id}" )
    public int deleDepartId(Integer id);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updadepart(Department department);
    @Options(useGeneratedKeys = true,keyProperty ="id")
    @Insert("insert into department values(null,#{departmentName})")
    public int insertDepartId(Department department);
}
