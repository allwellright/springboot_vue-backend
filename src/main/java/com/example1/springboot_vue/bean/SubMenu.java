package com.example1.springboot_vue.bean;
// 分支导航
public class SubMenu {
    private int id;
    private String title;
    private String path;

    public SubMenu(int id, String title, String path) {
        this.id = id;
        this.title = title;
        this.path = path;
    }

    public SubMenu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "SubMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
