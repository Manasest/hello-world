<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">
	
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile Number</th>
		</tr>

		 <c:forEach var="user" items="${vlist}">   
   <tr> 
    
    
   <td><c:out value="${user.firstName}"> </c:out></td>  
   <td><c:out value="${user.lastName}"></c:out></td>  
   <td><c:out value="${user.email}"></c:out></td>  
   <td><c:out value="${user.mobileNumber}"></c:out></td>  
   
   </tr>  
   </c:forEach>  

	</table>
</body>
</html>