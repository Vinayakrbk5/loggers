<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login.do" method="post">
<input type="email" name="toEmailId" placeholder="To email"><br>
<input type="text" name="subject" placeholder="subject"><br>
<textarea rows="10" cols="20" name="body" placeholder="text message here"></textarea><br>
<button type=submit>submit</button>
</form>
</body>
</html>