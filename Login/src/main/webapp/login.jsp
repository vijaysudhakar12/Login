<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="login.css">
</head>
<body class="login">

<div class="login-box">
    <h2>Login</h2>

    <form action="LoginServlet" method="post">
        <input type="text" name="uname" placeholder="Username" required>
        <input type="password" name="upass" placeholder="Password" required>
        <input type="submit" value="Login">
    </form>

    <a href="Account.jsp">Create an Account?</a>
</div>

</body>
</html>
