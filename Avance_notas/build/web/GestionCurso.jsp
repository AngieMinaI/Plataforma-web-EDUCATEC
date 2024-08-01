<%-- 
    Document   : GestionCurso
    Created on : 21 oct. 2022, 21:20:45
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
        <%
            String usu = (String)session.getAttribute("usr");
            out.println(" <h1>Usuario logueado: " +usu+"</h1>");
        %>
        <h1 style="background-color:#6495ed";>GESTION GENERAL</h1>
        <h1>Gestión de Cursos</h1>
        
            <nav>
		<a href="cursos_1.jsp">Agregar Cursos</a> <br><br>
		<a href="ListarCurso.jsp">Listar Cursos</a><br><br>
            </nav>
        <h1 >Gestión de Profesore</h1>
        
            <nav>
		<a href="AgregarProf.jsp">Agregar Profesor</a> <br><br>
		<a href="ListarProf.jsp">Listar Profesor</a><br><br>
            </nav>
    </body>
</html>
