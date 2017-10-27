<%-- 
    Document   : loginForm
    Created on : Oct 27, 2017, 10:58:15 AM
    Author     : VI391762
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>   
<form:form method="post" action="viewUser.htm">
        <table>
            <tr>
                <td><form:label path="username">username</form:label></td>
                <td><form:input type="text" path="username"/></td>
            </tr>   
             <tr>
                 <td><form:label path="password">password</form:label></td>
                <td><form:input type="text" path="password"/></td>
            </tr>   
            <tr colspan="2">
                <td><input type="submit" value="submit"/></td>
            </tr>
        </table>
    </form:form>
    </body>
</html>