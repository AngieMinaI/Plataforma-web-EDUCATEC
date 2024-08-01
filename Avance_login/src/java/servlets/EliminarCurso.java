
package servlets;

import acceso.AccesoDatos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EliminarCurso", urlPatterns = {"/EliminarCurso"})
public class EliminarCurso extends HttpServlet {

    
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
            String codIni=request.getParameter("codIni");
            // BUSCAR EN LA BASE DE DATOS MYSQL
            AccesoDatos ad = new AccesoDatos();
            ad.EliminarCurso(codIni);
            // SI SON VALIDAS LAS CREDENCIALES
            out.println("Curso eliminado correctamente<br>");
            out.println("<br><a href= AgregarCurso.jsp> Registrar Curso </a>");
            out.println("<br><a href= ListarCurso.jsp> Ver lista de Curso </a>");
            out.println("<br><a href= index.jsp> Salir sesion </a>");
        }catch(Exception ex){
            ex.getMessage();
        }
    }


}
