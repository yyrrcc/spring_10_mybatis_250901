<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모든 고객의 주문 리스트</title>
</head>
<body>
	<h3>모든 고객의 주문 리스트 확인하세요.</h3>
	<hr/>
	<c:forEach items="${allUserOrders }" var="userDto">
		고객 아이디 : ${userDto.userid } <br />
		고객 이름 : ${userDto.username } <br />
		<table border="1">
			<tr>
				<th>주문번호</th>
				<th>주문이름</th>
			</tr>
			<c:forEach items="${userDto.orderDtos }" var="order">
				<tr>
					<td>${order.orderid }</td>
					<td>${order.ordername }</td>
				</tr>
			</c:forEach>
		</table>
		<hr />
	</c:forEach>

</body>
</html>
