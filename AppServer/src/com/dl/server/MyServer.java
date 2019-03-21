package com.dl.server;

import com.dl.dao.UserDao;
import com.dl.user.MyUser;

public class MyServer {
	
	private UserDao ud;
	
	MyUser queryOne(MyUser mu) {
		return ud.selectOne(mu);
	}
	
	void addUser (MyUser mu) {
		ud.insertUser(mu);
	}
	
	//void deleteUser(String account);
	void flushUser(String account) {
		ud.updateUser(account);
	}
	
	public MyServer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDao getUd() {
		return ud;
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	
	

}
