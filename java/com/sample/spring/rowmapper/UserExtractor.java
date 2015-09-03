package com.sample.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sample.spring.dto.User;

public class UserExtractor implements ResultSetExtractor<User> {  
	  
	 public User extractData(ResultSet resultSet) throws SQLException,  
	   DataAccessException {  
	    
	  User user = new User();  
	    
	  user.setUserid(resultSet.getInt(1));  
	  user.setName(resultSet.getString(2));  
	  user.setPassword(resultSet.getString(3));  
	  user.setMailid(resultSet.getString(4));  
	  user.setAddress(resultSet.getString(5)); 
	  user.setContactno(resultSet.getInt(6));
	    
	  return user;  
	 }  
	  
	}  
