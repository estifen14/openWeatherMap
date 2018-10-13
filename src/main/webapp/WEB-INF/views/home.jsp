<%--
  Created by IntelliJ IDEA.
  User: estifen
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>HOME PAGE</title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">

    <style>
        .dataTables_filter {
            display: none!important;
        }

        .tableContainer {
            padding-top: 20px;
        }
    </style>

    <script>
        var redirect;
        $(document).ready(function(){
            redirect = function(id){
                window.location.href='/view/' + id;
            }

            $(document).ready( function () {

                var dt = $('#myTable').DataTable({
                    paging: false
                    ,bInfo: false
                });

                $("#searchbox").keyup(function() {
                    dt.search($(this).val()).draw();
                });
            } );
        });
    </script>

</head>
<body>
<input type="text" id="searchbox" placeholder="search" />
<div class="tableContainer">
    <table id="myTable" border="1">
        <thead>
        <th>Location</th>
        <th>Actual Weather</th>
        <th>Tempetature</th>
        </thead>
        <tbody>
        <c:forEach items="${weatherMaps}" var="weatherMap">
            <tr>
                <td><c:out value="${weatherMap.name}"/></td>
                <td><c:out value="${weatherMap.weatherList[0].description}"/></td>
                <td><c:out value="${weatherMap.main.temp}"/></td>
            </tr>

        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
