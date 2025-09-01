<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객의 주문 리스트</title>
</head>
<body>
	<h3>아이디 ${userOrder.userid }고객의 모든 주문 리스트</h3>
	<hr/>
	<h4>고객 이름 : ${userOrder.username }</h4>
	<h4>주문번호 / 주문이름</h4>
	<c:forEach items="${userOrder.orderDtos }" var="order">
		${order.orderid } / ${order.ordername } <br />
	</c:forEach>
		
	

</body>
</html>