<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!--   <%@ page import="java.util.*" %>	-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Cart">
<table align="center" border=0>
<% ArrayList<String> ar=(ArrayList<String>)session.getAttribute("arrayL"); 
String html=""; 
 for(String x:ar){
	 out.print("<tr>");
	 html="<td><input type=\"radio\" name=\"transac\" value="+x+"></td>";
	 out.print(html);
 	out.print("<td>"+x+"</td>");
 	out.print("</tr>");
 }
 	%>
</table>
<input type="submit" value="Proceed">
</form>

</body>
</html>