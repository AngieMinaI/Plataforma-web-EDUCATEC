<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>

        <link rel="stylesheet" href="main.css"/>
        <link rel="stylesheet" type="text/css" href="formulario.css">
    </head>
    <header class="cabecera">
        <a href="index.html" ><img id="logo" src="logo.jpeg" alt=""/></a>
        <nav class="navegacion">
            <a href="Nosotros.html" >Nosotros</a>
            <a href="cursos.html">Cursos</a>
            <a href="inicioSesion.html">Iniciar sesión</a>
            <a href="registroSesion.html">Registrarse</a>
        </nav>
    </header>
    <body>
        <h1 class="titulo">Contáctanos</h1>
        <div class="general">
            <form  name="frmAcc" method="POST" action="Conexion2" >
                <br>
                <h2 class="datos">Si tienes alguna duda, comentario o sugerencia , puedes contactarnos y nos comunicaremos contigo lo antes posible</h2>
                <br>
                <div class="marco">
                    <div class="efecto">
                        <div class="contact-form">
                            <div class="fila">
                                <div class="celda">
                                    <p>
                                        <label for="txtNom">Nombres</label>
                                        <input type="text" name="txtNom" required="">
                                    </p>
                                </div>
                                <div class="celda">
                                    <p>
                                        <label for="txtApe">Apellidos</label>
                                        <input type="text" name="txtApe"  >
                                    </p>
                                </div>
                            </div>
                            <div class="fila">
                                <div class="celda">
                                    <p>
                                        <label for="txtNoDoc">Número de Documento de Identidad</label>
                                        <input type="text" name="txtNoDoc" required  >
                                    </p>
                                </div>
                                <div class="celda">
                                    <p>
                                        <label for="txtDdom">Dirección Domiciliaria</label>
                                        <input type="text" name="txtDdom" required >
                                    </p>
                                </div>
                            </div>
                            <div class="fila">
                                <div class="celda">
                                    <p>
                                        <label for="txtNuTelf">Número telefonico</label>
                                        <input type="text" name="txtNuTelf" required="" >
                                    </p>
                                </div>
                                <div class="celda">
                                    <p>
                                        <label for="txtCor">Correo electronico</label>
                                        <input type="email" name="txtCor"required="" >
                                    </p>
                                </div>
                            </div>
                            <div class="fila">
                                <div class="celda">
                                    <p>
                                        <label for="txtMen">Mensaje</label>
                                        <input type="text" name="txtMen"required="" >
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <p>
                    <input type="submit" id="prioridad3" name="btnEnv" value="Aceptar" >
                </p>
        </div>
    </form>
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
