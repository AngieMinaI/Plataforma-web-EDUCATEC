
package servlets;

import acceso.AccesoDatos;
import clases.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddCurso", urlPatterns = {"/AddCurso"})
public class AddCurso extends HttpServlet {

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
            Curso c= new Curso();
            AccesoDatos ad = new AccesoDatos();
            c.setCod(request.getParameter("txtCod"));
            c.setNome(request.getParameter("txtNom"));
            c.setDuracion(request.getParameter("txtDur"));
            c.setCat(request.getParameter("txtCat"));
            ad.AgregarCurso(c.getCod(), c.getNome(), c.getDuracion(), c.getCat());
            // SI SON VALIDAS LAS CREDENCIALES
            out.println("Curso Agregado correctamente<br>");
            out.println("<br><a href= ListarCurso.jsp> Ver lista de Cursos </a>");
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
