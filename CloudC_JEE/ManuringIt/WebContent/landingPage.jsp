<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="import" href="/header_menu.html">
			<link href="css/floatinglable.css" rel="stylesheet" type="text/css" />
<style>
html { 
  background: url(images/background.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);
        body {
            font-family: "Roboto", helvetica, arial, sans-serif;
            font-size: 16px;
            font-weight: 400;
            text-rendering: optimizeLegibility;
        }
input[type="text"] {
  display: block;
  width: 28%;
  font-family: sans-serif;
  appearance: none;
  border-radius: none;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 18px 10px;
    border: none;
    cursor: pointer;
    width: 30%;
}

button:hover {
    opacity: 0.8;
}

fieldset {
            margin-bottom: 30px;
            border: none;
            align: center;
        }

</style>
<title>Farmer Registration</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body >
<body>
<jsp:include page="header_menu.jsp">
 <jsp:param name="m" value="1" />
</jsp:include>
<fieldset >
	<form action="landPage" method="post">
	<button type="submit">Sign UP</button>
	</form>
	<form action="CropSelect" method="post">
		<div class="group" style="margin: 5px 10px;">
			<input class="inputMaterial" placeholder=" " name="cid" id="cid" type="text" value="<%=session.getAttribute("cid")==null?"":session.getAttribute("cid") %>" required>
			<label class="floating">Customer ID</label> </div>
	<button type="submit">Crop Description</button>
	</form>
	<button onclick="func()">Crop Inputs</button>
</fieldset>


<script>
function func(){
	var form = document.createElement("form");
            var element1 = document.createElement("input"); 

            form.method = "POST";
            form.action = "CropInputs";   

            element1.value=document.getElementById("cid").value;
            element1.name="cid";
            element1.type="hidden";
            form.appendChild(element1);  

            document.body.appendChild(form);

            form.submit();
	}
</script>
</body>
</html>