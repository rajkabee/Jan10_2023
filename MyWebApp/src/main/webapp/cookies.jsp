<%@page import="jakarta.servlet.http.Cookie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="cookies" method="POST">
		<input type="text" name="product" placeholder="New Product">
		<input type="submit" value="submit">
	</form>
	
	<%
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie:cookies){
			if(cookie.getName().equalsIgnoreCase("products")){
				out.print(cookie.getValue());
			}
		}
	%>
</body>
</html>