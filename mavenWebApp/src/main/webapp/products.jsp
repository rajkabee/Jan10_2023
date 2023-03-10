<%@ taglib prefix="c" uri="http://java.com.sun/jsp/jstl/core" %>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${msg}
	<h1>Expression</h1>
	<%=1<2 %>
	<br>
	<%=request.getAttribute("msg") %>
	<h1>Scriplet</h1>
	<%
		int x=123;
		x%=19;
		out.print("x: "+x);
	%>
	
	<h1>Declaration</h1>O
	<%!
	String name="sagun Shrestha";
	%>
	<%=name %>
	<c:if test="true">
		<h3>TRUE</h3>
	</c:if>
</body>
</html>