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

<script type="text/javascript">
function showName() {
	var name=document.getElementById("search").value;
	//alert(name);
	var url="selectedlist?name="+name;
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function () {
		
		 if(this.readyState==4 && this.status==200)
			{
			document.getElementById("searchSpan").innerHTML=this.responseText;
			//console.log(this.responseText);
	
			}
	};
	xhttp.open("GET",url,true);
	
	xhttp.send();
}

</script>
	<h2>Welcome to the List Page</h2>
	<input type="text" name="search" placeholder="search here"  id="search" onkeyup="showName()">
	<div id="searchSpan">
	<br>
	
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
	</div>
	
</body>
</html>