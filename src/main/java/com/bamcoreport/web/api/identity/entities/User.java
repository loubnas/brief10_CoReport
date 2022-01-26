package com.bamcoreport.web.api.identity.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenantid")
    private Tenant tenantId;

    @JsonIgnore
    @OneToOne(targetEntity = UserContactInfo.class, mappedBy = "userId")
    private UserContactInfo userContactInfo;

    @Column(name = "enabled", columnDefinition = "boolean default false")
    private boolean enabled;

    @Column(name = "username")
    private String username;

    @Column(name = "password", length = 60)
    private String password;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "jobtitle")
    private String jobTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manageruserid")
    private User managerUserId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "createdby")
    private User createdBy;

    @CreationTimestamp
    @Column(name = "creationdate")
    private LocalDateTime creationDate;

    @UpdateTimestamp
    @Column(name = "lastupdate")
    private LocalDateTime lastUpdate;

    public User(){

    }

    public User(Long id, Tenant tenantId,UserContactInfo userContactInfo, boolean enabled, String username, String password, String firstname, String lastname, String title, String jobTitle, User managerUserId, User createdBy, LocalDateTime creationDate, LocalDateTime lastUpdate) {
        this.id = id;
        this.tenantId = tenantId;
        this.userContactInfo = userContactInfo;
        this.enabled = enabled;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.jobTitle = jobTitle;
        this.managerUserId = managerUserId;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdate = lastUpdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tenant getTenantId() {
        return tenantId;
    }

    public void setTenantId(Tenant tenantId) {
        this.tenantId = tenantId;
    }

    public UserContactInfo getUserContactInfo() {
        return userContactInfo;
    }

    public void setUserContactInfo(UserContactInfo userContactInfo) {
        this.userContactInfo = userContactInfo;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public User getManagerUserId() {
        return managerUserId;
    }

    public void setManagerUserId(User managerUserId) {
        this.managerUserId = managerUserId;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", tenantId=" + tenantId +
                ", userContactInfo=" + userContactInfo +
                ", enabled=" + enabled +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", title='" + title + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", managerUserId=" + managerUserId +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
