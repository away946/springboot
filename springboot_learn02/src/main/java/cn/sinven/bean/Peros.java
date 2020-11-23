package cn.sinven.bean;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author lj
 * @create 2020-09-10 16:57
 * @email 1624058512@qq.com
 */
@Component
@ConfigurationProperties(prefix = "peros")
@PropertySource("classpath:peros.properties")
@Validated
public class Peros {
    // @Value("${peros.pname}")
    // @Email
    String pname;
    String sex;
    // @Value("#{${peros.age}*100}")
    Integer age;
    Map<String, String> map;
    List<Object> list;
    Boolean boss;
    page p;
    Date birth;

    @Override
    public String toString() {
        return "Peros{" +
                "pname='" + pname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", map=" + map +
                ", list=" + list +
                ", boss=" + boss +
                ", p=" + p +
                ", birth=" + birth +
                '}';
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }


    public page getP() {
        return p;
    }

    public void setP(page p) {
        this.p = p;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}
