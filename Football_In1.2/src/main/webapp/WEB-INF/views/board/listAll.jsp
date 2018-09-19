<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<html>
<head>
	<title>Board</title>
	<link rel="stylesheet" href="../resources/4/lux/bootstrap.css"
	media="screen">
	<link rel="stylesheet" href="../resources/_assets/css/custom.min.css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	
</head>
<body>
	<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-primary">
		<a class="navbar-brand" href="/">Football In</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="#">선수</a></li>
				<li class="nav-item"><a class="nav-link" href="#">팀</a></li>
				<li class="nav-item"><a class="nav-link" href="#">경기</a></li>
				<li class="nav-item"><a class="nav-link" href="#">경기장</a></li>
				<li class="nav-item active"><a class="nav-link" href="/board/listAll">게시판</a></li>
			</ul>
		</div>
	</nav>
	<div class="jumbotron text-center">
		<h1>board list</h1>
	</div>
	<div class="container">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th style="width: 10px">BNO</th>
					<th>Title</th>
					<th>WRITER</th>
					<th>REGDATE</th>
					<th style="width: 40px">VIEWCNT</th>
				</tr>
			</thead>
			<c:forEach items="#{list }" var="boardVO">
				<tr>
					<td>${boardVO.bno }</td>
					<td><a href="/board/read?bno=${boardVO.bno }">${boardVO.title }</a></td>
					<td>${boardVO.writer }</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate }"/></td>
					<td> <span class="badge badge-primary badge-pill">${boardVO.viewcnt }</span></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>

<script>
	var result = '${msg}';
	
	if(result == "success"){
		alert("처리가 완료되었습니다.");
	}
</script>