<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입하신 회원 정보</title>
</head>
<body>
	<h2>회원 정보</h2>
	아이디 : ${mdto.memberid}<br><br> 
	비밀번호 : ${mdto.memberpw}<br><br>
	이름 : ${mdto.membername}<br><br>
	나이 : ${mdto.memberage}<br><br>
	이메일 : ${mdto.memberemail}<br><br>
	<hr>
	
</body>
</html>