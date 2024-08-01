<%-- 
    Document   : ModificarAlumno
    Created on : 1 dic. 2022, 19:08:09
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
        <h1>Modificar Alumnos</h1>
        <form name="frmModAl" method="POST" action="ModificarAlumno">
            <input type="hidden" name="codIni" value="${param.codInit}"><br>
            <label for="txtCod"> CodigoAlumno: </label>
            <input type="text" name="txtCod" value="${param.codInit}"/>
            <label for="txtNom">Nombre: </label>
            <input type="text" name="txtNom"/>
            <label for="txtApe">Apellido: </label>
            <input type="text" name="txtApe"/>
            <label for="txtEmail">Correo </label>
            <input type="text" name="txtEmail"/>
            <button name="btnEnv"> Modificar</button> 
        </form>
    </body>
</html>
