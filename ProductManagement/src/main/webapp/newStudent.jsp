<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>New Student</h1>
	<form action="addStudent" method="POST">
		<label>Name: </label><input type="text" name="name" placeholder="Students' Name"><br>
		<label>Email: </label><input type="email" name="email" placeholder="Email"><br>
		<label>Active: </label>
		<input type="radio" name="active" value="true"><label>Active</label>
		<input type="radio" name="active" value="false"><label>Inactive</label><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>