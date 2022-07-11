<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Really small example</title>
</head>
<body>

<jsp:useBean id="emp" class="com.cdac.Employee" scope="session"></jsp:useBean>
<br/> Empno :<jsp.getProperty property="empno" name="emp"/>
<br/> Name :<jsp.getProperty property="name" name="emp"/>
<br/> Salary :<jsp.getProperty property="salary" name="emp"/>

</body>
</html>