<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./public/table.css">
</head>
<body>
	<jsp:include page="../welcome.jsp"></jsp:include>
	<div class="container">
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>First name</th>
					<th>Last name</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.firstName }</td>
					<td>${user.lastName }</td>
					<td>${user.email }</td>
				</tr>
				</c:forEach>
				

			</tbody>
		</table>
	</div>
</body>
</html>