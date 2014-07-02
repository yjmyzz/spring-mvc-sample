<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/comm/meta.jsp"%>
<title>Spring MVC - HelloWorld</title>
</head>
<body>
	<div id="divMsg" style="display: none">${message}</div>
	<ul>
		<li><a href="home/welcome" target="_blank">welcome</a></li>
		<li><a href="home/ajax" target="_blank">ajax</a></li>
		<li><a href="upload/index" target="_blank">upload</a></li>
		<li><a href="user/add" target="_blank">form submit</a></li>
		<li><a href="login/login" target="_blank">simple login</a></li>
		<li><a href="exception/index/business" target="_blank">business exception</a></li>
		<li><a href="exception/index/parameter" target="_blank">parameter exception</a></li>
		<li><a href="exception/index/general" target="_blank">general exception</a></li>
		<li><a href="none_this_url" target="_blank">404 Error</a></li>
		<li><a href="error/index" target="_blank">500 Error</a></li>
		<li><a href="log/index" target="_blank">Log4j demo</a></li>
	</ul>
</body>
</html>