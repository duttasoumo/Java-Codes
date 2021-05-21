<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.ArrayList"%>
		<html>

		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<link href="css/floatinglable.css" rel="stylesheet" type="text/css" />
			<link href="css/form.css" rel="stylesheet" type="text/css" />
			<title>Insert title here</title>
			<style>
				@media screen and (min-width: 900px) {
					form {
						max-width: 80%;
					}
				}

			</style>
		</head>

		<body>
		
			<% String ar[]=(String [])request.getAttribute("list");
				String season[]=(String [])request.getAttribute("season");%>
				<form method="post" action="CropInputStore">
					<table cellpadding="10" width="100%" align="center">
						<tr>
								<th colspan="3">
									<legend><span class="number">1</span>Customer basic info</legend>
								</th>
							</tr>
							<tr>
								<td><label for="name">Name:</label></td>
								<td colspan="3"><input type="text" value="<%=ar[0]%>" readonly></td>
							</tr>

							<tr>
								<td><label for="cutomerID">Customer ID:</label></td>
								<td><input type="text" value="<%=ar[2]%>" readonly></td>

								<td><label for="aadhar">Aadhar ID:</label></td>
								<td><input type="text" value="<%=ar[1]%>" readonly></td>
							</tr>
						
						<tr>
							<th colspan="3">
								<legend><span class="number">2</span><%=season[0] %> Season Crops</legend>
							</th>
						</tr>
						
							<tr>
								<td> <label for="crop1">Crop 1 : </label></td>
								<td><input type="text" value="<%=ar[3]%>" readonly></td>
								<td><label for="crop1"> Crop 2 : </label></td>
								<td><input type="text" value="<%=ar[4]%>" readonly></td>
							</tr>
							<tr>
								<td><label for="crop1">Crop 3 : </label></td>
								<td><input type="text" value="<%=ar[5]%>" readonly></td>
							</tr>
							<tr>
								<td><label for="crop1">Sowing : </label></td>
								<td><input type="text" name="sow" value="<%=season[1]%>" readonly></td>
								<td><label for="crop1">Harvesting : </label></td>
								<td><input type="text" name="harv" value="<%=season[2]%>" readonly></td>
							</tr>
						
							<tr>
								<th colspan="3">
									<legend><span class="number">3</span>Farm Inputs</legend>
								</th>
							</tr>
							<tr>
								<td>PESTICIDE</td>
								<td>
									<div class="group">
										<input class="inputMaterial" placeholder=" " name="pesticide" type="text">
										<label class="floating">Pesticide Quantity in KG</label>
									</div>
								</td>
								<td>
									<div class="group">
										<input class="inputMaterial" placeholder=" " id="pesticide" type="text" onfocusout="cal(this)">
										<label class="floating">Pesticide price per KG</label>
									</div>
								</td>
								<td><input type="text" id="pesticide1" readonly></td>
							</tr>
							<tr>
								<td>FERTILIZER</td>
								<td>
									<div class="group">
										<input class="inputMaterial" placeholder=" " name="fertilizer" type="text" >
										<label class="floating">Fertilizer Quantity in KG</label>
									</div>
								</td>
								<td>
									<div class="group">
										<input class="inputMaterial" placeholder=" " id="fertilizer" type="text" onfocusout="cal(this)">
										<label class="floating">Fertilizer price per KG</label>
									</div>
								</td>
								<td><input type="text" id="fertilizer1" readonly></td>
							</tr>
							<tr>
								<td></td>
								<td>
									<select name="fert" style="margin: -30px 0 30px 0;">
                <option value="">Select Fertilizer Type</option>
                <option>Nitrogen</option>
                <option>Phosphorous</option>
                <option>Potassium</option>
                </select></td>
							</tr>
							<tr>
								<td>MANURE</td>
								<td>
									<div class="group">
										<input class="inputMaterial" placeholder=" " name="manure" type="text" >
										<label class="floating">Manure Quantity in KG</label>
									</div>
								</td>
								<td>
									<div class="group">
										<input class="inputMaterial" placeholder=" " id="manure" type="text" onfocusout="cal(this)">
										<label class="floating">Manure price per KG</label>
									</div>
								</td>
								<td><input type="text" id="manure1" readonly></td>
							</tr>
							<tr>
								<td>TOOLS</td>
								<td>
									<select id="tool" name="tool">
                							<option value="0">Select Tool Type</option>
                						</select>
								</td>
								<td>
									<div class="group">
										<input class="inputMaterial" id="sub" placeholder=" " type="text" value="<%=ar[6]%>" readonly>
										<label class="floating">Previous Subscription</label>
									</div>
								</td>
								<td><input type="text" id="toolprice"></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td><button id="tot" type="button">TOTAL</button></td>
								<td><input type="text" name="total"></td>
							</tr>
							<tr>
								<td colspan=3 align="center"><input type="submit" value="Submit Farm Inputs"></td>
							</tr>
						

					</table>
				</form>

				<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
				<script>
					$(document).ready(function() {
						var tool = document.getElementById("tool");
						<%
    						ArrayList<String> tool=(ArrayList<String>)request.getAttribute("toolList");
    						for(int i=1;i<=tool.size();i++)
    						{%>
						tool.options[tool.options.length] = new Option("<%=tool.get(i-1)%>", "<%=i%>");
						<%}%>
					});

					function cal(e) {
						var id = $(e).attr('id').toString();
						var id1 = id + '1';
						var q1 = parseInt($('#' + id).val());
						var q2 = parseInt($('input[name='+id+']').val());
						$('#'+id1).val(q1*q2);
					}

					$('#tot').click(function () {
						var pest=0,fert=0,manure=0,tool=0;
						if($('#pesticide1').val()!="" && !isNaN($('#pesticide1').val()))
							pest=parseInt($('#pesticide1').val());
						if($('#fertilizer1').val()!="" && !isNaN($('#fertilizer1').val()))
							fert=parseInt($('#fertilizer1').val());
						if($('#manure1').val()!="" && !isNaN($('#manure1').val()))
							manure=parseInt($('#manure1').val());
						if($('#tool').val()!="" && !isNaN($('#tool').val()))
							tool=parseInt($('#toolprice').val());
						var tot = pest + fert + manure + tool;
						$('input[name=total').val(tot);
						return;
					});

				</script>
		</body>

		</html>
