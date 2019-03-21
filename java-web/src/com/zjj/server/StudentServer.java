package com.zjj.server;

import java.util.List;

import com.zjj.dao.StudentDao;
import com.zjj.student.MyStudent;

public class StudentServer {
	
	private StudentDao sd;

	public StudentDao getSd() {
		return sd;
	}

	public void setSd(StudentDao sd) {
		this.sd = sd;
	}

	public StudentServer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<MyStudent> getAllStudent() {
		return sd.selectALLStudent();
	}

}
