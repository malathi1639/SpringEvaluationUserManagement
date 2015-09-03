package com.sample.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sample.spring.dto.User;

public class UserRowMapper implements RowMapper<User> {  
	  
	 @Override  
	 public User mapRow(ResultSet resultSet, int line) throws SQLException {  
	  UserExtractor userExtractor = new UserExtractor();  
	  return userExtractor.extractData(resultSet);  
	 }  
	  
	}  