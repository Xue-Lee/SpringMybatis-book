<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>

	<h2>${client.clientName } 购物车</h2>
	<table width="700">
	<tr><td>编号</td><td>书籍</td><td>作者</td><td>价格</td><td>数量</td></tr>
	<c:forEach items="${cartList }" var="cart">
	<tr>
		<td>${cart.cartId }</td>
		<td>${cart.bookId.bookname }</td>
		<td>${cart.bookId.author }</td>
		<td>${cart.bookId.price }</td>
		<td>${cart.cnt}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>