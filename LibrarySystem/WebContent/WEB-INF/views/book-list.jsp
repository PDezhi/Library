<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Computer Book List</title>
</head>
<body>
	<div align="left">
		<h1>Computer book List</h1>
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Type</th>
				<th>Author</th>
				<th>Published Year</th>
			</tr>

			<c:forEach var="book" items="${computerbookList}">
				<tr>
					<td><c:out value="${book.bookName}"></c:out></td>
					<td><c:out value="${book.bookType}"></c:out></td>
					<td><c:out value="${book.author}"></c:out></td>
					<td align="center"><c:out value="${book.year}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<div align="left">
		<form:form action="saveBook" method="post" modelAttribute="book">
			<table>
				<tr>
					<td>Book Name</td>
					<td><form:input path="bookName" /></td>
				</tr>

				<tr>
					<td>Book Type</td>
					<td><form:input path="bookTpye" /></td>
				</tr>

				<tr>
					<td>Book Author</td>
					<td><form:input path="author" /></td>
				</tr>

				<tr>
					<td>Published Year</td>
					<td><form:checkbox path="year" /></td>
				</tr>

			</table>

		</form:form>
	</div>



</body>
</html>