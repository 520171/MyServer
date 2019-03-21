package com.dl.dao;

import com.dl.user.MyUser;

public interface UserDao {
	
	MyUser selectOne(MyUser mu);
	void insertUser (MyUser mu);
	//void deleteUser(String account);
	void updateUser(String account);
	
}
