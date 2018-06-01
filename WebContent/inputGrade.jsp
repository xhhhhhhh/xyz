<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header_site.jsp"></jsp:include>
<body background="file://D:/JavaEE IDE 工作空间/xyz/img/背景图片2.jpg">
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="nav.jsp"></jsp:include>
<div class="rightNav" id="rightNav">
		
		<table width="755px" height="27px" border="0" align="left" cellpadding="0" cellspacing="0">
    	<tr>
    		<td width="20px">&nbsp;</td>
    		<td><span class="STYLE3">当前位置-&gt;添加成员信息</span></td>
    	</tr>
  	</table>
  	<br><br>
	<form style="height: 300px;width: 350px;" class="Absolute-Center" action="StudentAdd" method="post">
    	<table style="position: relative;top:20px;left:40px">
    		<tr>
    			<td height="24">学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号</td>
    			<td><label><input type="text" name="id"/></label></td>
    		</tr>
    		<tr>
    			<td height="24">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名</td>
    			<td><label><input type="text" name="name"/></label></td>
    		</tr>
      		<tr>
      			<td height="24">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别</td>
    			<td height="24"><label><input type="radio" name="sex" value="男" />男</label>
  								<label><input type="radio" name="sex" value="女" checked="checked" />女</label>
  				</td>
      		</tr>
      		<tr>
    			<td height="24">联系电话</td>
    			<td><label><input type="text" name="tel"/></label></td>
    		</tr>
      		<tr>
    			<td height="24">出生年月</td>
    			<td><label><input type="text" name="birth"/></label></td>
    		</tr>
      		<tr>
    			<td height="24">家庭住址</td>
    			<td><label><input type="text" name="home"/></label></td>
    		</tr>
			    		<!-- <tr>
			    			<td height="24">一&nbsp;&nbsp;寸&nbsp;&nbsp;照</td>
			    			<td><label><input type="file" name="picture"/></label></td>
			    		</tr>
			    		 -->
    		<tr>
   			  <td >&nbsp;</td>
					<td>
						<input type="submit" value="填&nbsp;&nbsp加" onclick="if(!confirm('确定添加该信息吗？'))return false;else return true"/>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset" value="重&nbsp;&nbsp置" />
					</td>
    		</tr>
    	</table>
    </form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>