<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Exception e = (Exception) request.getAttribute("ex");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/comm/meta.jsp"%>
<title>Spring MVC - Business Exception</title>
</head>
<body class="error">
	<div class="error">
		<h1>
			业务错误:
			<%=e.getClass().getSimpleName()%></h1>
		<hr />
		<P class="error">错误描述：</P>
		<P class="error"><%=e.getMessage()%></P>
		<P class="error">错误信息：</P>
		<P class="error">
			<%
				e.printStackTrace(new java.io.PrintWriter(out));
			%>
		</P>
	</div>



</body>
</html>