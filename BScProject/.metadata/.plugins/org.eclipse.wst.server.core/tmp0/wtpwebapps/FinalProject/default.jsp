<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Final Project</title>
        <style>
            .btn {
                background: #d9d9d9;
                background-image: -webkit-linear-gradient(top, #d9d9d9, #424242);
                background-image: -moz-linear-gradient(top, #d9d9d9, #424242);
                background-image: -ms-linear-gradient(top, #d9d9d9, #424242);
                background-image: -o-linear-gradient(top, #d9d9d9, #424242);
                background-image: linear-gradient(to bottom, #d9d9d9, #424242);
                -webkit-border-radius: 28;
                -moz-border-radius: 28;
                border-radius: 28px;
                font-family: Arial;
                color: #ffffff;
                font-size: 20px;
                padding: 10px 20px 10px 20px;
                text-decoration: none;
                position: relative;
                margin-top: 40%;
                margin-left: 40%;
            }
            
            .btn:hover {
                background: #616161;
                background-image: -webkit-linear-gradient(top, #616161, #d1d1d1);
                background-image: -moz-linear-gradient(top, #616161, #d1d1d1);
                background-image: -ms-linear-gradient(top, #616161, #d1d1d1);
                background-image: -o-linear-gradient(top, #616161, #d1d1d1);
                background-image: linear-gradient(to bottom, #616161, #d1d1d1);
                text-decoration: none;
            }
            
            body {
                background-image: url('images/ekart.jpg');
                background-repeat: no-repeat;
                background-attachment: fixed;
            }

        </style>
    </head>

    <body>
        <hr>
        <a href="itemSelect.jsp"><button class="btn">
            Start Shopping
        </button></a>
        <% session.setAttribute("transac", ""); %>
    </body>

    </html>
