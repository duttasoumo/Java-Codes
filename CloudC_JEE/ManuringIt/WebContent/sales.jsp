<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <link href="css/table.css" rel="stylesheet" type="text/css"  />
        <style>
            .switch {
                position: relative;
                display: inline-block;
                width: 50px;
                height: 20px;
            }
            
            .switch input {
                display: none;
            }
            
            .slider {
                position: absolute;
                cursor: pointer;
                top: 0;
                left: 0;
                right: 0;
                bottom: 0;
                background-color: #ccc;
                -webkit-transition: .4s;
                transition: .4s;
            }
            
            .slider:before {
                position: absolute;
                content: "";
                height: 16px;
                width: 16px;
                left: 4px;
                bottom: 3px;
                background-color: white;
                -webkit-transition: .4s;
                transition: .4s;
            }
            
            input:checked+.slider {
                background-color: #2196F3;
			}
            
            input:focus+.slider {
                box-shadow: 0 0 1px #2196F3;
            }
            
            input:checked+.slider:before {
                -webkit-transform: translateX(26px);
                -ms-transform: translateX(26px);
                transform: translateX(26px);
            }
            /* Rounded sliders */
            
            .slider.round {
                border-radius: 20px;
            }
            
            .slider.round:before {
                border-radius: 50%;
            }

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Sales</title>
    </head>

    <body>
        <jsp:include page="header_menu.jsp">
            <jsp:param name="m" value="5" />
        </jsp:include>
        <table class="table-fill" id="salesTable">
            <thead>
                <tr>
                    <th>Customer ID</th>
                    <th>Customer Name</th>
                    <th>Phone Number</th>
                    <th>Subscription Status</th>
                    <th>Payment Amount DUE</th>
                    <th>Payment Amount</th>
                    <th>Payment Status</th>
                    <th>Payment Date</th>
                </tr>
            </thead>
            <tbody class="table-hover">
            <% ArrayList<String []> ar=(ArrayList<String []>)session.getAttribute("list");
            	for(String []a:ar){
            %>
            <tr>
            <td id="cid"><%=a[0]%></td>
            <td><%=a[1]%></td>
            <td><%=a[2]%></td>
            <td>
            <label class="switch"><input type="checkbox" name="sub" <%=a[3]%> onchange="update(this)">
            <div class="slider round"></div></label></td>
            <td><%=a[4]%></td>
            <td><input type="text" name="amt" value="<%=a[5]%>" onfocusout="update2(this)" onfocus="this.value='';"></td>
            <td>
            <label class="switch"><input type="checkbox" name="pay" <%=a[6]%> onchange="update(this)">
            <div class="slider round"></div></label></td>
            <td><%=a[7]%></td>
            </tr>
            <%} %>
            </tbody>
            </table>
            
            
            
            
            <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
        <script>
        $(document).ready(function() {
        	$("#salesTable").delegate('tr', 'click', function() {
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
		
        $('input[name="amt"]').click(function(e){
        	e.stopPropagation();
        });
        
        function update(e){
        	
        	var form = document.createElement("form");
                    var element1 = document.createElement("input");
                    var element2 = document.createElement("input");
                    var table    = document.getElementById("salesTable");
                    var r = $(e).closest("tr");
                    form.method = "POST";
                    form.action = "UpdateSales";
                    
                    element1.name="cid";
                    element2.name=$(e).attr('name');                  
                    element1.type="hidden";
                    element2.type="hidden";
                    element1.value=r.find('td[id="cid"]').text();
                    element2.value=e.checked;
                    form.appendChild(element1);
                    form.appendChild(element2);
                    
                    document.body.appendChild(form);
                    form.submit();
        	}
        
        function update2(e){
        	
        	var form = document.createElement("form");
                    var element1 = document.createElement("input");
                    var element2 = document.createElement("input");
                    var table    = document.getElementById("salesTable");
                    var r = $(e).closest("tr");
                    form.method = "POST";
                    form.action = "UpdateSales";
                    
                    element1.name="cid";
                    element2.name=$(e).attr('name');                  
                    element1.type="hidden";
                    element2.type="hidden";
                    element1.value=r.find('td[id="cid"]').text();
                    element2.value=e.value;
                    form.appendChild(element1);
                    form.appendChild(element2);
                    
                    document.body.appendChild(form);
                    form.submit();
        	}
        </script>
            </body>

    </html>
