<%@ page import = "javax.servlet.RequestDispatcher" %>
    <%@page import="java.util.ArrayList"%>
        <html>

        <head>
            <link href="css/tabs.css" rel="stylesheet" type="text/css" />
            <link href="css/table.css" rel="stylesheet" type="text/css" />
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

            <body>
                <jsp:include page="header_menu.jsp">
                    <jsp:param name="m" value="4" />
                </jsp:include>
                <%ArrayList<String> state=(ArrayList<String>)request.getAttribute("stateList"); %>
                <ul id="tabs">
                <% for(String s:state) {%>
                    <li><a href="#" name='<%=s%>'><%=s%></a></li>
                    <%} %>
                    </ul>
                    
                <div id="content">
                    <div id="default">
                        <table class="table-fill" >
                            <thead>
                                <tr>
                                    <th>CustomerID</th>
                                    <th>Name</th>
                                    <th>Phone</th>
                                    <th>Wt of Pesticide</th>
                                    <th>Type of Fertilizer</th>
                                    <th>Wt of Fertilizer</th>
                                    <th>Wt of Manure</th>
                                    <th>Type Of Tools</th>
                                    <th>Sowing</th>
                                    <th>Harvesting</th>
                                </tr>
                            </thead>
                            <tbody class="table-hover" id="tableID">
                            <%
                    	ArrayList<String []> ar=(ArrayList<String []>)(request.getAttribute("list"));
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
                        var x = "<%=request.getAttribute("state")%>";
                        $("#content #default").fadeIn(); // Show first tab's content
                        
                        $('#tabs a').click(function(e) {
                        	if($(this).attr('name').toString()===x.toString()) //detection for current tab
                            	return;
                            else
                            	state($(this).attr('name'));
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


                    function state(a) {
                        var form = document.createElement("form");
                        var element1 = document.createElement("input");

                        form.method = "POST";
                        form.action = "FarmInput";

                        element1.value = a.toString();
                        element1.name = "state";
                        element1.type="hidden";
                        form.appendChild(element1);
                        document.body.appendChild(form);
                        form.submit();
                    }
                </script>
</body>
</html>