<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Log" method="post" >
		<table align="center">
			<tr>
				<td>LoginID:</td>
				<td><input type="text" name="id" />
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="pwd"/>
			</tr>
			<tr>
				<td><input type="submit" value="Login"/></td>
				<td><a href="register.jsp">Click here for Register</a>
			</tr>
		</table>
	</form>
</body>
</html>