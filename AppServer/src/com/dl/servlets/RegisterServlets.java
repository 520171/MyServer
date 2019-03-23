package com.dl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.dl.server.MyServer;
import com.dl.user.MyUser;

/**
 * Servlet implementation class RegisterServlets
 */
public class RegisterServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/plain;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		MyServer myServer = (MyServer) webApplicationContext.getBean("myServer");
		
		/*
		 * 获取请求的数据,根据查询语句的查询结果是否为空判断账号密码是否错误
		 */
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String date = request.getParameter("date");
		System.out.println(account + " " + password + "  " + date);
		
		try {
			myServer.addUser(new MyUser(account, password, date, null, null));
		}catch (Exception e) {
			// TODO: handle exception
			PrintWriter writer = response.getWriter();
			writer.write("fail");
			writer.close();
		}
		
		
		/*
		
		if(null != myUser) {
			PrintWriter writer = response.getWriter();
			writer.write("success");
			writer.close();
		}
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
