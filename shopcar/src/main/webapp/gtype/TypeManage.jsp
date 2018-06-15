<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品类别管理</title>
</head>
<body>
	<center>
		<table align="center" border="1px"  width="100%" height="100%">
			<tr>
				<th colspan="10" height="100" align="center" title="00" style="font-size:50px;color:#082E54;">商城后台管理系统</th>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center" style="font-size:18px;">商品类别管理</td>
				<td colspan="9" rowspan="5" align="center">
					
				<center>
					<table border="1" width="80%" height="90%">
						<tr>
							<td align="center"><%out.print("类别编号"); %>
							<td align="center"><%out.print("类别名称"); %>
							<td align="center"><%out.print("操作1"); %>
							<td align="center"><%out.print("操作2"); %>
						</tr>
						
						<c:if test="${not empty list }">
							<c:forEach items="${list }" var="gtype">
							<tr>
								<td align="center" >${gtype.typeid }</td>
								<td align="center" >${gtype.typename }</td>
								<td align="center"><a href="${pageContext.request.contextPath }/gtype/update.html">修改</a></td>
								<%-- <td align="center"><a href="${pageContext.request.contextPath }/gtype/typeid/${gtype.typeid }/update.html">修改</a></td> --%><!-- 之后再存这个id，这个项目不存 -->
								<td align="center"><a href="${pageContext.request.contextPath }/gtype/delete.html?typeid=${gtype.typeid }">删除</a></td>
							</tr>
							</c:forEach>
						</c:if>
					</table>
				</center>

			
				</td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center"
					style="font-size: 18px;"><a href="gtype/typeadd.html">商品类别添加</a></td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center"
					style="font-size: 18px;"><a href="ginfo/list.html">商品信息管理</a></td>
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