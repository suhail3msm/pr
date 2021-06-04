package com.hcl.iconfc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appUser")
public class user {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long user_id;
	@Column(name = "name")
	private String name;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public user(Long user_id, String name) {
		super();
		this.user_id = user_id;
		this.name = name;
	}

	public user() {
		super();
	}

}
