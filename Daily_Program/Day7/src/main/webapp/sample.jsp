<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>small example</title>
</head>
<body>

<jsp:useBean id="emp" class="com.cdac.Employee" scope="session"></jsp:useBean>
<jsp:setProperty property="empno" name="emp" value="1001"/>
<jsp:setProperty property="name" name="emp" value="vaibhav"/>
<jsp:setProperty property="salary" name="emp" value="10000"/>

  <%--
	Employee emp2 = new Employee();
	emp2.setEmpno(1001);
	emp2.setName("vaibhav");
	emp2.setSalary(10000);
	session.setAttribute("emp",emp2);
--%>
<a href="basic.jsp">Click here</a>To continue
</body>
</html>