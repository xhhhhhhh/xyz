<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String sname = new String(request.getParameter("sname").getBytes("ISO-8859-1"),"UTF-8");
	String sno= new String(request.getParameter("sno").getBytes("ISO-8859-1"),"UTF-8");
	String sex = new String(request.getParameter("sex").getBytes("ISO-8859-1"),"UTF-8");
	String Tel= new String(request.getParameter("Tel").getBytes("ISO-8859-1"),"UTF-8");
	String Adress = new String(request.getParameter("Adress").getBytes("ISO-8859-1"),"UTF-8");
%>
<!DOCTYPE HTML>
<%--this page will arrange the class and write the info to db --%>
<html>
<jsp:include page="header_site.jsp"></jsp:include>
<body background="file://D:/JavaEE IDE 工作空间/xyz/img/背景图片2.jpg">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="nav.jsp"></jsp:include>
<div class="rightNav" id="rightNav">
	<div style="height: 150px;width: 500px;"class="Absolute-Center">
		姓名为：<%= sname %><br>
   		学号为：<%= sno %><br>
    	性别为： <%= sex %><br>
 		联系电话为：<%= Tel %><br>
 		家庭住址为：<%= Adress %><br>
   </div>  
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>