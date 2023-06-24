<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border=1>
	<tr>
		<td>Code
		<td>FIRST NAME
		<td>LAST NAME
		<td>EXTENSION

	</tr>
	<c:forEach var="employee" items="${employeesList}">
		<tr>
			<td>${employee.employeeNumber}
			<td>${employee.firstName}
			<td>${employee.lastName}
			<td>${employee.extension}

		</tr>
	</c:forEach>

</table>
<a href="\">Back to main menu</a>

