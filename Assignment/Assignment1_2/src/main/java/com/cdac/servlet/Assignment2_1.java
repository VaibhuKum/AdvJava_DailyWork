package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/As2")
public class Assignment2_1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws NumberFormatException ,ServletException, IOException {
		String dateString = null;
		int age=0;
		
		try {
	     dateString =request.getParameter("dob");
		}catch(Exception e) {
			
							
		}
		LocalDate date = LocalDate.parse(dateString);
		//System.out.println(dateString);
		date.getYear();
		 LocalDate date2 = java.time.LocalDate.now();
		 
		//System.out.println(date2.getYear());
		//System.out.println(date.getYear());
		age=date2.getYear()-date.getYear();
		
		Period p = Period.between (date, date2);
		
		System.out.println("Years (Difference) = "+p.getYears());
	      System.out.println("Month (Difference) = "+p.getMonths());
	      System.out.println("Days (Difference) = "+p.getDays());
	      
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1> You are  "+age+" Years Old </h1>");
		out.write("<h1> You are "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days old</h1>");
		out.write("</body></html>");
	}

	

}