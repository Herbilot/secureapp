package com.herbidev.secureapp.dao;

import java.util.Optional;

import com.herbidev.secureapp.entities.UserEntity;

public interface IUserDao extends Repository<UserEntity>{
	
	public Optional<UserEntity> login (String email, String password);

}
