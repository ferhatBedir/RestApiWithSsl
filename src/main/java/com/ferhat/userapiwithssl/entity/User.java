package com.ferhat.userapiwithssl.entity;


import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;

    private String userFirstName;

    private String userLastName;


    public String getId() {
        return id;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
}
