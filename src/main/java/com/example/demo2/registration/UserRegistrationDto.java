package com.example.demo2.registration;

public class UserRegistrationDto {
    private String username;
    private String password;

    public UserRegistrationDto(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public UserRegistrationDto() {

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
}
