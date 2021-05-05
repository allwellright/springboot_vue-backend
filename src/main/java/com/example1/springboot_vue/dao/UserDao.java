package com.example1.springboot_vue.dao;

import com.example1.springboot_vue.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
public interface UserDao {
    public User getUserByMassage(@Param("username") String username, @Param("password") String password);
}
