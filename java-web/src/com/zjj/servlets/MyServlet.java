package com.zjj.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


import com.zjj.server.StudentServer;
import com.zjj.student.MyStudent;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		

		WebApplicationContext wc = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		StudentServer ss = (StudentServer) wc.getBean("studentServer");
		request.setCharacterEncoding("utf-8");
		String parameter = request.getParameter("action");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		StringBuffer out = new StringBuffer(8000);
		
		System.out.println(parameter);
		if("selectAllStudent".equals(parameter)) {
			List<MyStudent> mss = ss.getAllStudent();
			out.append("[");
			for(MyStudent ms:mss) {
				//System.out.println(ms);
				out.append("{");
				out.append("\"no\":\"");
				out.append(ms.getNo());
				out.append("\",\"name\":\"");
				out.append(ms.getName());
				out.append("\",\"num\":\"");
				out.append(ms.getNum());
				out.append("\"}");
				out.append(",");
			}
		}
		out.delete(out.length()-1, out.length());
		out.append("]");
		System.out.println(out);
		writer.print(out);
	}
	
	/*
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		WebApplicationContext wc = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		StudentServer ss = (StudentServer) wc.getBean("studentServer");
		request.setCharacterEncoding("utf-8");
		String parameter = request.getParameter("action");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		StringBuffer out = new StringBuffer(8000);
		
		
	
			
			List<MyStudent> mss = ss.getAllStudent();
			out.append("[");
			for(MyStudent ms:mss) {
				//System.out.println(ms);
				out.append("{");
				out.append("\"no\"=");
				out.append(ms.getNo());
				out.append(",\"name\"=");
				out.append(ms.getName());
				out.append(",\"num\"=");
				out.append(ms.getNum());
				out.append("}");
				out.append(",");
		}
			out.delete(out.length()-1, out.length());
			out.append("]");
			System.out.println(out);
		//writer.println(out);
	}
*/
}
