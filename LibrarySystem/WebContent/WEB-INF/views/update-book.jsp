<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="left">
		<form:form action="updatebook" method="post" modelAttribute="editedbook">
			<table>
				<tr>
					<td>Book ID</td>
					<td><form:input path="bookId" /></td>
				</tr>
				<tr>
					<td>Book Name</td>
					<td><form:input path="bookName" /></td>
				</tr>

				<tr>
					<td>Book Type</td>
					<td><form:input path="bookType" /></td>
				</tr>

				<tr>
					<td>Book Author</td>
					<td><form:input path="author" /></td>
				</tr>

				<tr>
					<td>Book Year</td>
					<td><form:input path="year" /></td>
				</tr>
				<tr>
					<td>used</td>
					<td><form:checkbox path="used" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="update book"></td>
				</tr>

			</table>

		</form:form>
	</div>

</body>
</html>