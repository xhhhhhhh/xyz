<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
body{
	background-position:50% 50%;
	background-size:100% 100%;
	background-repeat:no-repeat;
}
</style>
<jsp:include page="header_site.jsp"></jsp:include>
<body background="file://D:/JavaEE IDE 工作空间/xyz/img/5.jpg">
<%
    String senPara;
    senPara=(String)session.getAttribute("login");
        
    if (senPara==null)
    {
       request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
%>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="nav.jsp"></jsp:include>
<jsp:include page="content_main.jsp"></jsp:include>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>