package com.dio.rest.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.rest.auth.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}