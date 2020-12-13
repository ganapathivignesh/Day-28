<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<html>
<body>
Username: ${emp.name} <br><br>
Password: ${emp.pass}<br><br>
Email :${emp.email }<br><br>
Mobile No:${emp.mblno}
Roles:
<c:forEach items="${emp.roles}" var="role">
<c:out value="${role}" />
</c:forEach>

Location:${emp.location}
Designation:${ emp.designation}

</body>
</html>