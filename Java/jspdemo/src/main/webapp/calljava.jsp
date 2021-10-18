<%@ page import = "com.jspdemo.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>call java class from jsp</title>
</head>
<body>
Lets have some fun <%= com.jspdemo.FunUtils.makeItLower("FUN FUN FUN") %>

</body>
</html>