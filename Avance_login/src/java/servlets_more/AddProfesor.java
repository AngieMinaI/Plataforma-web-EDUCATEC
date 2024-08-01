
package servlets_more;

import acceso.AccesoDatos;
import clases.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddProfesor extends HttpServlet {

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
            Profesores pro= new Profesores();
            AccesoDatos ad = new AccesoDatos();
            pro.setCod(request.getParameter("txtCod"));
            pro.setNom(request.getParameter("txtNom"));
            pro.setApe(request.getParameter("txtApe"));
            ad.AgregarProf(pro.getCod(), pro.getApe(), pro.getNom());
            // SI SON VALIDAS LAS CREDENCIALES
            out.println("Profesor Agregado correctamente<br>");
            out.println("<br><a href= ListarProf.jsp> Ver lista de Profesores </a>");
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
