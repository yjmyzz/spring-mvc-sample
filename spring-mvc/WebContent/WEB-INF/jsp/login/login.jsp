<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/comm/meta.jsp"%>
<title>Spring MVC - Login</title>
</head>
<body>
	<form action="login/validate.do" method="post">
		<table>
			<tr>
				<th>用户名：</th>
				<td><input type="text" name="userId" id="userId" value="jimmy" maxlength=“32” style="width:150px"></td>
			</tr>
			<tr>
				<th>密码:</th>
				<td><input type="password" name="userPassword"
					id="userPassword" value="123456" maxlength="32" style="width:150px"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>