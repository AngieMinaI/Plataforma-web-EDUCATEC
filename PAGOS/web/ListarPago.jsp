<%-- 
    Document   : ListarPago
    Created on : 30/11/2022, 11:50:26 PM
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
        <h1>Constancia de Pagos</h1>
        <a href="GestionCurso.jsp">Regresar</a>
        <form action="ListarPago" method="POST">
            <input type="submit" name="accion" value="lis">
            <input type="submit" name="accion" value="nuevo">

        </form>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Codigo Pago</th>
                    <th scope="col">Codigo Alumno</th>
                    <th scope="col">Ciclo</th>
                    <th scope="col">Nro. Cuota</th>
                    <th scope="col">Monto</th>
                    <th scope="col">Fecha</th>
                </tr>
            </thead>
            <jsp:useBean class="acceso.AccesoDatos" id="listaPago"></jsp:useBean>
            <c:forEach var="dato" items="${listaPago.listarPago()}">
            <tbody>
                <tr>
                    <th scope="row">${dato.getId_pago()}</th>
                    <td>${dato.getId_alumno()}</td>
                    <td>${dato.getCiclo()}</td>
                    <td>${dato.getNro_cuota()}</td>
                    <td>${dato.getMonto()}</td>
                    <td>${dato.getFecha()}</td>
                    <td>
                    <a href="ModificarPago.jsp?codId_pago=${dato.Id_pago()}">Modificar</a>
                        <a href="EliminarPago.jsp?codInit=${dato.Id_pago()}">Eliminar</a>
                        </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
