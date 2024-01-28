<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hey ${user.name} , you are successfully registered.
<br>
You have chosen the  below courses:
<br>
	<c:forEach var="course" items="${user.courses}">  
			<c:out value="${course}"/><br>
	</c:forEach>
<br>
You have chosen the  below batches:
<br>
	<c:forEach var="batch" items="${user.batches}">  
			<c:out value="${batch}"/><br>
	</c:forEach>
<br>
Your hidden name is ${user.hiddenMsg}
</body>
</html>