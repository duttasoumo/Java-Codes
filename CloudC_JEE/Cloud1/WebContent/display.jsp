<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center">
<% String s=(String)session.getAttribute("res");
   String ar[]=s.split("\n");
   int c=0;
   while(c<ar.length){
	   String tr[]=ar[c].split(";");
   
   %>
   <tr>
	<td> <%=tr[0] %><td/>
	<td> <%=tr[1] %><td/>
	<tr/>
	<%c++;} %>
	<table/>
</body>
</html>