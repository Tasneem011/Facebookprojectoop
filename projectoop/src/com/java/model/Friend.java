package com.java.model;

import java.util.List;

public class Friend extends Data{


    private List<User>user;


    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
