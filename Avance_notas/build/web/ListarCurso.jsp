<%-- 
    Document   : ListarCurso
    Created on : 20 oct. 2022, 20:53:54
    Author     : SCERON
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
      crossorigin="anonymous">


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1 style="background-color:#6495ed";>GESTION GENERAL</h1>
        <h1>Cursos Web!</h1>
        <a href="GestionCurso.jsp">Regresar</a>
        <form action="Listarcurso" method="POST">
            <input type="submit" name="accion" value="lis">
            <input type="submit" name="accion" value="nuevo">

        </form>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Codigo</th>
                    <th scope="col">Curso</th>
                    <th scope="col">Duración</th>
                    <th scope="col">Categoria</th>
                </tr>
            </thead>
            <jsp:useBean class="acceso.AccesoDatos" id="listaCur"></jsp:useBean>
            <c:forEach var="dato" items="${listaCur.listarCurso()}">
            <tbody>
                <tr>
                    <th scope="row">${dato.getCod()}</th>
                    <td>${dato.getNome()}</td>
                    <td>${dato.getDuracion()}</td>
                    <td>${dato.getCat()}</td>
                    <td>
                    <a href="ModificarCurso.jsp?codInit=${dato.getCod()}">Modificar</a>
                        <a href="EliminarCurso.jsp?codInit=${dato.getCod()}">Eliminar</a>
                        </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
