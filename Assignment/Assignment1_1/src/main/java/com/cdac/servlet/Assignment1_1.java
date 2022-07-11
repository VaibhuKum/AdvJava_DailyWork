package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Assignment1_1")
public class Assignment1_1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value1 = request.getParameter("value1");
		String value2 = request.getParameter("value2");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Addition Of Two Numbers is : "+(Integer.parseInt(value1)+Integer.parseInt(value2))+"</h1>");
//		out.write("<h2>The sum is "+ ( Integer.parseInt(num1)+ Integer.parseInt(num2))+"</h2>");

		out.write("</body></html>");
	}

}
