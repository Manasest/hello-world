package com.estuate.service;

import java.util.List;

import com.estuate.dto.UserDto;

public interface UserService {
	public boolean validateUser(String userName , String passWord);
	public void userRegister(UserDto userDto);
	public List<UserDto> getList();
	public List<UserDto> getUserByName(String firstName);
}
