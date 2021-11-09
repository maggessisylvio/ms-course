package com.sylvio.hroauth.entities;

import java.io.Serializable;

public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String role_name;

    public Role() {
    }

    public Role(Long id, String roleName) {
        this.id = id;
        this.role_name = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return role_name;
    }

    public void setRoleName(String roleName) {
        this.role_name = roleName;
    }

}
