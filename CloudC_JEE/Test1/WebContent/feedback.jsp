<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Welcome to feedback</h1>
	<table align="center">
		<tr>
			<td>ID:</td>
			<td><%=session.getAttribute("id")%></td>
		</tr>
		<tr>
			<td>NAME:</td>
			<td><%=session.getAttribute("name")%></td>
		</tr>
		<tr>
			<td>EMAIL:</td>
			<td><%=session.getAttribute("email")%></td>
		</tr>
		<tr>
			<td>CONTACT:</td>
			<td><%=session.getAttribute("contact")%></td>
		</tr>
		<tr>
			<td>GENDER:</td>
			<td><%=session.getAttribute("gender")%></td>
		</tr>
		<tr>
			<td>DOB:</td>
			<td><%=session.getAttribute("dob")%></td>
		</tr>
		<tr>
			<td>PASSWORD:</td>
			<td><%=session.getAttribute("pwd")%></td>
		</tr>
		<tr>
		<br/>
			<td><h3>Successfully Registered</h3></td>
		</tr>
	</table>
</body>
</html>