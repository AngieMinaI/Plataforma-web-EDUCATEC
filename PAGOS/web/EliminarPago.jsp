<%-- 
    Document   : EliminarPago
    Created on : 30/11/2022, 11:45:52 PM
    Author     : ABIGAIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="background-color:#6495ed">GESTION GENERAL</h1>
        <h1>Confirmación</h1>
        <form name="frmPago" method="POST" action="EliminarPago">
            <input type="hidden" name="codIni" value="${param.codInit}"><br>
            <label>¿Está seguro de eliminar el pago con código [${param.codInit}]?</label>
            <button name="btnEnv"> Eliminar</button> 
        </form>
    </body>
</html>
