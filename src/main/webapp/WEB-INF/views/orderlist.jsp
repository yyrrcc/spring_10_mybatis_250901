<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 리스트</title>
</head>
<body>
	<h4>모든 주문 리스트</h4>
	<hr/>
	<c:forEach items="${orderList }" var="order">
		${order.orderid } / ${order.ordername } / ${order.userid }<br />
	</c:forEach>

</body>
</html>