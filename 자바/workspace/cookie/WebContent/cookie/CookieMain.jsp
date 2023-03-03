<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie</title>
</head>
<body>
	<h2>쿠키 설정</h2>
	<%
		Cookie cookie = new Cookie("myCookie", "쿠키마시쩡");
		cookie.setPath(request.getContextPath());//경로를 컨텍스트 루트로 설정
		cookie.setMaxAge(3600); //유지시간 1시간으로 설정 1에 1분인듯?
		response.addCookie(cookie); //응답 헤더에 쿠키 추가!
	
	%>
	
	<h2>쿠키 설정 후 쿠키 값 확인하기</h2>
	<%
		Cookie[]cookies = request.getCookies();
		if(cookies!=null){
			for(Cookie c : cookies){
				String cookieName = c.getName();
				String cookieValue = c.getValue();
				out.println(String.format("%s : %s<br/>", cookieName, cookieValue));
			}
			
		}
	%>
	<h2>페이지 이동 후 쿠키 값 확인하기</h2>
	<a href="CookieResult.jsp">
		다음 페이지에서 쿠키값 확인하기
	</a>
</body>
</html>