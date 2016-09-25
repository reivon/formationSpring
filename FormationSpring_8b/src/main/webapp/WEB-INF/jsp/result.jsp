<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Student Information</h2>
<table>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${age}</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Sexe</td>
        <td>${sexe}</td>
    </tr>
    <tr>
        <td>Aime les frites</td>
        <td>${friteAddict}</td>
    </tr>
    <tr>
        <td>Sauce</td>
        <td>${sauce}</td>
    </tr>
    <tr>
        <td>Description</td>
        <td>${description}</td>
    </tr>
</table>
</body>
</html>