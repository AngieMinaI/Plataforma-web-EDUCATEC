<%-- 
    Document   : python
    Created on : 21/10/2022, 10:23:01 PM
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
        <div class="titulo-fondo" style="background-image: url('imagenes/python-fondo.jpg'); height: 250px;">
            <h1 style="color: white;">Python</h1>
        </div>
        <div class="cont">
            <div class="text">
                <h2>¿Qué es un Python?</h2>
                <p>Python es un lenguaje sencillo de leer y escribir debido a su alta similitud con el lenguaje humano. Además, se trata de un lenguaje multiplataforma de código abierto.</p>
                <h2>¿Es muy usado?</h2>
                <p>Sí, es tan popular que empresas muy reconocidas a nivel mundial lo emplean con el fin de poder optimizar y realizar funciones.</p>
                <h2>¿Qué aplicaciones empresariales tiene?</h2>
                <p>Aplicaciones web, analizar datos, automatizar operaciones y crear aplicaciones empresariales fiables. A su vez de servir para inteligencia artificial, deep learning o machine learning.</p>
            </div>
            <div class="video">
                <video width="960" height="540" controls style="text-align: center;">
                    <source src="videos/python.mp4" type="video/mp4">
                </video>
            </div>
        </div>
        <a href="cursos.jsp">Regresar</a>
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
