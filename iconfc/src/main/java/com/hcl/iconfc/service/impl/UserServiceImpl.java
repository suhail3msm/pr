package com.hcl.iconfc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.iconfc.dto.UserDTO;
import com.hcl.iconfc.entity.user;
import com.hcl.iconfc.repository.IUserRepository;
import com.hcl.iconfc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	IUserRepository iUserRepository;

	@Override
	public user saveUser(UserDTO user) {
		user usr = new user();
		usr.setName(user.getName());
		return iUserRepository.save(usr);
	}

}
