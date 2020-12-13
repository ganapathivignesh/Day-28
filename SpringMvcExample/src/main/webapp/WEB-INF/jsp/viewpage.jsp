<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style>
.error{color:red}
</style>
</head>
<body>
<form:form action="helloagain" modelAttribute="emp">
Username: <form:input path="name"/><form:errors path="name" cssClass="error" /><br>
Password(*): <form:password path="pass"/><form:errors path="pass" cssClass="error" /><br>
Email Id:<form:input path="email"/><form:errors path="email" cssClass="error" /><br>
Mobile No:<form:input path="mblno" /><form:errors path="mblno" cssClass="error" /><br>
Gender :<br>
male:<form:radiobutton path="gender" value="male" /><form:errors path="gender" cssClass="error" /><br>
female:<form:radiobutton path="gender" value="female" /><form:errors path="gender" cssClass="error" /><br>
Roles:<br>
developer:<form:checkbox path="roles" value="developer" /><form:errors path="roles" cssClass="error" />
tester:<form:checkbox path="roles" value="tester" />
supporter:<form:checkbox path="roles" value="supporter" />
Analyst:<form:checkbox path="roles" value="Analyst" /><br>

Location:<form:select path="location">
<form:option value="select"/>
<form:option value="chennai" label="chennai" />
<form:option value="hyderabad" label="hyderabad"/>
<form:option value="delhi" label="delhi"/>
<form:option value="mumbai" label="mumbai" />
</form:select>
Designation:<form:input path="designation" /><form:errors path="designation" cssClass="error" />
<input type="submit" value="submit">
</form:form>
</body>
</html>