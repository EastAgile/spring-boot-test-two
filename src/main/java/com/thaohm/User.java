package com.thaohm;

/**
 * Created by thaohm on 7/26/16.
 */
public class User {
    private Integer id;
    private String name;
    private String email;

    public User() {
    }

    public User(int id, String name, String email) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
