package com.bamcoreport.web.api.identity.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "profilemember")
public class ProfileMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenantid")
    private Tenant tenantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profileid")
    private Profile profileId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupid")
    private Group groupId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleid")
    private Role roleId;

    public ProfileMember(){

    }

    public ProfileMember(Long id, Tenant tenantId, Profile profileId, User userId, Group groupId, Role roleId) {
        this.id = id;
        this.tenantId = tenantId;
        this.profileId = profileId;
        this.userId = userId;
        this.groupId = groupId;
        this.roleId = roleId;
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

    public Profile getProfileId() {
        return profileId;
    }

    public void setProfileId(Profile profileId) {
        this.profileId = profileId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "ProfileMember{" +
                "id=" + id +
                ", tenantId=" + tenantId +
                ", profileId=" + profileId +
                ", userId=" + userId +
                ", groupId=" + groupId +
                ", roleId=" + roleId +
                '}';
    }
}
