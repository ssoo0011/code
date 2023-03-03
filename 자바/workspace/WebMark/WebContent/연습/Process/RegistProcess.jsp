<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="user.CookieManager" %>
<%@ page import="user.JSFunction" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="DB.JDBConnect"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String birth = request.getParameter("year" + "month" + "day");

	JDBConnect jdbc = new JDBConnect();
	String sql = "INSERT INTO MEMBER VALUES(?, ?, ?, ?, ?)";
	PreparedStatement pstmt = jdbc.con.prepareStatement(sql);
	
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	pstmt.setString(3, name);
	pstmt.setString(4, email);
	pstmt.setString(5, birth);
	
	int count = pstmt.executeUpdate();
	
	if(count > 0){
%>
	<script>
		alert("회원가입 성공")
	</script>
<%	
	}else{
%>
	<script>
		alert("회원가입 실패")
	</script>		
<%	
	}
	
	jdbc.close();

%>