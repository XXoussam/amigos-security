package com.example.amigossecurity.jwt;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsernameAndPasswordAuthenticationRequest {

    private String Username;
    private String password;

    public UsernameAndPasswordAuthenticationRequest() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
