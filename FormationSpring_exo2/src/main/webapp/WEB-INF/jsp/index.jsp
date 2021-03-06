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
</div>

<!-- Traitement des parkings -->

<!-- 3. Afficher les parkings avec leur nom -->
<c:forEach items="" var="">
    <div style="float:left; width:50%;">

        <div>
            <!-- 3. parking : write my name -->
            <h3></h3>
            <!-- 4. Afficher toutes les voitures du parking courant (nom + essence) -->
            <ul>
                <li>Empty</li>
            </ul>
        </div>

        <div>
            <!-- 5. bouton ajouter essence pour toutes les voitures du parking -->
            <input name="addEssenceButton" type="button" data-pNom="" value="message ajouter essence"/>
        </div>

        <div>
            <!-- 6. 7. Créer un formulaire pour ajouter une voiture sur l'adresse /parking/addVoiture -->
            <!-- champ parkingName et voitureName -->
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