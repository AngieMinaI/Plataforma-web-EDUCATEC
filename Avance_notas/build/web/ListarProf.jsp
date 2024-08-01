
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
        
        <h1 style="background-color:#6495ed">GESTION GENERAL</h1>
        <h1>Lista de profesores</h1>
        <a href="GestionCurso.jsp">Regresar</a>

        </form>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">CODIGO</th>
                    <th scope="col">APELLIDO</th>
                    <th scope="col">NOMBRE</th>
                    <th scope="col">ACCION</th>
                </tr>
            </thead>
            <jsp:useBean class="acceso.AccesoDatos" id="listaProf"></jsp:useBean>
            <c:forEach var="dato" items="${listaProf.listarProf()}">
            <tbody>
                <tr>
                    <th scope="row">${dato.getCod()}</th>
                    <td>${dato.getApe()}</td>
                    <td>${dato.getNom()}</td>
                    <td>
                        <a href="ModificarProf.jsp?codInit=${dato.getCod()}">Modificar</a>
                        <a href="EliminarProf.jsp?codInit=${dato.getCod()}">Eliminar</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
    <br><a href= AgregarProf.jsp> Seguir registrando profesores </a>
    <br><a href= index.jsp> Salir sesion </a>
</html>
