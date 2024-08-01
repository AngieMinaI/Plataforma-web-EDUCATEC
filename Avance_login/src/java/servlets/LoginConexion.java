package servlets;

import acceso.AccesoDatos;
import static java.awt.SystemColor.window;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet(name = "LoginConexion", urlPatterns = {"/LoginConexion"})
public class LoginConexion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            //RECUPERA VALORES DEL FORMULARIO CLIENTE Y EMPLEADO
            String nom = request.getParameter("usu");
            String clave = request.getParameter("contra");
            //BUSCAR EN LA BASE DE DATOS MYSQL
            AccesoDatos ad = new AccesoDatos();
            int resU = ad.BuscarU(nom, clave);
            int resE = ad.BuscarE(nom, clave);
            //SI SON VÁLIDAS LAS CREDENCIALES
            if (resU == 1) {
                response.sendRedirect("index.jsp");
            } else if (resE == 1) {
                response.sendRedirect("GestionCurso.jsp");
            } else {
                out.print("<html><head></head><body onload=\"alert('Usuario NO Identificado'); window.location='inicioSesion.jsp' \"></body></html>");
            }

        } catch (Exception ex) {
            ex.getMessage();

        }
    }
}
