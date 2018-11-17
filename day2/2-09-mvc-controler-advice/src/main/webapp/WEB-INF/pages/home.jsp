<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
    <head>
        <title>Home</title>
    </head>

    <body>
        <h1>
            Finsys Spring MVC training - controller advice
        </h1>

        <P>The time on the server is ${serverTime}. </P>

        <h2>@ControlerAdvice</h2>
        <ul>
        <li><a href="userdetails">Get My Credit Card Details (and throw an IOException)</a></li>
        <li><a href="useraddress">Get My Address (and throw an IOException)</a></li>
        </ul>
    </body>
</html>
