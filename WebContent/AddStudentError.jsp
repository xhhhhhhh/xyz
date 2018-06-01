<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
response.setHeader("refresh","5;URL=Login.jsp");
%>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>错误提示页</title>
</head>
<body>
<%
out.print("<script language='javascript'>alert('您插入的用户已存在！');window.location.href='inforModi.jsp';</script>");
%>
<p>5秒后自动返回
</body>
</html>