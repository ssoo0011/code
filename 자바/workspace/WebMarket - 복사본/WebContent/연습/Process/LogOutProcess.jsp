<%@page import="org.apache.jasper.tagplugins.jstl.core.Remove"%>
<%@ page import="user.CookieManager" %>
<%@page import="user.JSFunction" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%	

	String id = CookieManager.readCookie(request, "loginId");
	CookieManager.deleteCookie(response, "loginId");
	
	if(id.equals(null)){
	JSFunction.alertLocation("로그아웃 하셨습니다.", "../UI/logIn.jsp", out);
	}else JSFunction.alertLocation("로그아웃 하셨습니다.", "../UI/logIn.jsp?id="+id, out);
	
// 	session.removeAttribute("loginId");
%>
