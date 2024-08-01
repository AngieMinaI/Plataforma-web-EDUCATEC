<%-- 
    Document   : cursos
    Created on : 20 oct. 2022, 02:52:11
    Author     : SCERON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1 style="background-color:#6495ed";>GESTION GENERAL</h1>
        <h1>Cursos</h1>
        <a href="GestionCurso.jsp">Regresar</a>
        <form name="frmCurso" method="POST" action="AddCurso">
            <label for="txtCod"> CodigoCurso </label>
            <input type="text" name="txtCod"/>
            <label for="txtNom">NombreCurso </label>
            <input type="text" name="txtNom"/>
            <label for="txtDur">Duración </label>
            <input type="text" name="txtDur"/>
            <label for="txtCat">Categoria </label>
            <input type="text" name="txtCat"/>
            <button name="btnEnv" > Agregar</button> 
        </form>
    </body>
</html>
