<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<h2>Data successfully updated.</h2><br>
<h3>Updated Data Summary.</h3>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<br><br>
<table border=1>
	<tr>
		<td>Code
		<td>FIRST NAME
		<td>LAST NAME
		<td>EXTENSION

	</tr>

		<tr>
			<td>${employee.employeeNumber}
			<td>${employee.firstName}
			<td>${employee.lastName}
			<td>${employee.extension}

		</tr>


</table>
<br><br>


<a href="\">Back to main menu</a>

