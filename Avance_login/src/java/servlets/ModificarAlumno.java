
package servlets;
import clases.*;
import acceso.AccesoDatos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ModificarAlumno", urlPatterns = {"/ModificarAlumno"})
public class ModificarAlumno extends HttpServlet {
    
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
            Alumno al= new Alumno();
            AccesoDatos ad = new AccesoDatos();
            //RECUPERA VALOREAS DE FORMULARIO
            al.setCoda(request.getParameter("codIni"));
            al.setNombre(request.getParameter("txtNom"));
            al.setApeliido(request.getParameter("txtApe"));
            al.setCorreo(request.getParameter("txtEmail"));
            /*String codIni=request.getParameter("codIni");
            String id = request.getParameter("txtCod");
            String nome = request.getParameter("txtApe");
            String dur = request.getParameter("txtDur");
            String cat = request.getParameter("txtCat");*/
            // BUSCAR EN LA BASE DE DATOS MYSQL
            ad.modificaAlumno(al);
            // SI SON VALIDAS LAS CREDENCIALES
            out.println("Alumno modificado correctamente<br>");
            out.println("<br><a href= RegAlumno.jsp> Registrar Alumno </a>");
            out.println("<br><a href= ListarAlumno.jsp> Ver lista de Alumnos </a>");
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
