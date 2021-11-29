<%@ page import="DAO.Number1DAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	gdgdgdgdg
	
	<table>
		<thead>
			<tr>
				<th>number1</th>
				<th>number2</th>
				<th>number3</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list }" var="row">
				<tr>
					<td>${row.num1 }</td>
					<td>${row.num2 }</td>
					<td>${row.num3 }</td>
				</tr>
			</c:forEach>
				
		</tbody>
	</table>
</body>
</html>