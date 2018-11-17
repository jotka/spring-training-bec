<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<ul>
    <li>
        <a href="http://localhost:8080/responses/string">http://localhost:8080/responses/string</a>
    </li>
    <li>
        <a href="http://localhost:8080/responses/charset/accept">http://localhost:8080/responses/charset/accept</a>
    </li>
    <li>
        <a href="http://localhost:8080/responses/charset/produce">http://localhost:8080/responses/charset/produce</a>
    </li>
    <li>
        <a href="http://localhost:8080/responses/entity/status">http://localhost:8080/responses/entity/status </a> (chrome dev console)
    </li>
    <li>
        <a href="http://localhost:8080/responses/entity/headers">http://localhost:8080/responses/entity/headers </a> (chrome dev console)
    </li>
    <li>
        curl -H "Accept: application/json" http://localhost:8080/responses/json
    </li>
    <li>
        curl -H "Accept: application/xml" http://localhost:8080/responses/xml
    </li>
</ul>


</body>
</html>

