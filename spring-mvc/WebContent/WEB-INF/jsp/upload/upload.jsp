<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/comm/meta.jsp"%>
<title>Spring MVC - upload</title>
</head>
<body>
	<form action="upload/save" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<th>文件说明：</th>
				<td><input type="text" name="formParam" /></td>
			</tr>
			<tr>
				<th>选择文件：</th>
				<td><input type="file" name="formFile" /></td>
			</tr>
			<tr>
				<th>&nbsp;</th>
				<td><input type="submit" value="upload" /></td>
			</tr>
			<tr>
				<th>文件说明：</th>
				<th class="txt-left">${formParam}</th>
			</tr>
			<tr>
				<th>文件名称：</th>
				<th class="txt-left">${formFileName}</th>
			</tr>
			<tr>
				<th>文件大小：</th>
				<th class="txt-left">${fileSize}字节</th>
			</tr>
			<tr>
				<th>文件类型：</th>
				<th class="txt-left">${contentType}</th>
			</tr>
			<tr>
				<th>自动命名：</th>
				<th class="txt-left">${savedFileName}</th>
			</tr>
			<tr>
				<th>保存路径：</th>
				<th class="txt-left">${realPath}</th>
			</tr>
			<tr>
				<th>虚拟路径：</th>
				<th class="txt-left"><a href="${virtualPath}" target="_blank">${virtualPath}</a></th>
			</tr>
		</table>
	</form>
</body>
</html>