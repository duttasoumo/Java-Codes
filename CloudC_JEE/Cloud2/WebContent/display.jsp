<%@page import="java.sql.ResultSet"%>
<%@page import="connection.javaClass.UseSql"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center" border=3 bordercolor="pink">
<% UseSql sql=new UseSql(); 
ResultSet rs=sql.disp();
while(rs.next()){
   %>
   <tr>
	<td> <%=rs.getInt("roll") %> </td>
	<td> <%=rs.getString("name") %> </td>
	<td> <%=rs.getInt("marks") %> </td>
	</tr>
	<%} %>
	</table>
</body>
</html>