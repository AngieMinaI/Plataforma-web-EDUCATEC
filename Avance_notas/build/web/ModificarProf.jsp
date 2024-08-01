
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1 style="background-color:#6495ed";>GESTION GENERAL</h1>
        <h1>Modificar Profesor</h1>
        <a href="GestionCurso.jsp">Regresar</a>
        <form name="frmProf" method="POST" action="ModificarProf">
            <input type="hidden" name="codIni" value="${param.codInit}"><br>
            <label for="txtCod">Codigo</label>
            <input type="text" name="txtCod"/>
            <label for="txtNom">Apellido </label>
            <input type="text" name="txtApe"/>
            <label for="txtDur">Nombre</label>
            <input type="text" name="txtNom"/>
            <button name="btnEnv"> Modificar</button> 
        </form>
    </body>
</html>
