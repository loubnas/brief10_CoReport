package com.bamcoreport.web.api.identity.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "User_membership")
public class UserMembership implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenantid")
    private Tenant tenantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleid")
    private Role roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupid")
    private Group groupId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignedby")
    private User assignedBy;

    @CreationTimestamp
    @Column(name = "assigneddate")
    private LocalDateTime assignedDate;

    public UserMembership(){

    }

    public UserMembership(Long id, Tenant tenantId, User userId, Role roleId, Group groupId, User assignedBy, LocalDateTime assignedDate) {
        this.id = id;
        this.tenantId = tenantId;
        this.userId = userId;
        this.roleId = roleId;
        this.groupId = groupId;
        this.assignedBy = assignedBy;
        this.assignedDate = assignedDate;
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

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public User getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(User assignedBy) {
        this.assignedBy = assignedBy;
    }

    public LocalDateTime getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(LocalDateTime assignedDate) {
        this.assignedDate = assignedDate;
    }

    @Override
    public String toString() {
        return "UserMembership{" +
                "id=" + id +
                ", tenantId=" + tenantId +
                ", userId=" + userId +
                ", roleId=" + roleId +
                ", groupId=" + groupId +
                ", assignedBy=" + assignedBy +
                ", assignedDate=" + assignedDate +
                '}';
    }
}
