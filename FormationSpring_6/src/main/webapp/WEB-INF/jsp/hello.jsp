<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Hello World</title>

    <spring:url value="/resources/css/hello.css" var="helloCss" />
    <link href="${helloCss}" rel="stylesheet" />

</head>
<body>

<div class="container">
    <p>
        <c:if test="${not empty msg}">
            <h2>Hello <label class="myName">${msg}</label></h2>
        </c:if>

        <c:if test="${empty msg}">
            <h2>${message}</h2>
        </c:if>
    </p>
    <p>
        <button id="alertButton">alert button</button>
    </p>
</div>

<spring:url value="/resources/js/hello.js" var="helloJs" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${helloJs}"></script>

</body>
</html>