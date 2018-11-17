<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<ul>
    <li>
        <a href="http://localhost:8080/mapping/path">http://localhost:8080/mapping/path</a>
    </li>
    <li>
        <a href="http://localhost:8080/mapping/path/test">http://localhost:8080/mapping/path/test</a>
    </li>
    <li>
        <a href="http://localhost:8080/mapping/parameter?foo=FOO">http://localhost:8080/mapping/parameter?foo=FOO</a>
    </li>
    <li>
        <a href="http://localhost:8080/mapping/parameter?aaa=FOO">http://localhost:8080/mapping/parameter?aaa=FOO</a>
    </li>
    <li>
        <a href="http://localhost:8080/mapping/pathVariable/aaa">http://localhost:8080/mapping/pathVariable/aaa</a>
    </li>
    <li>
        <a href="http://localhost:8080/mapping/headerDefault">http://localhost:8080/mapping/headerDefault</a>
    </li>
    <li>curl -H "FooHeader: foo" http://localhost:8080/mapping/header</li>
    <li>curl -H "BuuHeader: foo" http://localhost:8080/mapping/header</li>
    <li>curl -v --cookie "openid_provider=SPRING" http://localhost:8080/mapping/cookie</li>
    <li>curl -X POST -d "body=akuku" http://localhost:8080/mapping/body</li>
</ul>


</body>
</html>

