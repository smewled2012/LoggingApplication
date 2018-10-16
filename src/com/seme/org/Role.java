package com.seme.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Role {
    private long id;
    private String name;
    private Set<User> user;

    public Role() {
        user=new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }
}
