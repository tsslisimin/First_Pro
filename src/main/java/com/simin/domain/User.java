package com.simin.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 1.用户实体类
 */
@Entity
@Table(name="usertab")
public class User implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY )//

    private long id;

    @Column(name="username")
    private  String username;

    @Column(name="password")
    private  String password;

    @Column(name="name")
    private  String name;

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

    public String getPasswod() {
        return password;
    }

    public void setPasswod(String passwod) {
        this.password = passwod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwod='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
