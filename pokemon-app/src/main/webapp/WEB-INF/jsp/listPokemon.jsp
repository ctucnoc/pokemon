<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<title>Insert title here</title>
<style type="text/css">
.item-in-cart {
	width: 90%;
	height: 130px;
	border: 1px solid #e0e0e0;
	margin: auto;
	margin-top: 2px;
}

hr {
	border-top-color: #e0e0e0;
}

.image {
	width: 10%;
	float: left;
}

.desc {
	width: 85%;
	height: 130px;
	float: left;
}

.desc p {
	font-size: 15px;
	color: black;
}

.desc small {
	font-size: 13px;
	text-transform: lowercase;
	color: black;
}

.detail {
	width: 5%;
	float: left;
	text-align: center;
}

.detail a {
	color: inherit;
	text-decoration: none !important;
}

.detail a:hover {
	color: #555555;
}

.corazon {
	display: inline-block;
	font-size: 25px;
	text-shadow: 0 0 25px #222, 1px 1px 0 #450505;
	color: #5e0000;
	animation: latidos .5s infinite;
	transform-origin: center;
}
</style>
</head>
<body>
	<hr style="width: 90%; align-content: center; margin-top: 10px;">
	<hr style="width: 90%; align-content: center; margin-top: 10px;">
	<c:forEach var="results" items="${listPokemon}" varStatus="status">
		<div class="item-in-cart">
			<div class="image">
				<center>
					<img alt="cart item" src="${results.urlImg}" width="124"
						height="124" />
				</center>
			</div>
			<div class="desc">
				<p>${results.name}</p>
				<small>${results.url}</small>
			</div>
			<div class="detail corazon">
				<a href="${pageContext.request.contextPath}/detail?p=${results.number}">&#x2665;</a>
			</div>
		</div>
	</c:forEach>
</body>
</html>