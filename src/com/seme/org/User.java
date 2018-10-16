package com.seme.org;

import java.util.HashSet;
import java.util.Set;

public class User {
    private long id;
    private String username;
    private String password;
    private Role role1;
    private Set<Role> role;

    public Role getRole1() {
        return role1;
    }

    public void setRole1(Role role1) {
        this.role1 = role1;
    }

    public User() {
        role = new HashSet<>();
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
