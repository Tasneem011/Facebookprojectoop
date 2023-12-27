package com.java.model;

import java.util.List;

public class Chat extends  Data{

    private  User user;
    private List<Messages> messages;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Messages> getMessages() {
        return messages;
    }

    public void setMessages(List<Messages> messages) {
        this.messages = messages;
    }
}
