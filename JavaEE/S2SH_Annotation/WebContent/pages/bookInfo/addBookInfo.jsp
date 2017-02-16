<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset style="width: 90%">
		<legend>增加图书信息</legend>
		<form id="addform" action="" method="post">
			<table>
				<tr>
					<th>图书名称:</th>
					<td><input name="" /></td>
				</tr>
				<tr>
					<th>图书作者:</th>
					<td><input name="" /></td>
				</tr>
				<tr>
					<th>图书价格:</th>
					<td><input name="" /></td>
				</tr>
				<tr>
					<th>图书类型:</th>
					<td><select></select></td>
				</tr>
				<tr>
					<th>出版日期:</th>
					<td><input name="" /></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="添加" />
						<input type="button" onclick="history.go(-1);">
					</td>
					
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>