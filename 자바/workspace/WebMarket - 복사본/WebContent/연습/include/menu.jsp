<%@ page import="user.CookieManager" %>
<%@page import = "java.util.ArrayList" %>
<%@page import="user.JSFunction" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
	#logout{
		
	}
</style>
<nav class="navbar navbar-expand  navbar-dark bg-dark">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="../UI/Welcome.jsp">Home</a>
			<a class="navbar-brand" href="../UI/product.jsp">menu</a>
		</div>
		
		<%
			//static 이라 생성자 안만들고 해도 됨
			
			String loginId = CookieManager.readCookie(request, "loginId");
			String cookieCheck = "";
			String ssId =(String)session.getAttribute("loginId");
			
			if(!ssId.equals("")){
				cookieCheck = "checked";				
		%>	
						
		<div class="navbar-header">
			
			<form  action="../Process/LogOutProcess.jsp?id=<%=ssId%>" method="post">
				<span style = 'color : gray'><%=ssId%>님 환영합니다! </span>
				<a class="navbar-brand" href="../Process/LogOutProcess.jsp">logout</a>
			</form>
		</div>
		
		<% }else{ %>
								
		<div class="navbar-header">
			<form action="../UI/logIn.jsp" method="post">
				
			<a class="navbar-brand" href="../UI/logIn.jsp?id=<%=loginId%>">login</a>
			</form>	
		</div>
		<%} %>
	</div>
	
</nav>
<!--  || session.getAttribute("loginId") != null -->
