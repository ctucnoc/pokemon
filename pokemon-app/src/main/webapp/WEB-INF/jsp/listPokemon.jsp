<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<script src="${contextPath}/resources/js/jquery.js"></script>
<script src="${contextPath}/resources/js/jquery-ui.min.js"></script>
<script src="${contextPath}/resources/js/Grid.js"></script>
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
<body onload="storage();">

	<table style="width: 100%;" border="0" cellpadding="0" cellspacing="0">
		<tbody>
			<tr style="padding: 5px 5px;">
				<td class="titleApp">
					<div
						style="padding: 5px 5px; background-color: #5e0000; height: 59px; line-height: 74px;">
						<div
							style="height: 16px; line-height: 16px; padding: 10px 10px; font-size: 13px;">
							<h1 style="color: white;">POKE API</h1>
						</div>
					</div>

				</td>
			</tr>
		</tbody>
	</table>
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
				<a
					href="${pageContext.request.contextPath}/detail?p=${results.number}">&#x2665;
				</a>
			</div>
		</div>
	</c:forEach>
	<div>
		<button>
			<a href="javascript:previous();" value="${contextPath}" id="enlacee"
				name="mienlacee"> previus </a>
		</button>
		<button>
			<a href="javascript:next();" value="${contextPath}" id="enlace"
				name="mienlace"> next </a>
		</button>
	</div>
</body>
<script type="text/javascript">
	var limit = 15;
	function next() {
		var a=parseInt(getStorage(),10)+1;
		if (a >= 0) {
			var newOffset = limit * a
			var href = $("#enlace").attr('value') + "/findAll?offset="
					+ newOffset + "&limit=" + limit;
			//$("#enlace").attr('href',href);
			cambiarKey(a);
			window.location = href;
		}
	}
	function previous() {
		var b=parseInt(getStorage(),10)-1;
		if (b >= 0) {
			alert('dentro');
			var newOffsetp = limit * b;
			var href = $("#enlacee").attr('value') + "/findAll?offset="
					+ newOffsetp + "&limit=" + limit;
			//$("#enlace").attr('href',href);
			cambiarKey(b);
			window.location = href;
		}
	}

	function cambiarKey(a){
		sessionStorage.setItem('INF_DEF', a);
	}

	function storage() {
		if(sessionStorage.getItem('INF_DEF')==null){
			sessionStorage.setItem('INF_DEF', 0);
		}
	}
	function getStorage() {
		return sessionStorage.getItem('INF_DEF');
	}

</script>
</html>