package com.gom.myapplication;

public class User {

    private String userName;
    private int money;

    public User(String userName, int money) {
        this.userName = userName;
        this.money =  money;

    }

    public String getUserName() {
        return userName;
    }

    public int getMoney() {
        return money;
    }
}
