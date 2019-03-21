package com.dl.user;

public class MyUser {
	
	private Integer id;
	private String account;
	private String password;
	private String date;
	private String username;
	private String phone;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", account=" + account + ", password=" + password + ", date=" + date + ", username="
				+ username + ", phone=" + phone + "]";
	}
	
	
	

}
