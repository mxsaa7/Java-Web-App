<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="login_signup.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

    <section class="signin">
        <div class="max-width">
            <div class="wrapper">
            <p style="color:red; text-align:center; margin-bottom:2px;">Username or Password was Incorrect</p>
                <h2 style="font-size: 35px; margin-top:10px;">Sign In</h2>
                <form action="<%=request.getContextPath() %>/login" method="post">
                    <input type="text" id="username"name="username" placeholder="Username">

                    <input type="password" id="password" name="password" placeholder="Password">
                    <input type="submit" value="Submit">
                    <div class="reg-signin">
                        <p>
                        <a href="signup.jsp">Not registered yet?</a>
                        </p>
                        </div>
                </form>
            </div>
        </div>
    </section>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>