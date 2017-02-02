package com.estuate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;









import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.estuate.util.ConnectionUtil;
import com.estuate.dto.UserDto;
@Repository
public class UserDaoImpl implements UserDao {
	private Connection connection;

	public UserDaoImpl() {
		
		connection=ConnectionUtil.getConnection();
	}

	@Override
	public UserDto getUser(String userName , String passWord) {
		/*String userName=userDto.getUserName();
		userDto.setUserName(userName);
		System.out.println(userName);
		return true;*/
//try {
			/*UserDto userDto= new UserDto();
			
			PreparedStatement preparedStatement = connection.prepareStatement("select  * from estuate.form1 where email=? and password = ? ");
			
			preparedStatement.setString(1, email);
			
			preparedStatement.setString(2, passWord);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				return (resultSet.getInt(1) > 0);

					String e = rs.getString("email");
					
					String p= rs.getString("password");
					
					if(e.equalsIgnoreCase("test") && (p.equals("test")))
					{
						return true;
					}
					
					else{
						//return false;
					}
					
			}
			
			else{
				return false;
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			return false;*/
		UserDto user = new UserDto();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select  * from kart.login where UserName=? and Password = ? ");
			
			preparedStatement.setString(1, userName);
			
			preparedStatement.setString(2, passWord);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			UserDto userDto=null;
			if(resultSet.next())
			{
					String uname = resultSet.getString("UserName");
					
					 String password= resultSet.getString("Password");
					/* if(!uname.equals("")&&!password.equals("")){*/
					 userDto=new UserDto();
					 user.setUserName(uname);
					 user.setPassWord(password);
					// }
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return user;
	}
	

	@Override
	public void register(UserDto user) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into kart.user (FirstName,LastName,Email,MobileNumber)values(?,?,?,?)");
			
			preparedStatement.setString(1, user.getFirstName());
			
			preparedStatement.setString(2, user.getLastName());
			
			preparedStatement.setString(3, user.getEmail());
			
			preparedStatement.setLong(4, user.getMobileNumber());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<UserDto> getAllUser() {
		List<UserDto> users = new ArrayList<UserDto>();
		
		try {
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select * from kart.user");
			
			while(resultSet.next()){
				UserDto user = new UserDto();
				
				//user.setId(resultSet.getInt("id"));
				
				user.setFirstName(resultSet.getString("FirstName"));
				
				user.setLastName(resultSet.getString("LastName"));
				
				user.setEmail(resultSet.getString("Email"));
				
				user.setMobileNumber(resultSet.getLong("MobileNumber"));
				
				users.add(user);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public List<UserDto> filterUser(String firstName) {
		List<UserDto> users = new ArrayList<UserDto>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from kart.user where FirstName like '"+firstName+"%'");
			while(resultSet.next()){
				UserDto user = new UserDto();
				user.setFirstName(resultSet.getString("FirstName"));
				user.setLastName(resultSet.getString("LastName"));
				user.setEmail(resultSet.getString("Email"));
				user.setMobileNumber(resultSet.getLong("MobileNumber"));
				//System.out.println(resultSet.getString("FirstName"));
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
