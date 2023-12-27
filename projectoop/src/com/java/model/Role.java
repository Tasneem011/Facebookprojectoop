package com.java.model;

public class Role extends BaseEntity {
    private String name;
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
