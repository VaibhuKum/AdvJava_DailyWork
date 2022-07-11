package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class tatkalBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		ServletConfig cfg = getServletConfig();
		int startTime = Integer.parseInt(cfg.getInitParameter("startTime"));
		
		LocalTime time = LocalTime.now();
		int timeRightNow = time.getHour();
		
		if(timeRightNow >= startTime)
			out.println("<h1>You are on right Time,Please processedthe booking...</h1> ");
		else
			out.println("<h1>Sorry...Tatkal Booking is not allowed right now</h1>");
		}

}
