package com.sinven.config;

import com.sinven.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lj
 * @create 2020-09-28 16:47
 * @email 1624058512@qq.com
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
