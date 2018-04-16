<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header_site.jsp"></jsp:include>
<body background="file://D:/JavaEE IDE 工作空间/xyz/img/背景图片2.jpg">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="nav.jsp"></jsp:include>
<div class="rightNav" id="rightNav">
	<form style="height: 150px;width: 500px;"class="Absolute-Center" action="inforShow.jsp" method="post">
		<table>
			<tr>
				<td>姓名：<input type="text" name="sname"id="sname"/></td>
				<td>学号：<input type="number" name="sno" id="sno"/></td>
				<td>性别：<select name="sex" >
        			<option value="男">男</option>
        			<option value="女">女</option>
        			</select>
				</td>
			</tr>
			<tr>
				<td>联系电话：<input type="number" name="Tel" id="Tel"/></td>
				<td>家庭住址：<input type="text" name="Adress" id="Adress"/></td>
			<tr>
				<td><button type="submit">submit</button></td>
				<td><button type="reset">reset</button></td>
			</tr>
		</table>
	</form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>