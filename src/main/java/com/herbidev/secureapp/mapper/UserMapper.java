package com.herbidev.secureapp.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.herbidev.secureapp.dto.UserDto;
import com.herbidev.secureapp.entities.UserEntity;

public class UserMapper {
	
	public static List<UserDto> listUserEntityToListUserDto(List<UserEntity> users){
		
		return users.stream()
				.map(user -> toUserDto(user))
				.collect(Collectors.toList());
	}
	
	public static UserDto UserEntityToUserDto(UserEntity user){
		
		return  toUserDto(user);
	}
	
	public static UserDto toUserDto(UserEntity user) {
		
		return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
	}
	
	public static UserEntity toUserEntity(UserDto user) {
		
		return new UserEntity(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
	}

}
