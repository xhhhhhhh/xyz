<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.xyz.entity.Student" %>

<!DOCTYPE HTML>
<%--this page will arrange the class and write the info to db --%>
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
<div class="rightNav" id="rightNav">

<% 
    Student student=new Student();
    List<Student> list=(ArrayList<Student>)request.getAttribute("StudentList");
   %>

	<table background="images/23_03.gif" width="755px" height="27px" border="0" align="left" cellpadding="0" cellspacing="0">
    	<tr>
    		<td width="20px">&nbsp;</td>
    		<td><span class="STYLE1">当前位置-&gt;学生信息查询</span></td>
    	</tr>
  	</table>
		
  	<br>
  	<br>
	<table width="775">
		<tr>
			<td height="40" align="center"><a href="dept/addPost.jsp">创建新部门</a></td>
		</tr>
	</table>
	<table  style="position: relative;top: 0px;left: 50px" width="650" border="1" cellpadding="0" cellspacing="1" bordercolor="#F0F4FF" bgcolor="#999999">
        <tr>
          <td height="24" bgcolor="#F0F4FF"><div align="center" class="STYLE5">学号</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">姓名</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">性别</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">电话</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">出生年月</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">家庭住址</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">操作</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">操作</div></td>
        </tr>
        <%
        int num =list.size();
        for (int i=0; i<num; i++)
        {
        	student=(Student)list.get(i);
            out.print("<tr>");
            out.print("<td bgcolor='#F0F4FF'><div align='center'>"+" "+student.getId()+"</div></td>");
            out.print("<td bgcolor='#F0F4FF'><div align='center'>"+" "+student.getName()+"</div></td>");
            out.print("<td bgcolor='#F0F4FF'><div align='center'>"+" "+student.getSex()+"</div></td>");
            out.print("<td bgcolor='#F0F4FF'><div align='center'>"+" "+student.getTel()+"</div></td>");
            out.print("<td bgcolor='#F0F4FF'><div align='center'>"+" "+student.getBirth()+"</div></td>");
            out.print("<td bgcolor='#F0F4FF'><div align='center'>"+" "+student.getHome()+"</div></td>");
            out.print("<td bgcolor='#F0F4FF'><div align='center'><a href='showPost?postId="+" "+request.getAttribute("postId")+"'>修改"+"</a></div></td>");
            out.print("<td bgcolor='#F0F4FF'><div align='center'><a href='showPost?postId="+" "+request.getAttribute("postId")+"' onclick='if(!confirm('确定删除该信息吗？'))return false;else return true'>删除"+"</a></div></td>");            
            
            out.print("</tr>");
        }
        
        %>
        <!-- 
          <tr>
            <td height="24" bgcolor="#F0F4FF"><div align="center" class="STYLE3">

            </div></td>
            <td bgcolor="#F0F4FF"><div align="center" class="STYLE3">

            </div></td>
            <td bgcolor="#F0F4FF"><div align="center" class="STYLE3">

            </div></td>
            <td bgcolor="#F0F4FF"><div align="center" class="STYLE3">

            </div></td>
            <td bgcolor="#F0F4FF"><div align="center" class="STYLE3">

            	<a href="showPost?postId=<%=request.getAttribute("postId")%>">修改</a>&nbsp;&nbsp;
            	<a href="delPost?postId=<%=request.getAttribute("postId")%>">删除</a></div></td>
          </tr>
		 -->
  </table>
 
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>