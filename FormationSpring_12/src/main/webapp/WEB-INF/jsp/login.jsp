<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<html>
<body>

<h2>Veuillez vous identifier !</h2>

<div>
    <form action="/login" method="post">

        <c:if test="${param.error != null}">
            <div>
                Invalid username and password.
            </div>
        </c:if>

        <c:if test="${param.logout != null}">
            <div>
                You have been logged out.
            </div>
        </c:if>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <div>
            <label for="username">Username</label> <input type="text" id="username" name="username"/>
        </div>
        <div>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>
        </div>
        <div>
            <button type="submit" class="btn">Se connecter</button>
        </div>
    </form>
</div>
</body>
</html>