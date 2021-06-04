package com.hcl.iconfc.dto;

public class UserDTO {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserDTO(String name) {
		super();
		this.name = name;
	}

	public UserDTO() {
		super();
	}

}
