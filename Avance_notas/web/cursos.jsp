<%-- 
    Document   : cursos
    Created on : 21/10/2022, 10:20:36 PM
    Author     : ABIGAIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="cursos.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <header class="cabecera">
                <a href="index.jsp" ><img id="logo" src="logo.jpeg" alt=""/></a>
                <nav class="navegacion">
                    <a href="Nosotros.jsp" >Nosotros</a>
                    <a href="cursos.jsp">Cursos</a>
                    <a href="inicioSesion.jsp">Iniciar sesión</a>
                    <a href="registrarSesion.jsp">Registrarse</a>
                </nav>
            </header>
        <h1 style="color: black;">CURSOS</h1>
            <div class="tabla_cat">
                <br>
                    <div class="tabla">
                        <div class="fila">
                            <div class="celda" style="background-image: url('imagenes/python-fondo.jpg');" onclick="window.location='python.jsp';">
                                <img src="imagenes/python-logo.png" style="width: 50%;">
                                <h2>PYTHON</h2>
                                <p>Uno de los lenguajes de programación más versátiles que hay en el mercado, usado en muchos rubros y áreas de las organizaciones.</p>
                            </div>
                            <div class="celda" style="background-image: url('imagenes/sql-fondo.png');" onclick="window.location='sql.jsp';">
                                <img src="imagenes/sql-logo.png" style="width: 100%;">
                                <h2>BASE DE DATOS SQL</h2>
                                <p>Almacena datos de forma coherente y ordenada, para acceder fácilmente a la información.</p>
                            </div>
                            <div class="celda" style="background-image: url('imagenes/java-fondo.png');" onclick="window.location='java.jsp';">
                                <img src="imagenes/java-logo.png" style="width: 50%;">
                                <h2>JAVA</h2>
                                <p>Lenguaje de programación con el que podemos realizar cualquier tipo de programa. Es relativamente fácil de aprender.</p>
                            </div>
                        </div>
                    </div>
                <br>
            </div>
        <footer>

                <div class="cabecera">

                    <center><div class="contenedor-footer"></center>
                    <div class=" box-footer">
                    <div class="terms">
                        <h2>Acerca de EDUCATEC</h2>
                        <p>Nosotros como empresa que presta sus servicios de educación 
                            para los jovenes emprendedores en el mundo de la informática,
                            nos comproometemos a actualizarnos de acuerdo a la demanda
                            laboral en la empresas de hoy en día.
                        </p>
                   <img class="red" src="logo.jpeg" alt=""/>
                    </div>
                </div>
                        <div class=" box-footer">
                            <div class="navegacion">
                                  <h3 >Más información</h3>
                                <a href="nosotros.html">¿Quienes somos?</a><br>
                                <a href="#">Redes Sociales</a><br>
                                <a href="#">Localización</a><br>
                                <a href="#">Libro de reclamaciones</a><br>
                                <a href="#">Políticas</a><br>
                                <a href="#">Mesa de Ayuda</a><br>
                            </div>
                        </div>

                        <div class=" box-footer">
                            <div class="terms">
                                <h3 >Redes Sociales</h3>
                                <p>Visitanos en nuestras redes. Estamos en todas partes!!!!</p>
                            
                            <img class="red" src="media.jpg" alt=""/>
                            </div>
                            </div>
                        
                        <div class=" box-footer">
                            <div class="terms">
                                <h3>Contactanos</h3>
                                <p>Consulta nuestras lineas telefónicas para resolver tus dudas</p>
                           
                            
                                <img class="blue" src="telf.png" alt=""/>
                            </div>
                        </div>
                    </div>
                    
                    <br>
                
                <hr>
                <p>&copy; Todos los Derechos Reservados 2022</p>
            </footer>
    </body>
</html>
