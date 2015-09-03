package com.sample.spring.service;

import java.util.List;

import com.sample.spring.dto.User;

public interface UserService 
{
		public User performLogin(String name, String password);
		 public void insertData(User user);  
		 public List<User> getUserList();  
		 public String update(User user);
		 public void deleteData(String id);
		 public String updateData(User user); 
		 public User performSelect(int userid);
		 
}
