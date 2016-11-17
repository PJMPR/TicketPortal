<%--
  Created by IntelliJ IDEA.
  User: Kuba
  Date: 2016-11-17
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

    <title>Bilety</title>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>Bilety</h1>
                <P> Aktualnie dostepne bilety</P>
            </div>
        </div>
    </section>
    <section class="container">
        <div class="row">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${ticket.ticketName}</h3>
                        <p>${ticket.ticketDesc}</p>
                        <p>${ticket.price} PLN</p>
                        <p>Ilosć dostępnych sztuk: ${ticket.ticketsInStock}</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

</body>
</html>
