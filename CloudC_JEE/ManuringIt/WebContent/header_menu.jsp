<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/header_menu.css" rel="stylesheet" type="text/css"  />
 
</head>
<body>
<img src="images/header.png">
<ul class="menu">
  <li><a href="landingPage.jsp">Registration</a></li>
  <li><a href="Sowing">Sowing</a></li>
  <li><a href="Harvesting">Harvesting</a></li>
  <li><a href="FarmInput">Farm Inputs</a></li>
  <li><a href="Sales">Sales</a></li>
  <li>
  <div class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">References</a>
    <div class="dropdown-content">
      <a href="ref1.jsp">Input Survey Database</a>
      <a href="ref2.jsp">Crop Calendar</a>
    </div>
    </div>
  </li>
</ul> 


<script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
<script>
        $(document).ready(function() {
$('ul li:nth-child(<%=request.getParameter("m")%>)').addClass("active");
});
</script>
</body>
</html>