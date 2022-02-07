package com.bamcoreport.web.api.identity.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "rejet")
@ToString

public class Rejet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private type flowType
    private type rejectNature
    private type entity
    private type declarationDate
    private type agencyCode
    private type userRegistrationNumber
    private type bu
    private type su
    private type regionalDelegation
    private type subDelegationType
    private type subDelegationName
    private type cliFileCode
    private type clientCode or Rib
    private type gravity
    private type zoneCode
    private type isWrongField
    private type errorCode
    private type errorLabel
    private type isRequestTaken
    private type actionDetail
    private type file
    private type TakenBy
}
