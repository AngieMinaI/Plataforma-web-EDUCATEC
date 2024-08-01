
package servlets;

import acceso.AccesoDatos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LogConexion", urlPatterns = {"/LogConexion"})
public class LogConexion2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try(PrintWriter out = response.getWriter()){
            //RECUPERA VALOREAS DE FORMULARIO
            String nom = request.getParameter("txtNom");
            String pass = request.getParameter("txtPass");
            // BUSCAR EN LA BASE DE DATOS MYSQL
            AccesoDatos ad = new AccesoDatos();
            int res = ad.BuscarU(nom, pass);
            // SI SON VALIDAS LAS CREDENCIALES
            if(res == 1){
                request.getRequestDispatcher("GestionCurso.jsp").forward(request, response);
                /*out.println("Bienvenido");
                out.println("<a href= cursos.jsp> Registrar cursos </a>");
                out.println("<a href= ListarCurso.jsp> Ver cursos </a>");*/
            }else{
                out.println("Incorrecto");
            }
            //out.println("<br><a href= index.jsp> Ir a index </a>");
        }catch(Exception ex){
            ex.getMessage();
        }
    }
}
