<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Title</title>
</head>
<body>
The Student is confirmed: ${param.firstName}  ${param.lastName} 
<br/>
Student country is ${param.Country}
<br/>
Gender is ${param.gender}"
<br/>

<!-- Displaying list of languages -->
favourite languages is :
<ul>
<%
String[] langs= request.getParameterValues("language");
for(String tempLang: langs){
	out.print("<li>" + tempLang +"</li>");
}
%>
</ul>
<br/>

</body>
</html>