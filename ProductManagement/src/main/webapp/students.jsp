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
	<h1>Students</h1>
	<a href="addStudent"><button>New Student</button></a>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Active</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="st" items="${ stList }">
				<tr>
					<td>${st.id}</td>
					<td>${st.name}</td>
					<td>${st.email}</td>
					<td>${st.active}</td>
					<td>
						<a><button>Delete</button></a>
						<a><button>Edit</button></a>
					</td>
					
				</tr>
			</c:forEach> 
		</tbody>
	</table>
</body>
</html>