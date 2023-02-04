<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	
</style>
<body>
	<a href="./">메인으로</a>
	<a href="./memberList">회원명단보기</a><br>
	<h1>회원정보수정</h1>
	<form action="./memberUpdate" method="post">
		<input type="hidden" name="id" value="${data.id }" />
		비밀번호:<input type="text" name="pwd" value="${data.pwd }"/><br>
		이름:<input type="text" name="name" value="${data.name }"/><br>
		email:<input type="text" name="email" value="${data.email }"/><br>
		<input type="submit" value="수정하기">
		
	</form>


</body>
</html>