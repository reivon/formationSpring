<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
<form:form method="POST" modelAttribute="studentForm" action="/addStudent">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td><form:label path="id">id</form:label></td>
            <td><form:input path="id" /></td>
        </tr>
        <tr>
            <td><form:label path="sexe">Sexe</form:label></td>
            <td>
                <label><form:radiobutton path="sexe" value="M" /> Homme </label><br />
                <label><form:radiobutton path="sexe" value="F" /> Femme</label>
            </td>
        </tr>
        <tr>
            <td><form:label path="friteAddict">Aime les frites</form:label></td>
            <td><form:checkbox path="friteAddict" /></td>
        </tr>
        <tr>
            <td><form:label path="sauce">Quel sauce ?</form:label></td>
            <td>
                <form:select path="sauce" > <!-- itemLabel=""  itemValue="" multiple="true" size="5" -->
                    <form:option value="NONE" label="--- Select ---" />
                    <form:options items="${sauces}" />
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label path="description">Description</form:label></td>
            <td><form:textarea path="description" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>