/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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

/**
 *
 * @author SCERON
 */
@WebServlet(name = "AddStudent", urlPatterns = {"/AddStudent"})
public class AddStudent extends HttpServlet {

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
            Alumno al= new Alumno();
            AccesoDatos ad = new AccesoDatos();
            al.setCoda(request.getParameter("txtCod"));
            al.setNombre(request.getParameter("txtNom"));
            al.setApeliido(request.getParameter("txtApe"));
            al.setCorreo(request.getParameter("txtEmail"));
            ad.AgregarAlumno(al);
            // SI SON VALIDAS LAS CREDENCIALES
            out.println("Alumno Agregado correctamente<br>");
            out.println("<br><a href= ListarAlumno.jsp> Ver lista de Alumno </a>");
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
