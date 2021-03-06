<%@ page import = "javax.servlet.RequestDispatcher" %>
<%@page import="java.util.ArrayList"%>
<html>

<head>

<link href="css/tabs.css" rel="stylesheet" type="text/css"  />
<link href="css/table.css" rel="stylesheet" type="text/css"  />
    <style>
               @import url(https://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);
        body {
            background-color: #3e94ec;
            font-family: "Roboto", helvetica, arial, sans-serif;
            font-size: 16px;
            font-weight: 400;
            text-rendering: optimizeLegibility;
        }
           </style>
</head>

<body>
<jsp:include page="header_menu.jsp">
 <jsp:param name="m" value="3" />
</jsp:include>
    <ul id="tabs">
        <li><a href="#" name="1">January</a></li>
        <li><a href="#" name="2">February</a></li>
        <li><a href="#" name="3">March</a></li>
        <li><a href="#" name="4">April</a></li>
        <li><a href="#" name="5">May</a></li>
        <li><a href="#" name="6">June</a></li>
        <li><a href="#" name="7">July</a></li>
        <li><a href="#" name="8">August</a></li>
        <li><a href="#" name="9">September</a></li>
        <li><a href="#" name="10">October</a></li>
        <li><a href="#" name="11">November</a></li>
        <li><a href="#" name="12">December</a></li>
    </ul>

    <div id="content">
        <div id="default">
			 <table class="table-fill">
                <thead>
                    <tr>
                    	<th>CustomerID</th>
                        <th>Name</th>
                        <th>Mobile No.</th>
                        <th>District</th>
                        <th>State</th>
                        <th>Crop Harvest: 1</th>
                        <th>Crop Harvest: 2</th>
                        <th>Crop Harvest: 3</th>
                    </tr>
                    </thead>
                    <tbody class="table-hover" id="tableID">
                    <%
                    	ArrayList<String []> ar=(ArrayList<String []>)(session.getAttribute("list"));
                    	if(ar!=null){
                    	for(String[] x:ar){
                    		out.println("<tr>");
                    		for(String y:x)
                    			out.print("<td>"+y+"</td>");
                    		out.println("</tr>");
                    	}
                    	}
                    %>
                	
                </tbody>
            </table>
		</div>
    </div>
    
    
     <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
    <script>
        $(document).ready(function() {
        	var x=<%=session.getAttribute("month")%>;
        	$("#content #default").fadeIn(); // Show first tab's content
			$('#tabs a').click(function(e) {
                if ($(this).attr("name") == x)  //detection for current tab
                    return;
                 else 
                	month($(this).attr('name'));
            });
        	
			$("#tableID").delegate('tr', 'click', function() {
           		var cid=$(this).find('td:eq(0)').text();
           		var form = document.createElement("form");
           		var element1 = document.createElement("input"); 

                form.method = "POST";
                form.action = "CustInfo";   

                element1.value=cid;
                element1.name="cid";
                element1.type="hidden";
                form.appendChild(element1);  

                document.body.appendChild(form);

                form.submit();
           });
        });

	function month(a){
	//alert(a.toString());
	var form = document.createElement("form");
            var element1 = document.createElement("input"); 

            form.method = "POST";
            form.action = "Harvesting";   

            element1.value=a.toString();
            element1.name="month";
            form.appendChild(element1);  
            
            document.body.appendChild(form);

            form.submit();
	}
    </script>
</body>

</html>
