<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>

    <spring:url value="/resources/js/jquery-3.1.1.min.js" var="jquery" />
    <script src="${jquery}"></script>
</head>
<body>

<h2>Passez moi ces feuilles de calculs</h2>
<h3>Tout de suite !</h3>
<form id="calcForm">
    <input type="text" id="a" size="5"/> + <input type="text" id="b" size="5" />
    <input type="submit" value="  =  "/> <input type="text" id="c" size="5" />
</form>

<script>
    jQuery(document).ready(function($) {
        $("#calcForm").submit(function(event) {
            // Prevent the form from submitting via the browser.
            event.preventDefault();
            addAjax();
        });
    });

    function addAjax() {
        var data = {};
        data["a"] = $("#a").val();
        data["b"] = $("#b").val();

        $.ajax({
            type : "POST",
            contentType : "application/json",
            url : "/addAjax",
            data : JSON.stringify(data),
            dataType : 'json',
            timeout : 100000,
            success : function(data) {
                console.log("SUCCESS: ", data);
                $("#c").val(data.c);
            },
            error : function(e) {
                console.log("ERROR: ", e);
                $("#c").val("error");
            },
            done : function(e) {
                console.log("DONE");
            }
        });
    }
</script>

</body>
</html>