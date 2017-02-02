package com.estuate.dao;

import java.util.List;

import com.estuate.dto.UserDto;

public interface UserDao  {
	/**
	 * 
	 * @param email
	 * @param passWord
	 * @return boolean
	 * @throws Exception
	 */
	UserDto getUser(String  userName , String passWord) ;
	
	/**
	 *  @return void
	 * @param user
	 */
	void register(UserDto user );
	
	/**
	 * @return List type
	 */
	List<UserDto> getAllUser();
	/**
	 * 
	 * @return List type
	 */
	List<UserDto> filterUser(String firstName);
	
}


