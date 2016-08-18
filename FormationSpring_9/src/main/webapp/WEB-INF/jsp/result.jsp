<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2><spring:message code="studentForm.result.title"/></h2>
<spring:message code="result.test" arguments="${name}"/>

<table>
    <tr>
        <td><spring:message code="studentForm.name"/></td>
        <td>${name}</td>
    </tr>
    <tr>
        <td><spring:message code="studentForm.age"/></td>
        <td>${age}</td>
    </tr>
    <tr>
        <td><spring:message code="studentForm.id"/></td>
        <td>${id}</td>
    </tr>
</table>
</body>
</html>