package cn.sinven.springbootweb.service;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseService<T> {

    public int add(T c);

    public int delete(Integer id);

    public int edit(T c);

    public T findById(Integer id);

    public List<T> findAll();

    public int cuscount();

    public List<T> toPage(@Param("skip") int skip, @Param("size") int size);
}
