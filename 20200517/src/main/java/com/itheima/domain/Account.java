package com.itheima.domain;

import java.io.Serializable;

/**
 * @Description: 账户表实体类
 * @PackageName: com.itheima.domain
 * @ClassName: Account
 * @Author: NH on 2020/5/18:15:52
 */
public class Account implements Serializable {
    private int id;
    private int uid;
    private Double money;
    private User user;


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
