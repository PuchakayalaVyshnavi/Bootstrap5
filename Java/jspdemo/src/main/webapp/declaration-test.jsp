<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declaration</title>
</head>
<body>
<%!
String makeItLower(String data){
return data.toLowerCase();
}
%>
making string lower <%= makeItLower("Hello World") %>
</body>
</html>