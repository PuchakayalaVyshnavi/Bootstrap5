<html>
<head>
<title>Confirmation Favourite language</title>
</head>
<%
//read form data
String favLang= request.getParameter("language");
//create the cookie
Cookie theCookie=new Cookie("myApp.language",favLang);
//setting life span for cookie
theCookie.setMaxAge(60*60*24*365);
//send cookie to browser
response.addCookie(theCookie);		
%>
<body>
Thanks ....... Fav Lang is ${param.language};
<br/>
<a href="cookies-homepage.jsp">Return Home</a>
</body></html>