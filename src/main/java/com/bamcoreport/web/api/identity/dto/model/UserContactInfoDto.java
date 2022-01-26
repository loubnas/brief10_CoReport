package com.bamcoreport.web.api.identity.dto.model;

import com.bamcoreport.web.api.identity.entities.Tenant;
import com.bamcoreport.web.api.identity.entities.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserContactInfoDto {

    private Tenant tenantId;
    @JsonIgnore
    private User userId;
    private String email;
    private String phone;
    private String mobile;
    private String fax;
    private String building;
    private String room;
    private String address;
    private String zipCode;
    private String city;
    private String state;
    private String country;
    private String website;
    private boolean personal;

    public Tenant getTenantId() {
        return tenantId;
    }

    public void setTenantId(Tenant tenantId) {
        this.tenantId = tenantId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isPersonal() {
        return personal;
    }

    public void setPersonal(boolean personal) {
        this.personal = personal;
    }
}
