<%@ page import="utils.CookieManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//static 이라 생성자 안만들고 해도 됨
	String loginId = CookieManager.readCookie(request, "loginId");

	String cookieCheck = "";
	if(!loginId.equals("")){
		cookieCheck = "checked";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠기 아이디 저장!</title>
</head>
<body>
	<h2>로그인 페이지</h2>
	<form action = "IdSaveProcess.jsp" method="post">
		아이디 : <input type="text" name = "user_id" value = "<%=loginId%>">
		<input type="checkbox" name="save_check" value = "Y" <%=cookieCheck %>>
		아이디 저장하기
		<br/>
		패스워드 : <input type="password" name = "user_pw">
		<br/>
		<input type="submit" value = "로그인">
	</form>
</body>
</html>