package com.dwsj.webstore.user;

import com.dwsj.webstore.client.model.AnClient;

import javax.persistence.*;

@Entity
@Table(name = "A_USER")
public class User {

    @Id
    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "enabled")
    private int enabled;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
    private AnClient anClient;

    public User(String username, String password, int enabled, AnClient anClient) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.anClient = anClient;
    }

    public User() {
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
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

    public AnClient getAnClient() {
        return anClient;
    }

    public void setAnClient(AnClient anClient) {
        this.anClient = anClient;
    }
}
