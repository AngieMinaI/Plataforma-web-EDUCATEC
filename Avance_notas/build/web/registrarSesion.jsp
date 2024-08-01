<%-- 
    Document   : registrarSesion
    Created on : 15/10/2022, 11:42:37 PM
    Author     : ABIGAIL
--%>

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
            function register() {
                //declara variables
                var nom = document.frmregister.nombre.value;
                var correo = document.frmregister.correo.value;
                var usu = document.frmregister.usu.value;
                var contra = document.frmregister.contra.value;
                //mostrar mensaje segun valores
                if (nom==="") {
                    alert("Colocar nombre completo");
                }else if(correo===""){
                    alert("Completar el correo");
                }else if(usu===""){
                    alert("Completar el nombre de usuario");
                }else if(contra===""){
                    alert("Completar la contraseña");
                }
            }
            
        </script>
       <div class="todo">
            <div class="caja_detras">
                <div class="detras_register">
                    <h3>¿No tienes una cuenta?</h3>
                    <p>Registrate para que puedas iniciar sesión</p>
                    <button id="register_se">Registrarse</button>
                </div>
                <div class="detras_login">
                    <h3>¿Ya tienes una cuenta?</h3>
                    <p>Inicia sesión para entrar en la página</p>
                    <a href="inicioSesion.jsp">
                    <button id="inicio_se" >Iniciar sesion</button>
                    </a>
                </div>
            </div>
            
            <div class="contenedor_login_register">
                <form class="form_login" method="post" action="LoginConexion">
                    <h2>Iniciar Sesión</h2>
                    <input type="text" placeholder="Usuario">
                    <input type="password" placeholder="Contraseña">
                    <button>Entrar</button>                    
                </form>
                <form class="form_register" name="frmregister" method="post" action="RegisterConexion">
                    <h2>Registrarse</h2>
                    <input type="text" name="nombre" placeholder="Nombre completo">
                    <input type="text" name="correo" placeholder="Correo electrónico">
                    <input type="text" name="usuario" placeholder="Usuario">
                    <input type="password" name="contra" placeholder="Contraseña">
                    <button onclick="register()">Registrarse</button>                    
                </form> 
            </div>
        </div>
    </body>
</html>
