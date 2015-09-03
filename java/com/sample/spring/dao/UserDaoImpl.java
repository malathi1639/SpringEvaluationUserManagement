package com.sample.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.sample.spring.dto.User;
import com.sample.spring.rowmapper.UserRowMapper;

@Repository
public class UserDaoImpl implements Userdao {

	private static final String performLogin = null;
	@Autowired
	DataSource dataSource;

	public void insertData(User user) {
		System.out.println("this is insert");

		String sql = "INSERT INTO user_management "
				+ "(name,password, mailid, address,contactno) VALUES (?, ?, ?, ?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { user.getName(), user.getPassword(),
						user.getMailid(), user.getAddress(),
						user.getContactno() });

	}

	public List<User> getUserList() {
		List userList = new ArrayList();
		System.out.println("hi");
		String sql = "select * from user_management";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		userList = jdbcTemplate.query(sql, new UserRowMapper());
		return userList;
	}

	/*@Override
	public User performLogin(String name, String password) {
	
		String sql = "select * from user_management where name=? and password=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		User userList = (User) jdbcTemplate.query(sql,new Object[] { name,password }, new UserRowMapper());
		return userList;
	
	}*/
	
	
	
	public User performLogin(String name, String password) {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select name,password from user_management where name=? and password=?";
		try {
			User user = jdbcTemplate.query(sql, new ResultSetExtractor<User>() {

				public User extractData(ResultSet rs) throws SQLException,
						DataAccessException {
					if (rs.next()) {
						User user = new User();
						/*user.setUserid(rs.getInt(1));*/
						user.setName(rs.getString(1));
						user.setPassword(rs.getString(2));
						/*user.setMailid(rs.getString(4));
						user.setAddress(rs.getString(5));
						user.setContactno(rs.getInt(6));*/
						return user;
					}
					return null;
				}
			}, new Object[] { name, password });
			if (user != null) {
				return user;
			}
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
		return null;
	}

	@Override
	public String update(User user) {

		String sql = "UPDATE user_management set password = ? where name = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql,
				new Object[] { user.getPassword(), user.getName() });

		return null;

	}

	@Override
	public void deleteData(String id) {

		String sql = "delete from user_management where userid=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);
	}

	@Override
	public String updateData(User user) {
		
		System.out.println("update data");
		String sql = "UPDATE user_management set password=?,mailid=?,address=?,contactno=? where name=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql,new Object[] {  user.getPassword(),
						user.getMailid(), user.getAddress(), user.getContactno(),user.getName() });
		return null;

	}

	@Override
	public User performSelect(int userid) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "select * from user_management where userid=?";
		try {
			User user = jdbcTemplate.query(sql, new ResultSetExtractor<User>() {

				public User extractData(ResultSet rs) throws SQLException,
						DataAccessException {
					if (rs.next()) {
						User user = new User();
						user.setUserid(rs.getInt(1));
						user.setName(rs.getString(2));
						user.setPassword(rs.getString(3));
						user.setMailid(rs.getString(4));
						user.setAddress(rs.getString(5));
						user.setContactno(rs.getInt(6));
						return user;
					}
					return null;
				}
			}, new Object[] { userid });
			if (user != null) {
				return user;
			}
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
		return null;
	}


}
