<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="home.css">
</head>
<body>

<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
response.setHeader("Expires","0");

if(session.getAttribute("UserName") == null){
    response.sendRedirect("login.jsp");
}
%>

<div class="home-box">
    <h2>Welcome ${UserName}</h2>
    <a href="video.jsp">Videos here</a>

    <form action="Logout" method="post">
        <input type="submit" value="Logout">
    </form>
</div>

</body>
</html>
