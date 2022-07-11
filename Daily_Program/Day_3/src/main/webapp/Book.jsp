<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
try {
/* Create string of connection url within specified format with machine name, 
port number and database name. Here machine name id localhost and 
database name is usermaster. */ 
String connectionURL = "jdbc:mysql://localhost:3306/kolhapur"; 

// declare a connection by using Connection interface 
Connection connection = null; 

// Load JBBC driver "com.mysql.jdbc.Driver" 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

/* Create a connection by using getConnection() method that takes parameters of 
string type connection url, user name and password to connect to database. */ 
connection = DriverManager.getConnection(connectionURL, "root", "cdac");

PreparedStatement st = connection.prepareStatement("select * from book");

ResultSet rs= st.executeQuery();
//query result
while(rs.next()){
  //Display values
	//PrintWriter out= response.getWriter();
	out.write("<html><body>");
	out.write("<h2>BOOK ID : "+rs.getInt("BookId")+"</h2>");
	out.write("<h2>BOOK NAME : "+rs.getString("book_name")+"</h2>");
	out.write("<h2>BOOK PRICE : "+rs.getInt("price")+"</h2>");
	out.write("</body></html>");

}
connection.close();
}


catch(Exception ex){

out.println("Unable to connect to database.");
}
%>
</body>
</html>