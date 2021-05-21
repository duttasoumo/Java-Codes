<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Information</title>
	<link href="css/form.css" rel="stylesheet" type="text/css" />
			<link href="css/floatinglable.css" rel="stylesheet" type="text/css" />
			<link href="css/tabs.css" rel="stylesheet" type="text/css" />
</head>
<body>
 <jsp:include page="header_menu.jsp">
            <jsp:param name="m" value="0" />
        </jsp:include>
<ul id="tabs">
        <li><a href="#" name="tab1">Personal INFO</a></li>
        <li><a href="#" name="tab2">CROPS GROWN</a></li>
        <li><a href="#" name="tab3">FARM INPUTS</a></li>
    </ul>

    <div id="content">
        <div id="tab1">
        <%String[] ar=(String [])request.getAttribute("pinfo"); %>
        <table align="center">
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[0] %>" readonly>
			<label class="floating">Customer ID</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[1] %>" readonly>
			<label class="floating">Aadhar ID</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[3] %>" readonly>
			<label class="floating">Phone</label> </div>
        </td>
        </tr>
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[2] %>" readonly>
			<label class="floating">Name</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[4] %>" readonly>
			<label class="floating">Gender</label> </div>
        </td>
        </tr>
       
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[5] %>" readonly>
			<label class="floating">Village</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[6] %>" readonly>
			<label class="floating">Block</label> </div>
        </td>
        </tr>
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[7] %>" readonly>
			<label class="floating">District</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[8] %>" readonly>
			<label class="floating">City</label> </div></td>
		<td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[9] %>" readonly>
			<label class="floating">State</label> </div>
        </td>
        </tr>
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=ar[10] %>" readonly>
			<label class="floating">Size</label> </div>
        </td>
        </tr>
        </table>
    </div>
    <div id="tab2">
        <%String[][] crop=(String [][])request.getAttribute("crop"); 
        for(int i=0;i<3;i++){%>
        <table align="center" style="margin:5px 0 5px 0">
        <tr><th colspan="2" align="center"><legend style="height:96%;padding:2% 0;"><span class="number"><%=i+1 %></span><%=crop[i][0] %> SEASON INFO</legend></th></tr>
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=crop[i][1] %>" readonly>
			<label class="floating">SOWING SEASON</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=crop[i][2] %>" readonly>
			<label class="floating">HARVESTING SEASON</label> </div>
        </td>
        </tr>
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=crop[i][3] %>" readonly>
			<label class="floating">CROP1</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=crop[i][4] %>" readonly>
			<label class="floating">CROP2</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=crop[i][5] %>" readonly>
			<label class="floating">CROP3</label> </div>
        </td>
        </tr>
        </table>
    	<%} %>
    	</div>
        <div id="tab3">
        <%String[] f=(String [])request.getAttribute("finput"); %>
        <table align="center">
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[0] %>" readonly>
			<label class="floating">Customer ID</label> </div>
        </td></tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[8] %>" readonly>
			<label class="floating">Subscription</label> </div>
        </td>
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[9] %>" readonly>
			<label class="floating">Sowing Season</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[10] %>" readonly>
			<label class="floating">Harvesting Season</label> </div>
        </td>
        </tr>
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[1] %>" readonly>
			<label class="floating">Pesticide Quantity</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[2] %>" readonly>
			<label class="floating">Fertilizer Type</label> </div>
        </td>
         <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[3] %>" readonly>
			<label class="floating">Fertilizer Quantity</label> </div>
        </td>
        </tr>
        
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[4] %>" readonly>
			<label class="floating">Manure Quantity</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[5] %>" readonly>
			<label class="floating">Tools Subscribe</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[8] %>" readonly>
			<label class="floating">Tools Subscription Previously</label> </div>
        </td>
        </tr>
        
        <tr>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[6] %>" readonly>
			<label class="floating">Amount DUE</label> </div>
        </td>
        <td><div class="group">
			<input class="inputMaterial" placeholder=" " type="text" value="<%=f[7] %>" readonly>
			<label class="floating">Total AMOUNT</label> </div>
        </td>
        </tr>
        </table>
        </div>
        </div>
       
    <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#content").find("[id^='tab']").hide(); // Hide all content
            $("#tabs li:first").attr("id", "current"); // Activate the first tab
            $("#content #tab1").fadeIn(); // Show first tab's content

            $('#tabs a').click(function(e) {
                e.preventDefault();
                if ($(this).closest("li").attr("id") == "current") { //detection for current tab
                    return;
                } else {
                    $("#content").find("[id^='tab']").hide(); // Hide all content
                    $("#tabs li").attr("id", ""); //Reset id's
                    $(this).parent().attr("id", "current"); // Activate this
                    $('#' + $(this).attr('name')).fadeIn(); // Show content for the current tab
                }
            });
        });

    </script>
</body>
</html>