<%-- 
    Document   : EliminarAlumno
    Created on : 1 dic. 2022, 19:34:18
    Author     : SCERON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1 style="background-color:#6495ed";>GESTION GENERAL</h1>
        <h1>Confirmación</h1>
        <form name="frmAlumno" method="POST" action="DeleteAlumno">
            <input type="hidden" name="codIni" value="${param.codInit}"><br>
            <label>¿Está seguro de eliminar al Alumno con código [${param.codInit}]?</label>
            <button name="btnEnv"> Eliminar</button> 
        </form>
    </body>
</html>
