package cn.sinven.bean;

/**
 * @author lj
 * @create 2020-09-10 16:57
 * @email 1624058512@qq.com
 */

public class page {
    String name;
    Integer age;
    String sex;

    @Override
    public String toString() {
        return "page{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
