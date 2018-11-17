<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <title>Finsys Spring MVC training - file upload form</title>
    </head>
    <body>
        <center>
            <h3>Please select a file to upload !</h3>
            <br/>
            <form:form method="post" enctype="multipart/form-data" modelAttribute="uploadedFile" action="fileUpload.htm">
                <table>
                    <tr>
                        <td>Upload File:&nbsp;</td>
                        <td><input type="file" name="file"/></td>
                        <td style="color: red; font-style: italic;"><form:errors path="file"/></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><input type="submit" value="Upload"/></td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </form:form>
        </center>
    </body>
</html>
