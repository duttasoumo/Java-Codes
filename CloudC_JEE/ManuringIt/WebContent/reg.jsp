<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <head>
        <meta charset="utf-8">
        <link href="css/form.css" rel="stylesheet" type="text/css"  />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign Up Form</title>
        <style>
               @media screen and (min-width: 720px) {
            form {
                max-width: 820px;
            }
        }
        
        td{
        	padding:10px 5px 10px 5px;
        }
        th{ padding:20px 15px 20px 5px;
        }
    </style>
</head>

    <body>

        <form method="post" action="Reg">

            <h1>Sign Up</h1>
			<table>
                <tr><th colspan="3" align="center"><legend><span class="number">1</span>Customer basic info</legend></th></tr>
                <tr><td><label for="name">Name:</label></td>
                <td ><input type="text" id="name" name="name" required></td></tr>
				
				<tr><td><label>Gender:</label></td>
                <td ><input type="radio" value="M" name="gender" id='M'><label for="Male" class="light" checked>Male</label><br>
                <input type="radio" value="F" name="gender" id='F'><label for="Female" class="light" >Female</label><br>
            	</td></tr>
                <tr><td><label for="aadhar">Aadhar ID:</label></td>
                <td ><input type="text" id="aid" name="aid" onfocusout="aadhar()" required>
                </td>
                <td><label for="phone">Phone Number:</label></td>
                <td ><input type="text" id="phno" name="phno" onfocusout="phone()" required>
				</td></tr>
				
                <tr><th colspan="3" align="center"><legend><span class="number">2</span>Customer Address info</legend></th></tr>
                
                <tr><td><label for="state">State:</label></td>
                <td ><select name="s" id="state" onchange="myFunction()">
                <option value="" selected="selected" >Select State</option>
                </select>
                </td></tr>
                <tr>
                <td><label for="dist">District:</label></td>
                <td ><select name="d" id="dist">
                <option value="" selected="selected" >Select District</option>
                </select>
                </td>
                <td><label for="city">City:</label></td>
                <td ><select name="c" id="city">
                <option value="" selected="selected">Select City</option>
                </select>
                </td>
                </tr>
                <tr><td><label for="Block">Block:</label></td>
                <td ><input type="text" name="block"></td></tr>
                
                <tr><td><label for="Village">Village:</label></td>
                <td ><input type="text" name="village" ></td></tr>

                <tr><th colspan="3" align="center"><legend><span class="number">3</span>Customer profile</legend></th></tr>
                <tr>
                <td ><label for ="bio">Size of Land:</label></td>
                <td><select name="size">
                <option value="0" /><label class="light" >less than 0.1</label> 
                <option value="1" /><label class="light" >0.1-0.2</label>
                <option value="2" /><label class="light" >0.2-0.4</label>
                <option value="3" /><label class="light" >0.4-0.6</label>
                <option value="4" /><label class="light" >0.6-0.8</label>
                <option value="5" /><label class="light" >0.8-1.0</label>
                <option value="6" /><label class="light" >1.0-1.5</label>
                <option value="7" /><label class="light" >1.5-2.0</label>
                <option value="8" /><label class="light" >2.0-2.5</label>
                <option value="9" /><label class="light" >2.5 and above</label>
                </select>
                </td>
            	<td colspan="2" align="center"><input type="submit" value="Submit"></td></tr>
            </table>
            </form>





<script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
        <script>
        function saveForm() {
        	if(typeof window.sessionStorage ==="undefined"){return;alert("NO storage!!")}
        	saveValues("input");saveValues("select");
        	window.sessionStorage.setItem("gender",document.getElementsByName("gender")[0].checked? 'M' : 'F');
        }

        	function loadForm() {
        	//nothing to work with, get out of here
        	if(typeof window.sessionStorage ==="undefined"){return;}
        	setValues("input"); setValues("select");
        	var gen=window.sessionStorage.getItem("gender");
	        if(gen) document.getElementById(gen).checked=true;
        	}


        	function saveValues(tag){
        	var inputs=document.getElementsByTagName(tag);
        	for(var i=0;i<inputs.length;i++){
        	window.sessionStorage.setItem(inputs[i].name, inputs[i].value);
        	}
        	}

        	function setValues(tag){
        	var inputs=document.getElementsByTagName(tag);
        	for(var i=0;i<inputs.length;i++){
        	inputs[i].value = window.sessionStorage.getItem(inputs[i].name);
        	}
        	}


            window.onload = function () {
        	var state = document.getElementById("state");
            var dist=document.getElementById("dist");
        	var city=document.getElementById("city");
        
            <% LinkedList<String> ar=(LinkedList<String>)session.getAttribute("stateList"); 
           	  for(String x:ar)
                out.write("state.options[state.options.length] = new Option(\""+x+"\",\""+x+"\");");
           	
           	String s = request.getParameter("sid");
           	if(s!=null){
           		%>
           		dist.focus();
           		loadForm();
           		sessionStorage.clear();
           		<%
					int sid=Integer.parseInt(s);
           			LinkedList<String> distList[]=(LinkedList<String> [])session.getAttribute("distList");
           			for(String x:distList[sid-1])
                        out.write("dist.options[dist.options.length] = new Option(\""+x+"\",\""+x+"\");");
           			LinkedList<String> cityList[]=(LinkedList<String> [])session.getAttribute("cityList");
           			for(String x:cityList[sid-1])
                        out.write("city.options[city.options.length] = new Option(\""+x+"\",\""+x+"\");");
           			out.print("document.getElementById(\"state\").selectedIndex="+s);
           		}
           		%>
            }  
        
        function myFunction(){

			saveForm();	
        	var form = document.createElement("form");
            var element1 = document.createElement("input"); 

            form.method = "POST";
            form.action = "reg.jsp";   

            element1.value=document.getElementById("state").selectedIndex;
            element1.name="sid";
            form.appendChild(element1);  
            
            document.body.appendChild(form);

            form.submit();
            
        	}
        
        function aadhar(){
        	var x=Number(document.getElementById("aid").value);
        	if(x!=0)
        	if(!(x>100000000000 && x<999999999999)){
        		document.getElementById("aid").value="";
        		document.getElementById("aid").focus();
        		alert(x+" is INVALID Aadhar ID");
        	}
        }
        
        function phone(){
        	var x=Number(document.getElementById("phno").value);
        	if(x!=0)
        	if(!(x>6000000000 && x<9999999999)){
        		document.getElementById("phno").value="";
        		document.getElementById("phno").focus();
        		alert(x+" is INVALID Phone Number");
        	}
        }
        </script>

    </body>

    </html>
