package com.estuate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estuate.dao.UserDaoImpl;
import com.estuate.dao.UserDao;
import com.estuate.dto.UserDto;
@Service
public class UserServiceImpl implements UserService{
	
	
	
	@Autowired
	UserDao userDao;
	
	/*private UserDao userDao;
	public UserDao getUserDao()
	
	    {
	
	        return this.userDao;
	
	    }
	
	 
	
	    public void setUserDao(UserDao userDao)
	
	    {

	        this.userDao = userDao;

	    }*/

	public boolean isValidUser(String userName ,String passWord) {
		UserDao userDao	= new UserDaoImpl();
		 UserDto userDetail= userDao.getUser( userName ,  passWord );
		 return false;
	}



	@Override
	public void userRegister(UserDto userDto) {
		UserDao userDao	= new UserDaoImpl();
		userDao.register(userDto);
	}



	@Override
	public List<UserDto> getList() {
		UserDao userDao	= new UserDaoImpl();
		return userDao.getAllUser();
	}



	@Override
	public boolean validateUser(String userName, String passWord) {
		if(!(userDao.getUser(userName, passWord)==null)){
			 if(!userName.equals("")&&!passWord.equals("")&&userName.equals("test")&&passWord.equals("test")){
			return true;
		}
		}
		return false;
	}



	@Override
	public List<UserDto> getUserByName(String firstName) {
		
		return userDao.filterUser(firstName);
	}

}
