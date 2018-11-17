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
            Spring Matrix Variables
        </h1>

        <h2>Matrix Variables</h2>
        <ul>
            <li><a href="matrixvars/BT.A=276.70,+10.40,+3.91;AZN=236.00,+103.00,+3.29;SBRY=375.50,+7.60,+2.07">Stocks -- BT.A=276.70,+10.40,+3.91;AZN=236.00,+103.00,+3.29;SBRY=375.50,+7.60,+2.07</a></li>
            <li><a href="matrixvars/BT.A=276.70,+10.40,+3.91;AZN=236.00,,+3.29;SBRY=375.50,,">Stocks -- BT.A=276.70,+10.40,+3.91;AZN=236.00,,+3.29;SBRY=375.50,,</a></li>
            <li><a href="matrixvars/BT.A=276.70,,+3.91;AZN=236.00,+103.00,+4.05;SBRY=375.50/name=roger;number=105;location=stoke-on-trent">Stocks -- BT.A=276.70,+10.40,+3.91;AZN=236.00,+103.00,+3.29;SBRY=375.50,+7.60,+2.07 and account info</a></li>
        </ul>
    </body>

</html>
