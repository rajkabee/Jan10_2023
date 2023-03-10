<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="sessions">
		<input type="text" name="item" placeholder="New item">
		<input type="submit" value="submit">
</form>
<ul>
<c:forEach var="item" items="${toDoList}">
		<li><c:out value="${item}"/></li>
	</c:forEach>
</ul>
</body>
</html>