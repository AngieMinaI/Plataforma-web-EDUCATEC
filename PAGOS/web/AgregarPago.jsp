<%-- 
    Document   : AgregarPagos
    Created on : 30/11/2022, 11:18:07 PM
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
        <h1>Agregar Pagos</h1>
        <form name="frmPago" method="POST" action="AgregarPago">
            <label for="txtCod">Codigo Pago</label>
            <input type="text" name="txtCod"/>
            <label for="txtAlu">Codigo Alumno</label>
            <input type="text" name="txtAlu"/>
            <label for="txtCiclo">Ciclo</label>
            <input type="text" name="txtCiclo"/>
            <label for="txtCuo">Nro. Cuota</label>
            <input type="text" name="txtCuo"/>
            <label for="txtMon">Monto</label>
            <input type="text" name="txtMon"/>
            <label for="txtFecha">Fecha</label>
            <input type="text" name="txtFecha"/>
            <button name="btnEnv">Enviar</button> 
        </form>
    </body>
</html>
