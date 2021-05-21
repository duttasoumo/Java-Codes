<%@page import="itemInfo.Item"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Insert title here</title>
            <style>
                body {
                    background-image: url('images/complete.jpg');
                    background-repeat: no - repeat;
                    background-attachment: fixed;
                    font-family: EngraversGothic BT;
                    font-size: 20px;
                    font-style: Semi Expanded Bold;
                }
                
                .btn {
                    background: #eb9840;
                    background-image: -webkit-linear-gradient(top, #eb9840, #2b1a06);
                    background-image: -moz-linear-gradient(top, #eb9840, #2b1a06);
                    background-image: -ms-linear-gradient(top, #eb9840, #2b1a06);
                    background-image: -o-linear-gradient(top, #eb9840, #2b1a06);
                    background-image: linear-gradient(to bottom, #eb9840, #2b1a06);
                    -webkit-border-radius: 14;
                    -moz-border-radius: 14;
                    border-radius: 14px;
                    font-family: Arial;
                    color: #ffffff;
                    font-size: 20px;
                    padding: 10px 20px 10px 20px;
                    text-decoration: none;
                }
                
                .btn:hover {
                    background: #2b1a06;
                    background-image: -webkit-linear-gradient(top, #2b1a06, #eb9840);
                    background-image: -moz-linear-gradient(top, #2b1a06, #eb9840);
                    background-image: -ms-linear-gradient(top, #2b1a06, #eb9840);
                    background-image: -o-linear-gradient(top, #2b1a06, #eb9840);
                    background-image: linear-gradient(to bottom, #2b1a06, #eb9840);
                    text-decoration: none;
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
                    color: bisque;
                    font-style: Bold;
                    font-size: 40px
                }
            </style>
        </head>

        <body>
            <H2 align="center">Transaction Successful !!</H2><br/>
            <H3 align="center">Transaction ID :
                <%=(int)session.getAttribute("transacID")%>
            </H3>
            <hr/>
            <hr/>
            <H4 align="center">Items Selected : </H4><br/>
            <table align=center cellpadding='20' cellspacing='10'>
                
                    <%
	String s=(String)session.getAttribute("transac");
	session.setAttribute("transac","");
	String itemar[]=s.substring(0,s.length()-1).split(",");
	
	for(int i=0;i<itemar.length;i++){
		if(i%4==0)
			out.write(" <tr> ");
		
		out.write(" <td> ");
                out.write(" <img class='b' src="+Item.getImg(Integer.parseInt(itemar[i]))+" width='95' height='140' />   <br/> <b>"+Item.getName(Integer.parseInt(itemar[i]))+"</b>");
		out.write(" </td> ");
		
		if(i%4==3)
		out.write(" </tr> ");
		
	}
%>
                
            </table>
            <form action="itemSelect.jsp" align="center"><input type="submit" class='btn' value="New Transaction" /></form>
        </body>

        </html>
