package com.sample.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.spring.dao.Userdao;
import com.sample.spring.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	Userdao userdao;

	@Override
	public void insertData(User user) {
		userdao.insertData(user);
	}

	@Override
	public List<User> getUserList() {
		return userdao.getUserList();
	}

	@Override
	public User performLogin(String name, String password) {
	
		return userdao.performLogin(name,password);
	}

	@Override
	public String update(User user) {
		
		return userdao.update(user);
		
	}

	@Override
	public void deleteData(String id) {
		
		userdao.deleteData(id);
	}

	@Override
	public String updateData(User user) {
		return userdao.updateData(user);
		
	}

	@Override
	public User performSelect(int userid) {
		return userdao.performSelect(userid);
	}

	
}
