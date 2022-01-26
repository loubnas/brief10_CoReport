package com.bamcoreport.web.api.identity.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "profile")
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenantid")
    private Tenant tenantId;

    @Column(name = "isdefault", columnDefinition = "boolean default false")
    private boolean isDefault;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "description",columnDefinition="TEXT")
    private String description;

    @CreationTimestamp
    @Column(name = "creationdate")
    private LocalDateTime creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "createdby")
    private User createdBy;

    @UpdateTimestamp
    @Column(name = "lastupdatedate")
    private LocalDateTime lastUpdateDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lastupdateby")
    private User lastUpdateBy;

    public Profile(){

    }

    public Profile(Long id, Tenant tenantId, boolean isDefault, String name, String description, LocalDateTime creationDate, User createdBy, LocalDateTime lastUpdateDate, User lastUpdateBy) {
        this.id = id;
        this.tenantId = tenantId;
        this.isDefault = isDefault;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateBy = lastUpdateBy;
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

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public User getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(User lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", tenantId=" + tenantId +
                ", isDefault=" + isDefault +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", createdBy=" + createdBy +
                ", lastUpdateDate=" + lastUpdateDate +
                ", lastUpdateBy=" + lastUpdateBy +
                '}';
    }
}
