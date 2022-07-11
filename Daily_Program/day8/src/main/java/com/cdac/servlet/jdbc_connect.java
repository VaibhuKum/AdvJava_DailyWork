package com.cdac.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/jdbc_connect")
public class jdbc_connect extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ID = request.getParameter("ID");
		String Name = request.getParameter("Name");
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kolhapur", "root", "cdac");
			PreparedStatement st = conn.prepareStatement("insert into vaibhav(ID, Name) values(?, ?,)");
			st.setString(1, ID); //substituting ? with actual value
			st.setString(2, Name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
