package com.java.model;

public class Like extends BaseEntity{
    private post p;
    private User user;

    public post getP() {
        return p;
    }

    public void setP(post p) {
        this.p = p;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
