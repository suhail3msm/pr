package com.hcl.iconfc.service;

import com.hcl.iconfc.dto.UserDTO;
import com.hcl.iconfc.entity.user;

public interface UserService {
	user saveUser(UserDTO user);
}
