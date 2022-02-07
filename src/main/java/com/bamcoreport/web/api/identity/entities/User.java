package com.bamcoreport.web.api.identity.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonIgnore
    @OneToOne(targetEntity = UserContactInfo.class, mappedBy = "userId")
    private UserContactInfo userContactInfo;

    @Column(nullable = true, name = "enabled", columnDefinition = "boolean default false")
    private Boolean enabled;

    @JsonBackReference
    @Column(name = "username")
    private String username;

    @JsonBackReference
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

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manageruserid")
    private User managerUserId;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "managerUserId")
    private List<User> managerUsers=new ArrayList<>();

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "createdby")
    private User createdBy;


   @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "createdBy")
    private List<User> createdUsers=new ArrayList<>();



    @CreationTimestamp
    @Column(name = "creationdate")
    private LocalDateTime creationDate;

    @UpdateTimestamp
    @Column(name = "lastupdate")
    private LocalDateTime lastUpdate;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "createdBy")
    private List<Role> roles=new ArrayList<>();


    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "createdBy")
    private List<Group> groups =new ArrayList<>();

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "userId")
    private List<ProfileMember> profileMembers=new ArrayList<>();


    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "userId")
    private List<UserMembership> userMemberships=new ArrayList<>();

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "assignedBy")
    private List<UserMembership> assignebyUserMemberships=new ArrayList<>();


    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "createdBy")
    private List<Profile> profiles=new ArrayList<>();

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "lastUpdateBy")
    private List<Profile> lastUpdateByProfiles=new ArrayList<>();
}
