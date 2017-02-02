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
	<h2>Welcome to the Login Page</h2>
	<form  action="login/validate" method="get">
		<table>
			
			<tr>
				<td>UserName :</td>
				<td><input type="text" name="userName" />
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="text" name="passWord" />
			</tr>


			<tr>
				<td><input type="submit" name="action1" value="Login" /></td>
				<td><input type="submit" name="action2" value="Register" /></td>
				<!-- <td><a href="newregistration">Register Here</a></td> -->
			</tr>
		</table>
	</form>
</body>
</html>