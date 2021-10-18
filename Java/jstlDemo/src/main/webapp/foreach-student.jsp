<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import ="java.util.*,com.jstlDemo.Student" %>

<%
List<Student> data= new ArrayList<>();

data.add(new Student("jhon","Doe",false));
data.add(new Student("Ram","Raj",false));
data.add(new Student("ravi","Ram",true));

pageContext.setAttribute("myStudents",data);

%>
<html>
<body>
<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>GoldCustomer</th>
</tr>
<c:forEach var="tempStudent" items="${myStudents}">
<tr>
<td>${tempStudent.firstName}</td>
<td>${tempStudent.lastName}</td>
<!--<td>${tempStudent.goldCustomer}</td>  -->


<!-- <td>
<c:if test="${tempStudent.goldCustomer}">Special Discount</c:if>
<c:if test="${not tempStudent.goldCustomer}">-</c:if>
</td> -->

<td>
<c:choose>
<c:when test="${tempStudent.goldCustomer}">
Special Discount
</c:when>
<c:otherwise>
-
</c:otherwise>
</c:choose>
</td>
</tr>
</c:forEach>
</table>

</body>
</html>