package com.duong.casemodule6.entity.user;

import com.duong.casemodule6.entity.user.AppUser;

import javax.persistence.*;

@Entity
@Table(name = "guest")
public class Guest {
    @Id
    @GeneratedValue
    private Long id;
    private String fullName;
    private String image;
    private String address;
    private String phone;
    @ManyToOne
    private AppUser appUser;

    public Guest() {
    }

    public Guest(Long id, String fullName, String image, String address, String phone, AppUser appUser) {
        this.id = id;
        this.fullName = fullName;
        this.image = image;
        this.address = address;
        this.phone = phone;
        this.appUser = appUser;
    }

    public Guest(String fullName, String image, String address, String phone, AppUser appUser) {
        this.fullName = fullName;
        this.image = image;
        this.address = address;
        this.phone = phone;
        this.appUser = appUser;
    }

    public Guest(AppUser appUser) {
        this.appUser = appUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}
