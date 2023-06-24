<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<h2>Current Employee Data</h2>
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
<h2>Edit Employee Data</h2>
<form action="edit-employees-data" method=POST>
<input TYPE = "hidden" name=employeeNumber VALUE=${employee.employeeNumber}>
FIRST NAME: <input name=firstName><br>
LAST NAME: <input name=lastName><br>
EXTENSION: <input name=extension><br>

<input type=submit value="EDIT">
</form>

<br><br>


<a href="\">Back to main menu</a>

