<%@page import="java.util.ArrayList"%>
    <%@page import="itemInfo.Item"%>
        <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
            <html>

            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                <title>Item Details</title>
                <style>
                    .btn {
                        background: #00ffbf;
                        background-image: -webkit-linear-gradient(top, #00ffbf, #1d25c2);
                        background-image: -moz-linear-gradient(top, #00ffbf, #1d25c2);
                        background-image: -ms-linear-gradient(top, #00ffbf, #1d25c2);
                        background-image: -o-linear-gradient(top, #00ffbf, #1d25c2);
                        background-image: linear-gradient(to bottom, #00ffbf, #1d25c2);
                        -webkit-border-radius: 60;
                        -moz-border-radius: 60;
                        border-radius: 60px;
                        text-shadow: 1px 1px 3px #00ff1e;
                        font-family: Courier New;
                        color: #ffffff;
                        font-size: 17px;
                        padding: 10px 20px 10px 20px;
                        text-decoration: none;
                        margin-left:35%;
                    }
                    
                    .btn:hover {
                        background: #3cb0fd;
                        background-image: -webkit-linear-gradient(top, #3cb0fd, #3498db);
                        background-image: -moz-linear-gradient(top, #3cb0fd, #3498db);
                        background-image: -ms-linear-gradient(top, #3cb0fd, #3498db);
                        background-image: -o-linear-gradient(top, #3cb0fd, #3498db);
                        background-image: linear-gradient(to bottom, #3cb0fd, #3498db);
                        text-decoration: none;
                    }
                    
                    body {
                        background-image: url('images/back1.jpg');
                        background-repeat: no-repeat;
                        background-attachment: fixed;
                        font-family: EngraversGothic BT;
                        font-size: 20px;
                    }
                    
                    hr.style18 {
                        height: 30px;
                        border-style: solid;
                        border-color: #FFD700;
                        border-width: 1px 0 0 0;
                        border-radius: 20px;
                    }
                    
                    hr.style18:before {
                        display: block;
                        content: "";
                        height: 30px;
                        margin-top: -31px;
                        border-style: solid;
                        border-color: #FFD700;
                        border-width: 0 0 1px 0;
                        border-radius: 20px;
                    }
                    
                    h2 {
                        margin-top: 10%;
                        margin-left: 30%;
                        color: #FFD700;
                    }
                    
                    img.b {
                        border-style: groove;
                        border-radius: 10px;
                        border-width: 5px;
                        margin-left: 7%;
                        margin-top: 7%;
                    }
                    
                    h3 {
                        font-family: Chalet;
                        font-size: 25px;
                        margin-left: 15%;
                        margin-top: 2%
                    }
                    table{
                        margin-left: 15%;
                        margin-top: 2%
                    }

                </style>
            </head>

            <body>
                <%
ArrayList<String> ar=(ArrayList<String>)session.getAttribute("arrayL"); 
%>

                    <img class="b" src=<%=Item.getImg(Integer.parseInt(ar.get(0))) %> width="210" height="300" align="left"/> <br/>


                    <h2 style="font-family: sans-serif;">
                        <%=Item.getName(Integer.parseInt(ar.get(0))) %>
                    </h2>


                    <br/>
                    <br/><br/>
                    <br/><br/>
                    <br/><br/>
                    <br/><br/>
                    <br/><br/>
                    <br/><br/>
                    <hr class="style18" width=70%/>
                    <h3><b>Customer may Select ..</b></h3>
                    <form action="itemSet">
                        <table border="0" cellpadding='20' cellspacing='10'>
                           
                            <%
for(String s:ar){
	out.write("<tr>");
	out.write(" <td> ");
	out.write("<input type=radio name='rad' value="+s);
	out.write("> </td> ");
	String sar[]=s.split(",");
	for(String x:sar){
		out.write(" <td> ");
		out.write("<img class='b' src="+Item.getImg(Integer.parseInt(x))+" width=70 height=100/> <br/> <b>"+Item.getName(Integer.parseInt(x))+"</b>");
		out.write(" </td> ");
	}
	out.write("</tr>");
}
%>
                                
                                <tr>
                                    <td colspan=3 ><input type="submit" value="Select ItemSet" class="btn" /></td>
                                </tr>
                        </table>

                    </form>
            </body>

            </html>
