
package servlets_more;

import acceso.AccesoDatos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EliminarProf extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
            ad.EliminarProf(codIni);
            // SI SON VALIDAS LAS CREDENCIALES
            out.println("Curso eliminado correctamente<br>");
            out.println("<br><a href= AgregarProf.jsp> Registrar Profesor </a>");
            out.println("<br><a href= ListarProf.jsp> Ver lista de Profesor </a>");
            out.println("<br><a href= index.jsp> Salir sesion </a>");
        }catch(Exception ex){
            ex.getMessage();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
