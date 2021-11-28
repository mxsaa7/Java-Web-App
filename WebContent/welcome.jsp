<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-Track</title>
<link href="index.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<nav class="navbar">
            <div class="max-width">
                <div class="logo">
                	<i class="fa fa-gg-circle" aria-hidden="true"></i>
                    <a href="#">Expense<span></span></a>
                </div>
            </div>
     </nav>
			<div class="welcome-user">
				<div class="container">
					<h1 style="margin-right:auto; margin-left:auto; float:center;">Welcome to E-Track <%= request.getParameter("username")%>!</h1>
					<button onclick="window.location.href='index.jsp';" style="margin-left:auto; margin-right:auto; width:100%;">Begin Tracking Your Expense's!</button>	
				</div>
			</div>

</body>
</html>