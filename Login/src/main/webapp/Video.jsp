<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Video</title>
<style>
body {
    margin: 0;
    min-height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
    font-family: Arial, sans-serif;
}
.video-box {
    width: 80%;
    max-width: 900px;
    background: #000;
    padding: 15px;
    border-radius: 12px;
}
.video-box iframe {
    width: 100%;
    height: 500px;
    border: none;
    border-radius: 10px;
}
</style>
</head>
<body>

<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
response.setHeader("Expires","0");

if(session.getAttribute("UserName") == null){
    response.sendRedirect("login.jsp");
}
%>

<div class="video-box">
    <iframe src="https://www.youtube.com/embed/-BZS9P9LxwI" allowfullscreen></iframe>
</div>

</body>
</html>
