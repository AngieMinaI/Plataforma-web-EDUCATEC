
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="main.css"/>
    </head>
    <body>
        <h1 style="background-color:#6495ed";>GESTION GENERAL</h1>
        <h1>Agregar Profesores</h1>
        <form name="frmProf" method="POST" action="AddProfesor">
            <label for="txtCod">Codigo</label>
            <input type="text" name="txtCod"/>
            <label for="txtApe">Apellido </label>
            <input type="text" name="txtApe"/>
            <label for="txtNom">Nombre</label>
            <input type="text" name="txtNom"/>
            <button name="btnEnv"> Agregar</button> 
        </form>
    </body>
</html>
