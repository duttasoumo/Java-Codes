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
    left:0px;
    border: none;         /* Reset default border */
    height: 100vh;        /* Viewport-relative units */
    width: 100vw;
    overflow-y:hidden;
</style>
</head>
<body>
<jsp:include page="header_menu.jsp">
 <jsp:param name="m" value="6" />
</jsp:include>
<iframe src="http://nfsm.gov.in/nfmis/RPT/CalenderReport.aspx" width="100%" height="100%" style="border:none;">
</iframe>
</body>
</html>