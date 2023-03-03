<%@ page import="user.CookieManager" %>
<%@page import="user.JSFunction" %>
<%@page import="java.util.ArrayList"%>
<%@page import="product.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String url ="";
	
	if(request.getParameter("index")==null){
		url = "../UI/Welcome.jsp";
	}else{
		int index = Integer.parseInt(request.getParameter("index"));
		url = "../UI/salePage.jsp?index="+index;
	}
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pwd");
	System.out.print(id + pw);
	String save_check = request.getParameter("save_check");
	
	if("must".equals(id) && "1234".equals(pw)){
		
		if(save_check != null && save_check.equals("Y")){
			
			session.setAttribute("loginId", id);
			CookieManager.makeCookie(response, "loginId", id, 86400);
		
		}else{
			session.setAttribute("loginId", id);
		}		
		
		JSFunction.alertLocation("로그인 성공", url, out);
	}else{
		JSFunction.alertBack("로그인 실패", out);
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>