<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%-- <jsp:include page="/StudentMangement/WebContent/WEB-INF/jsp/result.jsp/index.jsp"/> --%>
<body>
	<%-- <c:import url="/StudentMangement/WebContent/WEB-INF/jsp/result.jsp/result.jsp/index.jsp"" /> --%>
	<h2>User Registration Page</h2>
	<form action="addnewuser" method="post">
		<table>

			<tr>
				<td>First Name :</td>
				<td><input type="text" name="firstName" />
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lastName" />
			</tr>

			<tr>
				<td>Email :</td>
				<td><input type="text" name="email" />
			</tr>

			<tr>
				<td>Mobile Number :</td>
				<td><input type="text" name="mobileNumber" />
			</tr>
			<tr>
				<td><input type="submit" name="action1" value="Add User" /></td>
			</tr>
			
		</table>
	</form>
</body>
</html>