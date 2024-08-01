<%-- 
    Document   : index1
    Created on : 15/10/2022, 11:37:40 PM
    Author     : ABIGAIL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="main.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" 
              crossorigin="anonymous">
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" 
        crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="section1">
            <header class="cabecera">
                <a href="index.jsp" ><img id="logo" src="logo.jpeg" alt=""/></a>
                <nav class="navegacion">
                    <a href="Nosotros.jsp" >Nosotros</a>
                    <a href="cursos.jsp">Cursos</a>
                    <a href="inicioSesion.jsp">Iniciar sesión</a>
                    <a href="registrarSesion.jsp">Registrarse</a>
                </nav>
            </header>
            <div class="table">
                <div class="cel">
                    <h1>Cursos de informática</h1>
                    <h1>con los mejores profesores en español</h1>
                    <p id="p1">Dile adiós a los cursos en Youtube que te confunden sobre como aprendar la lógica de la tecnología.</p>
                    <p id="p1">Empieza a estudiar con nosotros y descubre por qué somos la plataforma de enseñanaza en español de tecnología.</p>
                </div>
                <div class="cel">
                    <img  src="img1.jpg" alt="alt"/>
                </div>
            </div>
            <br>

            <center><a id="boton" href="cursos.jsp" target="_blank">Empezar mis cursos</a></center>
            <br>
        </div>

        <div class="tabla">
            <section>
                <center><h2 id="titulo2">¡Descubre los cursos más solicitados!</h2></center>
                <div class="table">
                    <div class="celda">
                        <img class="item-es" src="bd.png" width="95%" height="96%"/>
                    </div>
                    <div class="celda">
                        <img class="item-es" src="tw.jpg" width="86%"/>
                    </div>
                    <div class="celda">
                        <img class="item-es" src="cc.jpg" width="99%"/>
                    </div>
                    <div class="celda">
                        <img class="item-es" src="jv.jpg" width="99%"/>
                    </div>
                </div>
                <div class="table">
                    <div class="celda">
                        <p class="titu">Base de datos SQL</p>
                    </div>
                    <div class="celda">
                        <p class="titu">Desarrollo Web Front end</p>
                    </div>
                    <div class="celda">
                        <p class="titu">Ciberseguridad</p>
                    </div>
                    <div class="celda">
                        <p class="titu">Java</p>
                    </div>
                </div>
                <div class="table">
                    <div class="celda">
                        <p class="p2">SQL es un lenguaje de dominio específico, diseñado para administrar, y recuperar información de sistemas de gestión de bases de datos relacionales.</p>
                    </div>
                    <div class="celda">
                        <p class="p2">El desarrollo web Front-end consiste en la conversión de datos en una interfaz gráfica para que el usuario pueda ver e interactuar con la información de forma digital usando HTML, CSS y JavaScript.</p>
                    </div>
                    <div class="celda">
                        <p class="p2">La seguridad informática, también conocida como ciberseguridad, es el área relacionada con la informática y la telemática que se enfoca en la protección de la infraestructura computacional y todo lo vinculado con la misma, y especialmente la información contenida en una computadora o circulante a través de las redes de computadoras.</p>
                    </div>
                    <div class="celda">
                        <p class="p2">Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems. Hay muchas aplicaciones y sitios web que no funcionarán, probablemente, a menos que tengan Java instalado, y cada día se crean más. Java es rápido, seguro y fiable.</p>
                    </div>
                </div>
            </section>
        </div>
        <br>
    <center><h2>Talleres Gratuitos para el 2023</h2></center>
    <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="p1.jpeg" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="p2.jpeg" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="p3.jpeg" class="d-block w-100" alt="...">
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>

    <div class="segundo">
        <br>
        <center><h2 id="titulo3">Testimonios de nuestros estudiantes</h2></center>
        <div class="container-card">

            <div class="carta">
                <div>
                    <img class="item-es" src="f1.jpg">
                </div>

                <div class="contenido-carta">

                    <p class="p3">"Sin haber puesto un pie en la universidad, gracias a EducaTec ya tengo un trabajo estable, y sigo aprendiendo día a día"</p>
                    <h3>Johan Castillo</h3>
                </div>
            </div>
            <div class="carta">
                <div>
                    <img class="item-es" src="f2.jpg">
                </div>
                <div class="contenido-carta">

                    <p class="p3">"Gracias a EducaTec conseguí empleo como programador Front end junior. Apesar de tener un trabajo sigo preparandome con los cursos en línea."</p>
                    <h3>Héctor Flores</h3>
                </div>
            </div>
            <div class="carta">
                <div>
                    <img class="item-es" src="f3.jpg">
                </div>
                <div class="contenido-carta">

                    <p class="p3">"Con los conocimientos que adquirí en EducaTec, logré pasar mi intership en Estados Unidos y fui contratado, he estado trabajando como Desarollador Front end, Líder de equipo y Administrador de base de datos." </p>
                    <h3>Victor Sánchez </h3>
                </div>
            </div>
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
                        <a href="Nosotros.jsp">¿Quienes somos?</a><br>
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
                        <a href="formulario.jsp">Formulario</a>
                    </div>
                </div>
            </div>

            <br>

            <hr>
            <p>&copy; Todos los Derechos Reservados 2022</p>
        </footer>
    </body>
</html>
