<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/comm/meta.jsp"%>
<title>Spring MVC - form submit</title>
</head>
<body>
	<form:form modelAttribute="userModel" method="post" action="user/show">
		<table id="add">
			<tr>
				<th>用户名：</th>
				<td><form:input path="userName" /></td>
				<th>密码：</th>
				<td><form:password path="password" /></td>
			</tr>

			<tr>
				<th>生日：</th>
				<td><form:input path="birthday" /></td>
				<th>性别：</th>
				<td class="normal"><form:radiobuttons path="sex"
						items="${sexMap}" delimiter="&nbsp;" /></td>
			</tr>

			<tr>
				<th>网龄：</th>
				<td><form:input path="networkAge" /></td>
				<th>是否VIP：</th>
				<td class="normal"><form:checkbox path="isVip" /><label for="isVip1">是</label></td>
			</tr>

			<tr>
				<th>兴趣爱好：</th>
				<td class="normal"><form:checkboxes path="hobbies"
						items="${hobbyMap}" delimiter="&nbsp;" /></td>
				<th>最高学位：</th>
				<td class="normal"><form:select path="degree"
						items="${degreeMap}" style="width:100px" /></td>
			</tr>
			<tr>
				<th></th>
				<td colspan="3"><input type="submit" value="submit"></td>

			</tr>
		</table>
	</form:form>


	<table id="show">
		<tr>
			<th>用户名：</th>
			<td class="normal red"><spring:eval expression="userModel.userName"></spring:eval></td>
			<th>密码：</th>
			<td class="normal red"><spring:eval expression="userModel.password"></spring:eval></td>
			<th>生日：</th>
			<td class="normal red"><spring:eval expression="userModel.birthday"></spring:eval></td>
		</tr>
		<tr>
			<th>性别：</th>
			<td class="normal red"><spring:eval expression="userModel.sex"></spring:eval></td>
			<th>网龄：</th>
			<td class="normal red"><spring:eval expression="userModel.networkAge"></spring:eval></td>
			<th>是否VIP：</th>
			<td class="red normal"><spring:eval expression="userModel.isVip"></spring:eval></td>
		</tr>
		<tr>
			<th>兴趣爱好：</th>
			<td class="normal red"><spring:eval expression="userModel.hobbies"></spring:eval></td>
			<th>最高学历：</th>
			<td class="normal red"><spring:eval expression="userModel.degree"></spring:eval></td>
			<th></th>
			<td></td>
		</tr>


	</table>
</body>
</html>