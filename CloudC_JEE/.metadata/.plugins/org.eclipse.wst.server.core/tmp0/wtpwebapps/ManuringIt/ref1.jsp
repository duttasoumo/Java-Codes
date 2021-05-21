<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
margin:0;}
    iframe {position:absolute;
    top:25%;
    height:100%;
    width:100%;
    left:0px;
    border:none;
    overflow-x:hidden;
}
</style>
</head>
<body>
<jsp:include page="header_menu.jsp">
 <jsp:param name="m" value="6" />
</jsp:include>
<iframe src="http://inputsurvey.dacnet.nic.in/districttables.aspx" width="100%" height="100%" scrolling="no">
</iframe>
</body>
</html>