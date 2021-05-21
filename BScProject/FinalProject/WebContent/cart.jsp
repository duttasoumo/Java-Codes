<%@page import="itemInfo.Item"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Your Cart</title>
            <style>
                .btn {
                    background: #aa00ff;
                    background-image: -webkit-linear-gradient(top, #aa00ff, #242126);
                    background-image: -moz-linear-gradient(top, #aa00ff, #242126);
                    background-image: -ms-linear-gradient(top, #aa00ff, #242126);
                    background-image: -o-linear-gradient(top, #aa00ff, #242126);
                    background-image: linear-gradient(to bottom, #aa00ff, #242126);
                    -webkit-border-radius: 28;
                    -moz-border-radius: 28;
                    border-radius: 28px;
                    font-family: Arial;
                    color: #ffffff;
                    font-size: 20px;
                    padding: 10px 20px 10px 20px;
                    text-decoration: none;
                }
                
                .btn:hover {
                    background: #4f3c61;
                    background-image: -webkit-linear-gradient(top, #4f3c61, #791ca8);
                    background-image: -moz-linear-gradient(top, #4f3c61, #791ca8);
                    background-image: -ms-linear-gradient(top, #4f3c61, #791ca8);
                    background-image: -o-linear-gradient(top, #4f3c61, #791ca8);
                    background-image: linear-gradient(to bottom, #4f3c61, #791ca8);
                    text-decoration: none;
                }
                
                body {
                    background-image: url('images/library-cart.jpg');
                    background-repeat: no-repeat;
                    background-attachment: fixed;
                    font-family: EngraversGothic BT;
                    font-size: 20px;
                }
                
                img.b {
                    border-style: groove;
                    border-radius: 10px;
                    border-width: 5px;
                    margin-left: 3%;
                    margin-top: 3%;
                }
                
                h2 {
                    font-family: Exotc350 Bd BT;
                    font-size: 17px;
                    color: blueviolet;
                    font-style: Bold;
                    font-size: 40px
                }
                
                hr.style14 {
                    border: 0;
                    height: 1px;
                    background-image: -webkit-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
                    background-image: -moz-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
                    background-image: -ms-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
                    background-image: -o-linear-gradient(left, #f0f0f0, #8c8b8b, #f0f0f0);
                }
                
                hr.style18 {
                    height: 30px;
                    border-style: solid;
                    border-color: #8c8b8b;
                    border-width: 1px 0 0 0;
                    border-radius: 20px;
                }
                
                hr.style18:before {
                    display: block;
                    content: "";
                    height: 30px;
                    margin-top: -31px;
                    border-style: solid;
                    border-color: #8c8b8b;
                    border-width: 0 0 1px 0;
                    border-radius: 20px;
                }

            </style>
        </head>

        <body>
            <h2 align="center">Item you are selecting :</h2>
            <hr class="style14" width=30%/>
            <form action="Transaction">

                <table align=center cellpadding='30' cellspacing='20'>

                    <%
	String s=(String)session.getAttribute("transac");
	String itemar[]=s.substring(0,s.length()-1).split(",");
	
	for(int i=0;i<itemar.length;i++){
		if(i%4==0)
			out.write(" <tr> ");
		
		out.write(" <td> ");
                    out.write(" <img src="+Item.getImg(Integer.parseInt(itemar[i]))+" width='70' height='100' class='b'/>  <br/> <b>"+Item.getName(Integer.parseInt(itemar[i]))+"</b>");
		out.write(" </td> ");
		
		if(i%4==3)
		out.write(" </tr> ");
		
	}
%>

                </table>

                <br/><br/>
                <hr class="style18" width=80%/>

                <table width="80%" style="margin-right=10%">
                    <tr>
                        <td align="center"><input type="submit" value="Proceed To Transaction" class="btn" style="margin-left:10%;"></td>
                        <td > <input type="button" value="ADD Items" class="btn" style="margin-left:70%;" onclick="window.location.href='itemSelect.jsp'" /></td>
                    </tr>
                </table>
            </form>
        </body>

        </html>
