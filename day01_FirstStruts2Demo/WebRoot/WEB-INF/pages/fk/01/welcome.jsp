<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title><s:text name="succPage"/></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<%-- <s:text name="succTip">
		<s:param>${sessionScope.user}</s:param>
	</s:text><br/> --%>
	<p>本站访问的次数:${applicationScope.counter }</p>
	<p>${sessionScope.user },您已经登录</p>
	<p>${requestScope.tip}</p>
</body>
</html>
