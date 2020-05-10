<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="./commons/_header.jspf" %>
</head>
<body>
<%@ include file="./commons/_top.jspf" %>

<h1>회원가입</h1>

<form action="/form_action.jsp" method="post">
	<p><input name="userId" placeholder="아이디"></p>
	<p><input type="password" name="password" placeholder="비밀번호"></p>
	<p><input name="name" placeholder="이름"></p>
	<p><button type="submit">회원가입</button></p>
</form>
</body>
</html>