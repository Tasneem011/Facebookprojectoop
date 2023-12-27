package com.java.model;

import javax.xml.stream.events.Comment;
import java.util.List;

public class post extends SocialChats{

    private User user;
    private List<Like> like;
    private List<Comment> comment;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Like> getLike() {
        return like;
    }

    public void setLike(List<Like> like) {
        this.like = like;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
