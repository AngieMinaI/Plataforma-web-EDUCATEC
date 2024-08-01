

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
        <script src="javascript.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <script>
            function entrar() {
                //declara variables
                var usu = document.frmlogin.correo.value;
                var con = document.frmlogin.contra.value;
                //mostrar mensaje segun valores
                if(usu===""){
                    alert("Colocar correo electrónico");
                }else if(con===""){
                    alert("Completar contraseña");
                }
                
            }            
        </script>
        <div class="todo">
            <div class="caja_detras">
                <div class="detras_login">
                    <h3>¿Ya tienes una cuenta?</h3>
                    <p>Inicia sesión para entrar en la página</p>
                    <button id="inicio_se">Iniciar sesion</button>
                </div>
                <div class="detras_register">
                    <h3>¿No tienes una cuenta?</h3>
                    <p>Registrate para que puedas iniciar sesión</p>
                    <a href="registrarSesion.jsp">
                        <button id="register_se">Registrarse</button>
                    </a>
                </div>
            </div>
            <div class="contenedor_login_register">
                <form class="form_register" method="post" action="RegisterConexion">
                    <h2>Registrarse</h2>
                    <input type="text" placeholder="Nombre completo">
                    <input type="text" placeholder="Correo electrónico">
                    <input type="text" placeholder="Usuario">
                    <input type="password" placeholder="Contraseña">
                    <button>Registrarse</button>                    
                </form>
                <form class="form_login" name="frmlogin" method="post" action="LoginConexion">
                    <h2>Iniciar Sesión</h2>
                    <input type="text" name="usu" placeholder="Usuario">
                    <input type="password" name="contra" placeholder="Contraseña">
                    <button onclick="entrar()">Entrar</button>                    
                </form>
            </div>
        </div>
    </body>
</html>
