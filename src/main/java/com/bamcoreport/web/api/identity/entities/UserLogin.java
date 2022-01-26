package com.bamcoreport.web.api.identity.entities;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_login")
public class UserLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenantid")
    private Tenant tenantId;

    @UpdateTimestamp
    @Column(name = "lastconnection")
    private LocalDateTime lastConnection;

    public UserLogin(){

    }

    public UserLogin(Long id, Tenant tenantId, LocalDateTime lastConnection) {
        this.id = id;
        this.tenantId = tenantId;
        this.lastConnection = lastConnection;
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

    public LocalDateTime getLastConnection() {
        return lastConnection;
    }

    public void setLastConnection(LocalDateTime lastConnection) {
        this.lastConnection = lastConnection;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "id=" + id +
                ", tenantId=" + tenantId +
                ", lastConnection=" + lastConnection +
                '}';
    }
}
