package com.example1.springboot_vue.dao;

import com.example1.springboot_vue.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMenus();
}
