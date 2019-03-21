package com.zjj.student;

public class MyStudent {
	
	private Integer no;
	private String name;
	private String num;
	
	public MyStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "MyStudent [no=" + no + ", name=" + name + ", num=" + num + "]";
	}

	

}
