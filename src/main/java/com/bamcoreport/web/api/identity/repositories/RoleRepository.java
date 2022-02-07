package com.bamcoreport.web.api.identity.repositories;

import com.bamcoreport.web.api.identity.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  RoleRepository extends JpaRepository<Role,Long> {
}
