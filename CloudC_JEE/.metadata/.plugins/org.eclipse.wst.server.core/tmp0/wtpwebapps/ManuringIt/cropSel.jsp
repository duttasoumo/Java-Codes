<%@page import="java.util.ArrayList"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crop Selection</title>
<link href='http://fonts.googleapis.com/css?family=Bitter' rel='stylesheet' type='text/css'>
<style type="text/css">
body{
	background:#AEE4FF;
}
.form-style-10{
	max-width:85%;
	padding:30px;
	margin:40px auto;
	background: #FFF;
	border-radius: 10px;
	-webkit-border-radius:10px;
	-moz-border-radius: 10px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
	-moz-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
	-webkit-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
}
.form-style-10 .inner-wrap{
	padding: 30px;
	background: #F8F8F8;
	border-radius: 6px;
	margin-bottom: 15px;
}
.form-style-10 h1{
	background: #2A88AD;
	padding: 20px 30px 15px 30px;
	margin: -30px -30px 30px -30px;
	border-radius: 10px 10px 0 0;
	-webkit-border-radius: 10px 10px 0 0;
	-moz-border-radius: 10px 10px 0 0;
	color: #fff;
	text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);
	font: normal 30px 'Bitter', serif;
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	border: 1px solid #257C9E;
}
.form-style-10 h1 > span{
	display: block;
	margin-top: 2px;
	font: 13px Arial, Helvetica, sans-serif;
}
.form-style-10 label{
	display: block;
	font: 13px Arial, Helvetica, sans-serif;
	color: #888;
	margin-bottom: 15px;
}
.form-style-10 input[type="text"],
.form-style-10 input[type="date"],
.form-style-10 input[type="datetime"],
.form-style-10 input[type="email"],
.form-style-10 input[type="number"],
.form-style-10 input[type="search"],
.form-style-10 input[type="time"],
.form-style-10 input[type="url"],
.form-style-10 input[type="password"],
.form-style-10 textarea,
.form-style-10 select {
	display: block;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	width: 100%;
	padding: 5px;
	border-radius: 6px;
	-webkit-border-radius:6px;
	-moz-border-radius:6px;
	border: 2px solid #fff;
	box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);
	-moz-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);
	-webkit-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}

.form-style-10 .section{
	font: normal 20px 'Bitter', serif;
	color: #2A88AD;
	margin-bottom: 5px;
}
.form-style-10 .section span {
	background: #2A88AD;
	padding: 5px 10px 5px 10px;
	position: absolute;
	border-radius: 50%;
	-webkit-border-radius: 50%;
	-moz-border-radius: 50%;
	border: 4px solid #fff;
	font-size: 14px;
	margin-left: -45px;
	color: #fff;
	margin-top: -3px;
}
.form-style-10 input[type="button"], 
.form-style-10 input[type="submit"]{
	background: #2A88AD;
	padding: 8px 20px 8px 20px;
	border-radius: 5px;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	color: #fff;
	text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);
	font: normal 30px 'Bitter', serif;
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	border: 1px solid #257C9E;
	font-size: 15px;
	align:center;
}
.form-style-10 input[type="button"]:hover, 
.form-style-10 input[type="submit"]:hover{
	background: #2A6881;
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
}
.form-style-10 .privacy-policy{
	float: right;
	width: 250px;
	font: 12px Arial, Helvetica, sans-serif;
	color: #4D4D4D;
	margin-top: 10px;
	text-align: right;
}
table{
	width:100%;
}
th{
	align:center;
}
td{
	align:center;
	padding:10px;
}
h3 {
    text-shadow: 0 0 2px #00FF00;
}
</style>
</head>
<body>

<div class="form-style-10">
<h1>Select the crops<span>Select crops based on the season they are sowen and harvested</span></h1>
<form method="post" action="RegComp">

    <div class="section"><span>1</span>Rabi Season</div>
    <div class="inner-wrap">
    <table>
    <tr>
    <th colspan="2"><h3>CROP 1</h3></th>
    <th colspan="2"><h3>CROP 2</h3></th>
    <th colspan="2"><h3>CROP 3</h3></th>
    </tr>
    <tr>
        <td colspan="2">
        <select name="rcrop1" id="1" >
        <option value="0" selected="selected" required>Select CROP</option>
        </select>
        </td>
        <td colspan="2">
        <select name="rcrop2" id="2" >
        <option value="0" selected="selected" >Select CROP</option>
        </select>
        </td>
        <td colspan="2">
        <select name="rcrop3" id="3" >
        <option value="0" selected="selected" >Select CROP</option>
        </select>
        </td>
        </tr>
        <tr>
        <th>SOW : </th>
        <td><select name="s1" id="s1">
        </select>
        </td>
        <th>HARV : </th>
        <td><select name="h1" id="h1">
   		</select>
        </td>
        </tr>
        </table>
    </div>
	
	<div class="section"><span>2</span>Summer Season</div>
    <div class="inner-wrap">
    <table>
    <tr>
    <th colspan="2"><h3>CROP 1</h3></th>
    <th colspan="2"><h3>CROP 2</h3></th>
    <th colspan="2"><h3>CROP 3</h3></th>
    </tr>
    <tr>
        <td colspan="2">
        <select name="scrop1" id="7" >
        <option value="" selected="selected" >Select CROP</option>
        </select>
        </td>
        <td colspan="2">
        <select name="scrop2" id="8" >
        <option value="" selected="selected" >Select CROP</option>
        </select>
        </td>
        <td colspan="2">
        <select name="scrop3" id="9" >
        <option value="" selected="selected" >Select CROP</option>
        </select>
        </td>
        </tr>
        <tr>
        <th>SOW : </th>
        <td><select name="s3" id="s3">
        </select>
        </td>
        <th>HARV : </th>
        <td><select name="h3" id="h3">
   		</select>
        </td>
        </tr>
        </table>
    </div>
	
	<div class="section"><span>3</span>Kharif Season</div>
    <div class="inner-wrap">
    <table>
    <tr>
    <th colspan="2"><h3>CROP 1</h3></th>
    <th colspan="2"><h3>CROP 2</h3></th>
    <th colspan="2"><h3>CROP 3</h3></th>
    </tr>
    <tr>
        <td colspan="2">
        <select name="kcrop1" id="4" >
        <option value="" selected="selected" required>Select CROP</option>
        </select>
        </td>
        <td colspan="2">
        <select name="kcrop2" id="5" >
        <option value="" selected="selected" >Select CROP</option>
        </select>
        </td>
        <td colspan="2">
        <select name="kcrop3" id="6" >
        <option value="" selected="selected" >Select CROP</option>
        </select>
        </td>
        </tr>
        <tr>
        <th>SOW : </th>
        <td><select name="s2" id="s2">
        </select>
        </td>
        <th>HARV : </th>
        <td><select name="h2" id="h2">
   		</select>
        </td>
        </tr>
        </table>
    </div>
    
    
<input type="submit" value="Confirm Selection">
</form>
</div>
<script>

window.onload = function () {
	var rcrop1 = document.getElementById("1");
	var rcrop2 = document.getElementById("2");
	var rcrop3 = document.getElementById("3");
	var kcrop1 = document.getElementById("4");
	var kcrop2 = document.getElementById("5");
	var kcrop3 = document.getElementById("6");
	var scrop1 = document.getElementById("7");
	var scrop2 = document.getElementById("8");
	var scrop3 = document.getElementById("9");
	
	var s1 = document.getElementById("s1");
	var s2 = document.getElementById("s2");
	var s3 = document.getElementById("s3");

	var h1 = document.getElementById("h1");
	var h2 = document.getElementById("h2");
	var h3 = document.getElementById("h3");
	
	<%
	ArrayList<String> ar=(ArrayList<String>)session.getAttribute("cropList");
	for(int i=1;i<=ar.size();i++)
	{%>
	rcrop1.options[rcrop1.options.length] =new Option("<%=ar.get(i-1)%>","<%=i%>");
	<%}
	byte months[]=(byte [])session.getAttribute("months");%>
	scrop1.innerHTML=scrop2.innerHTML=scrop3.innerHTML=kcrop1.innerHTML=kcrop2.innerHTML=kcrop3.innerHTML=rcrop3.innerHTML=rcrop2.innerHTML = rcrop1.innerHTML;
	s1.options[s1.options.length] =new Option("Select Month","0");
	s1.options[s1.options.length] =new Option("JANUARY","1");
	s1.options[s1.options.length] =new Option("FEBRUARY","2");
	s1.options[s1.options.length] =new Option("MARCH","3");
	s1.options[s1.options.length] =new Option("APRIL","4");
	s1.options[s1.options.length] =new Option("MAY","5");
	s1.options[s1.options.length] =new Option("JUNE","6");
	s1.options[s1.options.length] =new Option("JULY","7");
	s1.options[s1.options.length] =new Option("AUGUST","8");
	s1.options[s1.options.length] =new Option("SEPTEMBER","9");
	s1.options[s1.options.length] =new Option("OCTOBER","10");
	s1.options[s1.options.length] =new Option("NOVEMBER","11");
	s1.options[s1.options.length] =new Option("DECEMBER","12");
	
	h1.innerHTML=h2.innerHTML=h3.innerHTML=s3.innerHTML=s2.innerHTML=s1.innerHTML;
	s1.selectedIndex=<%=months[0]%>;
	h1.selectedIndex=<%=months[1]%>;
	s2.selectedIndex=<%=months[2]%>;
	h2.selectedIndex=<%=months[3]%>;
	s3.selectedIndex=<%=months[4]%>;
	h3.selectedIndex=<%=months[5]%>;
	
	<%
	byte b[]=(byte [])session.getAttribute("rabicombi");
	%>
	rcrop1.selectedIndex=<%=b[0]%>;
	rcrop2.selectedIndex=<%=b[1]%>;
	rcrop3.selectedIndex=<%=b[2]%>;
	
	<%
	b=(byte [])session.getAttribute("kharifcombi");
	%>
	kcrop1.selectedIndex=<%=b[0]%>;
	kcrop2.selectedIndex=<%=b[1]%>;
	kcrop3.selectedIndex=<%=b[2]%>;
	
	<%
	b=(byte [])session.getAttribute("summercombi");
	%>
	scrop1.selectedIndex=<%=b[0]%>;
	scrop2.selectedIndex=<%=b[1]%>;
	scrop3.selectedIndex=<%=b[2]%>;
}
</script>

</body>
</html>