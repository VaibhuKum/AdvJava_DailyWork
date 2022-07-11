package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assignment1_2")
public class Assignment1_2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String value1 = request.getParameter("value1");
		int value1 = Integer.parseInt(request.getParameter("value1"));
//		String value2 = request.getParameter("value2");
		int value2 = Integer.parseInt(request.getParameter("value2"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		
		if(request.getParameter("num1").equals("add"))
        {
//        int num3 =Integer.parseInt(value1)+ Integer.parseInt(value2);
			int num3=value1+value2;
        out.write("<h2>The sum is : "+num3+"</h2>");
        }
		else if(request.getParameter("num1").equals("sub"))
        {

//        int num4 = Integer.parseInt(value1)- Integer.parseInt(value2);
			int num4=value1-value2;
        out.write("<h2>The subtraction is : "+num4+"</h2>");
        out.write("</body></html>");
        };

	}

	
}
