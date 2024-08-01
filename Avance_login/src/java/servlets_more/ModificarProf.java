
package servlets_more;

import acceso.AccesoDatos;
import clases.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModificarProf extends HttpServlet {

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
            
            AccesoDatos ad = new AccesoDatos();
            //RECUPERA VALOREAS DE FORMULARIO
            String cod = request.getParameter("codIni");
            String id = request.getParameter("txtCod");
            String ape = request.getParameter("txtApe");
            String nom = request.getParameter("txtNom");
            // BUSCAR EN LA BASE DE DATOS MYSQL
            ad.ModificarProf(cod, id, ape, nom);
            // SI SON VALIDAS LAS CREDENCIALES
            out.println("Profesor modificado correctamente<br>");
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
