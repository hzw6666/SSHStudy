<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试Action 直接访问 Servlet Api</title>
</head>
<body>
   <p>
   我的信息:
   </p>
   <p>用户名:${cookie.user.value}</p>
   <p>年龄:${requestScope.age}</p>
  
</body>
</html>