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
	<h1>회원가입</h1>
	<form action="./memberInsert" method="post">
		아이디:<input type="text" name="id"/><br>
		비밀번호:<input type="text" name="pwd"/><br>
		이름:<input type="text" name="name"/><br>
		email:<input type="text" name="email"/><br>
		<input type="submit" value="가입하기"><input type="reset" value="다시입력">
		
	</form>


</body>
</html>