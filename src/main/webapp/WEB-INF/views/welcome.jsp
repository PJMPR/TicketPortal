<%--
  Created by IntelliJ IDEA.
  User: Kuba
  Date: 2016-11-14
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Witaj</title>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1> ${greeting}</h1>
                <p> ${tagline}</p>

            </div>
        </div>
    </section>

</body>
</html>
