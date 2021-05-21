<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Welcome to register</h1>
	<form action="Register" method="post">
		<table align="center">
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>NAME:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>EMAIL ID:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>CONTACT NO:</td>
				<td><input type="text" name="contact" /></td>
			</tr>
			<tr>
				<td>GENDER:</td>
				<td><input type="radio" name="gender" value="male" />MALE
				     <input type="radio" name="gender" value="female" />FEMALE</td>
			</tr>
			<tr>
				<td>DOB:</td>
				<td><select name="day">
						<option value="01" />01
						<option value="02" />02
				</select> <select name="month">
						<option value="01" />JAN
						<option value="02" />FEB
				</select> <select name="year">
						<option value="2000" />2000
						<option value="2002" />2002
				</select></td>
			</tr>
			<tr>
				<td>PASSWORD:</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
			<tr>
				<td>CONFIRM PASSWORD:</td>
				<td><input type="password" name="cpwd" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Sign in" /></td>
			</tr>
		</table>
	</form>
</body>
</html>