<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品信息管理</title>
</head>
<body>
	<center>
		<table align="center" border="1px"  width="100%" height="100%">
			<tr>
				<th colspan="10" height="100" align="center" title="00" style="font-size:50px;color:#082E54;">商城后台管理系统</th>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center" style="font-size:18px;"><a href="gtype/list.html">商品类别管理</a></td>
				<td colspan="9" rowspan="5" align="center">
				
					<form action="${pageContext.request.contextPath }/ginfo/infoupdate " method="post">
					<table border="1">
						<tr>
							<td>编号</td>
							<td>商品名称</td>
							<td>商品类别id</td>
							<td>商品价格</td>
							<td>商品库存</td>
							<td>操作</td>
						</tr>
						<tr>
							<td><input type="text" name="id"></td>
							<td><input type="text" name="name"></td>
							<td><input type="text" name="typeid"></td>
							<td><input type="text" name="price"></td>
							<td><input type="text" name="store"></td>
							<td><input type="submit" value="修改" name="submit"></td>
						</tr>
					</table>
				</form>
				
				
				
				</td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center"
					style="font-size: 18px;"><a href="gtype/typeadd.html">商品类别添加</a></td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center"
					style="font-size: 18px;">商品信息管理</td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center"
					style="font-size: 18px;"><a href="ginfo/infoadd.html">商品信息添加</a></td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center"
					style="font-size: 18px;"><a href="AdminLogin.jsp">系统退出</a></td>
			</tr>
		</table>
	</center>
</body>
</html>