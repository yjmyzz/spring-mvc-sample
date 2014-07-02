<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/comm/meta.jsp"%>
<title>Spring MVC - ajax - demo</title>
</head>
<body>
	<div id="divMsg" style="display: none"></div>
	<a href="home/ajax#" onclick="getPerson()">show</a>

</body>
<script type="text/javascript">
	function getPerson() {

		$.ajax({
			type : "GET",
			url : "home/person/mike",
			data : "age=" + parseInt(1000 * Math.random()),
			beforeSend : function() {
				$("#divMsg").hide().empty();
			},
			success : function(d) {
				var birthday = new Date();
				birthday.setTime(d.birthday);
				$("#divMsg").html(
						d.firstName + "." + d.lastName + "|" + d.age + "|"
								+ birthday.toLocaleString() + "|" + d.friends)
						.show("slow");
			}
		});
	}
</script>
</html>