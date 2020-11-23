package cn.sinven.controller;/*
 @author lj

 @create 2020-10-12 17:40
 
 @email 1624058512@qq.com 
 */

import cn.sinven.entity.Employee;
import cn.sinven.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    EmployeeService es;

    /**
     * 查询数据存放到缓存
     * @param id
     * @return
     */
    @GetMapping("/index/{id}")
    public Employee index(@PathVariable Integer id){
        return es.finEmpById(id);
    }

    /**
     * 修改数据
     * @param employee
     * @return
     */
    @GetMapping("/index")
    public String editEmp(Employee employee){
        if(es.editEmp(employee)!=null)
            return "success";
        else
            return "fail";
    }
    @GetMapping("/delemp/{id}")
    public String delEmp(@PathVariable Integer id){
        if(es.delEmp(id)>0)
            return "success";
        else
            return "fail";
    }
    @GetMapping("/instemp")
    public String instEmp(Employee employee){
        if(es.instEmp(employee)!=null)
            return "success";
        else
            return "fail";
    }
}
