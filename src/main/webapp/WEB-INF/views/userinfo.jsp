<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 세부정보</title>
</head>
<body>
	<h4>kim님의 회원 세부 정보</h4>
	<hr/>
	${userinfo.userid } / ${userinfo.username } / 
	${userinfo.useraddress } / ${userinfo.userphone } <br />
	

</body>
</html>