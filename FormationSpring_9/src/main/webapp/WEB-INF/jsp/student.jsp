<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2><spring:message code="studentForm.title"/></h2>
<form:form method="POST" modelAttribute="studentForm" action="/addStudent">
    <table>
        <tr>
            <td><form:label path="name"><spring:message code="studentForm.name"/></form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="age"><spring:message code="studentForm.age"/></form:label></td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td><form:label path="id"><spring:message code="studentForm.id"/></form:label></td>
            <td><form:input path="id" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="<spring:message code="studentForm.button.submit"/>"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>