package com.dwsj.webstore.user;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity(name = "Authorities")
public class Authorities implements Serializable {


    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USERNAME")
    private User user;
    @Column(name = "AUTHORITY")
    private String authority;

    public Authorities(User user, String authority) {
        this.user = user;
        this.authority = authority;
    }

    public Authorities() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
