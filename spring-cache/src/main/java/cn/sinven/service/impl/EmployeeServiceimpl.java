package cn.sinven.service.impl;/*
 @author lj

 @create 2020-10-12 17:39
 
 @email 1624058512@qq.com 
 */

import cn.sinven.entity.Employee;
import cn.sinven.mapper.EmployeeMapper;
import cn.sinven.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"emp"})
public class EmployeeServiceimpl implements EmployeeService {
    @Autowired
    EmployeeMapper em;

    /**
     * 查询数据存放到缓存
     * @param id
     * @return
     */

    @Cacheable(cacheNames = {"emp"})
    public Employee finEmpById(Integer id) {
        System.out.println("第一次查询"+id+"号员工的信息");
        return em.finEmpById(id);
    }

    /**
     * 修改数据库数据库数据并 key=#result.id 的缓存内容
     * @param employee
     * @return
     */

    @CachePut(cacheNames = {"emp"},key = "#result.id")
    public Employee editEmp(Employee employee) {
        if(em.editEmp(employee)>0)
            return employee;
        else
            return null;
    }

    /**
     * 删除一条数据库数据 并清空当前数据缓存
     * 加了 allEntries = true 这个表示删除一条数据库数据 并清空所有数据缓存
     * @param id
     * @return
     */
    @Override
    @CacheEvict(cacheNames = {"emp"},allEntries = true)
    public Integer delEmp(Integer id) {
        return em.delEmp(id);
    }

    @Override
    public Employee instEmp(Employee employee) {
        return em.instEmp(employee);
    }

}
