<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>CONCESSION</title>

    <spring:url value="/resources/js/jquery-3.1.1.min.js" var="jquery"/>
    <script src="${jquery}"></script>
</head>
<body>

<h2>Mon garage</h2>


<!-- Traitement du commercial -->

<div>
    <!-- 2. Afficher le nom du commercial dans le message -->
    <spring:message code="index.commercial" arguments="${garage.commercial.nom}"/>
</div>

<!-- Traitement des parkings -->

<!-- 3. Afficher les parkings avec leur nom -->
<c:forEach items="${garage.parkings}" var="parking">
    <div style="float:left; width:50%;">

        <div>
            <!-- 3. parking : write my name -->
            <h3>${parking.nom}</h3>
            <!-- 4. Afficher toutes les voitures du parking courant -->
            <ul>
                <c:forEach items="${parking.voitures}" var="voiture">
                    <li>${voiture.nom} [${voiture.essence}]</li>
                </c:forEach>
            </ul>
        </div>

        <div>
            <!-- 5. bouton ajouter essence pour toutes les voitures du parking -->
            <input name="addEssenceButton" type="button" data-pNom="${parking.nom}"
                   value="<spring:message code="index.parking.ajouterEssence"/>"/>
        </div>

        <div>
            <!-- 6. 7. Créer un formulaire pour ajouter une voiture -->
            <form:form method="POST" modelAttribute="addVoitureForm" action="/parking/addVoiture">
                <form:hidden path="parkingName" value="${parking.nom}"/>
                <form:select path="voitureName">
                    <form:options items="${listVoitures}"/>
                </form:select>
                <input type="submit" value="<spring:message code="index.parking.ajouterVoiture"/>"/>
            </form:form>
        </div>
    </div>
</c:forEach>

<div style="clear:both;">Footer</div>

<script>
    jQuery(document).ready(function ($) {
        $("input[name^='addEssenceButton']").on("click", function () {
            var data = $(this).attr("data-pNom");
            callAddEssence(data);
        });
    });

    function callAddEssence(data) {
        var postData = "parkingName=" + data;

        $.ajax({
            type: "POST",
            url: "parking/addEssenceAjax",
            data: postData,
            dataType: 'json',
            timeout: 100000,
            success: function (data) {
                if (data.status == 'OK') {
                    window.location.href = "http://localhost:8080/";
                }
            },
            error: function (e) {
                alert("Erreur : " + e);
            }
        });
    }
</script>

</body>
</html>