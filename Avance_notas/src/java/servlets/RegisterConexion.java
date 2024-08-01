
package servlets;

import acceso.AccesoDatos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterConexion", urlPatterns = {"/RegisterConexion"})
public class RegisterConexion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            
       
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try (PrintWriter out = response.getWriter()){
            //RECUPERA VALORES DEL FORMULARIO CLIENTE
            AccesoDatos acc = new AccesoDatos();
            String nombre = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            String usuario = request.getParameter("usuario");
            String contra = request.getParameter("contra");
            boolean registro = acc.registrarUsu(nombre, correo, usuario, contra);
            //BUSCAR EN LA BASE DE DATOS MYSQL
            AccesoDatos ad = new AccesoDatos();
            //SI SON VÁLIDAS LAS CREDENCIALES
            if(registro==true){
                out.println("El usuario se ha registrado correctamente");
                out.print("location='index.jsp'");
            }else{
                out.println("El usuario no se ha registradp");
                out.print("location='index.jsp'");
            }
            out.println("<a href=index.jsp>Ir a index </a>");
        }catch(Exception ex){
          ex.getMessage();
        }
    }

  

}
