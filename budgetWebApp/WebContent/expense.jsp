<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Budget Tracker</title>
<link href="login_signup.css" rel="stylesheet" type="text/css">
<meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<header class="site-header">
        <nav class="navbar navbar-expand-md navbar-dark bg-steel fixed-top">
          <div class="container">
            <a class="navbar-brand mr-4" href="/"><img src="https://img.icons8.com/ultraviolet/40/000000/handshake.png" style="height:30px; padding-right: 7px;"/>Budget Tracker</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggle" aria-controls="navbarToggle" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarToggle">
              <div class="navbar-nav mr-auto">
                <a class="nav-item nav-link" href="">Home</a>

              </div>
              <!-- Navbar Right Side -->
<%
	String username = (String) session.getAttribute("username");
	if(username == null){
		
	
%>
                <div class="navbar-nav">
                      <a class="nav-item nav-link" href="login.jsp">Login</a>
                      <a class="nav-item nav-link" href="register.jsp">Register</a>
                </div>   
                
<%
	}else if(username != null){
		
	

%>
                 <div class="navbar-nav mr-auto">
                <a class="nav-item nav-link" href="">Home</a>
				<a class="nav-item nav-link" href="expense.jsp">Budget Tracker</a>
              </div>
                <div class="navbar-nav">
                      <a class="nav-item nav-link" href="logout.jsp">Logout</a>
                      
                </div> 
<%
	}
%>
                
                     
		      </nav>
		    </header>

<div class="login" style="width:600px; margin-left:auto; margin-right:auto; margin-top: 100px;">

                <h2 style="font-size: 35px;">Track your expenses</h2>
           <form action="<%=request.getContextPath() %>/expenses" method="post">
           		<div class="form-group">
                	<input type="text" name="fname" placeholder="Firstname" required>
                </div>
                <div class="form-group">
                	<input type="text" name="amount" placeholder="Expense Amount" required>
                </div>
                <div class="form-group">
                	<input type="text" name="type" placeholder="Type of Expense" required>
                </div>
                <div class="form-group">
                	<input type="text" name="date" placeholder="Date of Expense" required>
                </div>
                <div class="form-group">
                	<input type="submit" value="Log Expense"> 
                </div>
		 </form>
          </div>
</div> 
</body>
</html>