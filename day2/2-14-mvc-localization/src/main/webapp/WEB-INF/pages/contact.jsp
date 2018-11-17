<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <title>Finsys Spring MVC training - localization</title>
    </head>
    <body>
        <h3><spring:message code="label.title"/></h3>

        <span style="float: right">
            <a href="?lang=en">en</a>
            |
            <a href="?lang=de">de</a>
        </span>

        <form:form modelAttribute="contact">
            <table>
                <tr>
                    <td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
                    <td><form:input path="firstname" /></td>
                </tr>
                <tr>
                    <td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
                    <td><form:input path="lastname" /></td>
                </tr>
                <tr>
                    <td><form:label path="lastname"><spring:message code="label.email"/></form:label></td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td><form:label path="lastname"><spring:message code="label.telephone"/></form:label></td>
                    <td><form:input path="telephone" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="<spring:message code="label.addcontact"/>"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
