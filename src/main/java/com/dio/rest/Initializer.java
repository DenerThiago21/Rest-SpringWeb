package com.dio.rest;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dio.rest.auth.entity.Role;
import com.dio.rest.auth.entity.User;
import com.dio.rest.auth.service.RoleService;
import com.dio.rest.auth.service.UserService;

@Service
public class Initializer {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@PostConstruct
	public void criaUsuariosEPermissoes() {
		Role roleAdmin = new Role();

		roleAdmin.setName("USER");

		roleService.save(roleAdmin);

		User user = new User();
		user.setAtivo(true);
		user.setEmail("teste@teste.com");
		user.setNome("teste");
		user.setSenha(new BCryptPasswordEncoder().encode("123456"));
		user.setUsername("user");
		user.setRoles(Arrays.asList(roleAdmin));

		userService.save(user);

	}
}