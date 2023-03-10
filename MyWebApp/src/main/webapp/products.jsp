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
<h1>Products</h1>
<ul>
	<c:forEach var="item" begin="0" end="3">
		<li><c:out value="${productList[item]}"/></li>
	</c:forEach>
	<c:forEach var="item" items="${productList}">
		<li><c:out value="${item}"/></li>
	</c:forEach>
</ul>
</body>
</html>