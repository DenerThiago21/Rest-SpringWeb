package com.dio.rest.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.rest.auth.entity.Role;
import com.dio.rest.auth.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository repository;

	public Role save(Role Role) {
		return repository.save(Role);
	}

	public Role findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Role> findAll() {
		return repository.findAll();
	}
}