package com.gom.myapplication;

public class UserTest {
    private User user;
    private int num;

    public UserTest(User user, int num) {
        this.user = user;
        this.num = num;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getNum() {

        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
