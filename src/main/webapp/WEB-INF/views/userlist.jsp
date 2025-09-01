<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 리스트</title>
</head>
<body>
	<h4>모든 고객 리스트</h4>
	<hr/>
	<c:forEach items="${userList }" var="user">
		${user.userid } / ${user.username } <br />
	</c:forEach>

</body>
</html>