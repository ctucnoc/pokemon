<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1, h2, h3, h4, h5, h6 {
	color: #34353e;
	line-height: 1.2;
	letter-spacing: -0.03em;
}

.container {
	width: auto;
}

.container .row {
	width: 99%;
	height: 400px;
	margin: auto;
	margin-top: 10px;
	border: 1px solid #e0e0e0;
}

.container .row .book-preview {
	width: 25%;
	height: 50%;
	float: left;
}

.book-title {
	color: #34353e;
	margin-bottom: 30px;
}

.container .row .book-title {
	width: 75%;
	height: 50%;
	float: left;
}

.book-title .name {
	font-size: 15px;
}

.book-title .description .light {
	font-size: 14px;
	text-transform: lowercase;
}

.light {
	font-weight: normal;
	font-size: 13px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="book-preview">
				<img alt="" src="${urlImg}" width="372" height="372" />
			</div>
			<div class="book-title">
				<h1 class="name">Tasa Captura : ${capturaRate}</h1>
				<h1 class="name">
					<span class="light">Color :${color.name}</span>
				</h1>
				<div class="description">
					<span class="light">Evoluciona de :
						${evolutionFromSpecie.name}</span>
				</div>
				<div>
				<h2>CADENA DE EVOLUCIÓN</h2>
				</div>
				<c:forEach var="results" items="${list}" varStatus="status">
					<h3>
						<p>${results}</p>
					</h3>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>