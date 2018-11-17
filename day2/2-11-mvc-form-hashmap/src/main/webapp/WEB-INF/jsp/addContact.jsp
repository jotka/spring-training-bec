<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<title>Finsys Spring MVC training - HashMap Form</title>
<style>

    table {
	border: 1px solid;
	border-collapse: collapse;
}
td {
	border: 1px solid;
}
th {
	background: #ffbb00;
}
</style>
</head>
<body>

<h2>Spring 3 MVC HashMap Form</h2>
<form:form method="post" action="add.html" modelAttribute="contactForm">
	<table>
	<tr>
		<th>Key</th>
		<th>Value</th>
	</tr>
	<c:forEach items="${contactForm.contactMap}" var="contactMap" varStatus="status">
		<tr>
			<td>${contactMap.key}</td>
			<td><input name="contactMap['${contactMap.key}']" value="${contactMap.value}"/></td>
		</tr>
	</c:forEach>
</table>	
<br/>

<input type="submit" value="Save" />
	
</form:form>
</body>
</html>
