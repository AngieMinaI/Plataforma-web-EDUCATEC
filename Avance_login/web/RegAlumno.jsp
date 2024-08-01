<%-- 
    Document   : RegAlumno
    Created on : 30 nov. 2022, 20:48:31
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
        <h1>Agregar Profesores</h1>
        <form name="frmStud" method="POST" action="AddStudent">
            <label for="txtCod">Codigo</label>
            <input type="text" name="txtCod"/>
            <label for="txtApe">Apellido </label>
            <input type="text" name="txtApe"/>
            <label for="txtNom">Nombre</label>
            <input type="text" name="txtNom"/>
            <label for="txtEmail">Correo</label>
            <input type="text" name="txtEmail"/>
            <button name="btnEnv"> Agregar</button> 
        </form>
    </body>
</html>
