<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form:form action="authenticate" modelAttribute="objUser">
	User name: <form:input path="userName" /><br />
	Password: <form:input path="password" /><br />
	<form:button>Login</form:button>
	</form:form>
</body>
</html>