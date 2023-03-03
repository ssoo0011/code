<%@page import="com.sun.jdi.Value"%>
<%@ page import="user.CookieManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
		
%>
<html>
<script> 
  function submit2(frm) { 
    frm.action="../UI/Regist.jsp"; 
    frm.submit(); 
    return true; 
  } 
</script> 
<head>
<meta charset="UTF-8">
<link href="../../css/Login.css" type = "text/css" rel = "stylesheet">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>로그인</title>
</head>
<%		

// 	String haveId = "";
	
	String haveId = (String)session.getAttribute("loginId");
	
	if(request.getParameter("id")!= null){
		haveId = request.getParameter("id");
	}else haveId = "";
	
	String url ="";
	if(request.getParameter("index")==null){
		url = "../Process/LogInProcess.jsp";
	}else{
		int index = Integer.parseInt(request.getParameter("index"));
		url = "../Process/LogInProcess.jsp?index="+index;
	}
	
%>

<body>
<%@ include file="../include/menu.jsp"%>
		<%!String greeting = "로그인";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>

<form action=<%=url%> method="post">
	<div class = "wrap">
		<label class="label" for="id">ID</label> 
		<input class="input_text" type="text" name="id" id="id"value = "<%=haveId%>"  />
		<br/>
		<input type="checkbox" name="save_check" value = "Y" checked = "<%=cookieCheck%>">
			아이디 저장하기
		<br/>
		<label class="label" for="pwd">PW</label> 
		<input class="input_text" type="password" name="pwd" id="pwd" />
	<br>
	<br>
	   <button class="login" type="submit">LOGIN</button><br>
	   <br>
	   <button class="regist" onclick='return submit2(this.form);'>회원가입</button>
	</div>
</form>
</body>
</html>