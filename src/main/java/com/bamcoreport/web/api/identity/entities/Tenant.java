package com.bamcoreport.web.api.identity.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tenant")
public class Tenant implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created")
    private User created;

    @Column(name = "createdby", length = 50)
    private String createdBy;

    @Column(name = "description",columnDefinition="TEXT")
    private String description;

    @Column(name = "defaulttenant", columnDefinition = "boolean default false")
    private boolean defaultTenant;

    @Column(name = "iconname", length = 50)
    private String iconName;

    @Column(name = "iconpath")
    private String iconPath;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "status", length = 15)
    private String status;

    public Tenant(){

    }

    public Tenant(Long id, User created, String createdBy, String description, boolean defaultTenant, String iconName, String iconPath, String name, String status) {
        this.id = id;
        this.created = created;
        this.createdBy = createdBy;
        this.description = description;
        this.defaultTenant = defaultTenant;
        this.iconName = iconName;
        this.iconPath = iconPath;
        this.name = name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCreated() {
        return created;
    }

    public void setCreated(User created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDefaultTenant() {
        return defaultTenant;
    }

    public void setDefaultTenant(boolean defaultTenant) {
        this.defaultTenant = defaultTenant;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", created=" + created +
                ", createdBy='" + createdBy + '\'' +
                ", description='" + description + '\'' +
                ", defaultTenant=" + defaultTenant +
                ", iconName='" + iconName + '\'' +
                ", iconPath='" + iconPath + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
