package com.hcl.iconfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.iconfc.dto.UserDTO;
import com.hcl.iconfc.entity.user;
import com.hcl.iconfc.service.UserService;

@RestController
@RequestMapping("api/iconfc/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save")
	public user saveUser(@RequestBody UserDTO user) {

		return userService.saveUser(user);
	}
}
