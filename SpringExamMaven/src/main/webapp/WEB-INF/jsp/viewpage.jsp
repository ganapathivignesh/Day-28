<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style>
.error{color:red}
</style>
</head>
<body>
<form:form action="helloagain" modelAttribute="emp">
Username: <form:input path="name"/>
Password(*): <form:password path="pass"/>
Email Id:<form:input path="email"/>
Mobile No:<form:input path="mblno" />
Gender :<br>
male:<form:radiobutton path="gender" value="male" />
female:<form:radiobutton path="gender" value="female" />
Designation:<form:input path="designation" />
<input type="submit" value="submit">
</form:form>
</body>
</html>