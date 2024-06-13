package com.educationalsystembackend.pojo;

/**
 * ClassName:admin
 * Package:com.educationalsystembackend.pojo
 * Description:
 *
 * @Author: Bock
 * @Create:2023/12/2716:33
 * @Version 1.0
 */
public class Admin {
    private Integer id;
    private String account;
    private String password;

    public Admin() {
    }

    public Admin(Integer id, String account, String password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "admin{id = " + id + ", account = " + account + ", password = " + password + "}";
    }
}
