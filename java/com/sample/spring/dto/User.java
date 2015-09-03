package com.sample.spring.dto;

public class User {

	int userid;
	String name;
	String password;
	String mailid;
	String address;
	int contactno;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", password="
				+ password + ", mailid=" + mailid + ", address=" + address
				+ ", contactno=" + contactno + "]";
	}

}
