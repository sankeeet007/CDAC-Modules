<%@page import="java.util.List" %>
<%@page import="jakarta.persistence.Query" %>
<%@page import="in.cdac.entity.Category" %>
<%@page import="in.cdac.entity.Products" %>
<%@page import= "org.hibernate.Session" %>
<%@page import="org.hibernate.SessionFactory" %>
<%@page import= "org.hibernate.cfg.Configuration" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>
<! DOCTYPE html>
<html>
<head>
<meta charset= "UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome <%=session.getAttribute("userName") %>
	<table border='1'>
	<tr>
	<th>Name</th>
	<th>Description</th>
	<th>Image</th>
	</tr>
	
	<%
		Configuration hibernateConfiguration = new Configuration();
		hibernateConfiguration.configure("hbn.cfg.xml");
		hibernateConfiguration.addAnnotatedClass(Category.class);
		hibernateConfiguration.addAnnotatedClass(Products.class);
		try(SessionFactory hibernateFactory = hibernateConfiguration.buildSessionFactory();
				Session hibernateSession = hibernateFactory.openSession())
		{
			
			Query qrCategory = hibernateSession.createNamedQuery("allcategories", Category.class);
			List<Category> allcategories = qrCategory.getResultList();
					for(Category objCategory : allcategories)
					{

	%>
		<tr>
		<td><%=objCategory.getCategoryName() %></td>
		<td><%=objCategory.getCategoryDescription()%></td>
		<td><%=objCategory.getCategoryImageUrl() %></td>
		</tr>
	<%
		}
		}
	%>
	</table>
	</body>
	</html>