<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var goTo = function() {
		var currentPage = document.getElementById("goto").value;
		
		location.href='${pageContext.request.contextPath}/bookInfo/bookInfoAction_showBookInfoList?pageBean.currentPage='+currentPage;
	};
</script>
</head>
<body>
	<fieldset style="width: 90%">
		<legend>图书信息检索</legend>
		<form id="searchform" action="" method="post">
			<table width="100%">
				<tr>
					<th>图书编号:</th>
					<td><input type="text" name="" /></td>
					<th>图书名称:</th>
					<td><input type="text" name="" /></td>
					<th>图书类型:</th>
					<td><select></select></td>
					<td><input type="submit" value="检索" /></td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	<fieldset style="width: 90%">
		<legend>图书信息检索</legend>
		<table width="100%" border="1" align="center">
			<tr>
				<th>序号</th>
				<th>编号</th>
				<th>书名</th>
				<th>作者</th>
				<th>价格</th>
				<th>类型</th>
				<th>出版日期</th>
				<th>操作</th>
			</tr>
			<s:if test="pageBean.list.size>0">
				<s:iterator value="pageBean.list" status="st">
					<tr align="center">
						<td>${(pageBean.currentPage-1)*pageBean.pageSize+st.count}</td>
						<td>${bookId}</td>
						<td>${bookName }</td>
						<td>${bookAuthor }</td>
						<td>${bookPrice }</td>
						<td>${bookType.bookTypeName }</td>
						<td><s:date name="bookPublishDate" format="yyyy-MM-dd" /></td>
						<td>编辑 | 删除</td>
					</tr>
				</s:iterator>
			</s:if>
			<s:else>
				<tr>
					<td colspan="8">
						<center>
							<font color="red" size="-1">暂无数据，请添加后操作</font>
						</center>
					</td>
				</tr>
			</s:else>
			<tr>
				<td colspan="8" align="right">
				 	<div>
				 		共<font color="blue">${pageBean.totalRecords}</font>条记录
				 		共<font color="blue">${pageBean.totalPages}</font>页
				 		当前第<font color="blue">${pageBean.currentPage}</font>页
				 		<a href="${pageContext.request.contextPath}/bookInfo/bookInfoAction_showBookInfoList?pageBean.currentPage=1">首页</a>
				 		<a href="${pageContext.request.contextPath}/bookInfo/bookInfoAction_showBookInfoList?pageBean.currentPage=${pageBean.currentPage-1<1?1:pageBean.currentPage-1}">上一页</a>
				 		<a href="${pageContext.request.contextPath}/bookInfo/bookInfoAction_showBookInfoList?pageBean.currentPage=${pageBean.currentPage+1>pageBean.totalPages?pageBean.totalPages:pageBean.currentPage+1}">下一页</a>
				 		<a href="${pageContext.request.contextPath}/bookInfo/bookInfoAction_showBookInfoList?pageBean.currentPage=${pageBean.totalPages}">尾页</a>
				 		<input type="text" id="goto" size="3" value="${pageBean.currentPage}" />
				 		<input type="button" style="text-align: center;" value="转到" onclick="goTo();" />
				 	</div>
				</td>
			</tr>
		</table>
	</fieldset>
</body>
</html>