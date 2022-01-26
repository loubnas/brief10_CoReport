package com.bamcoreport.web.api.identity.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sequence")
public class Sequence implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenantid")
    private Tenant tenantId;

    @Column(name = "nextid")
    private Long nextId;

    public Sequence(){

    }

    public Sequence(Long id, Tenant tenantId, Long nextId) {
        this.id = id;
        this.tenantId = tenantId;
        this.nextId = nextId;
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

    public Long getNextId() {
        return nextId;
    }

    public void setNextId(Long nextId) {
        this.nextId = nextId;
    }

    @Override
    public String toString() {
        return "Sequence{" +
                "id=" + id +
                ", tenantId=" + tenantId +
                ", nextId=" + nextId +
                '}';
    }
}
