
package servlets;

import access2.AccesoDatos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Conexion2", urlPatterns = {"/Conexion2"})
public class Conexion2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
             AccesoDatos ad= new AccesoDatos();
            String n= request.getParameter("txtNom");
               String a= request.getParameter("txtApe");
            String nd= request.getParameter("txtNoDoc");
             String dd= request.getParameter("txtDdom");  
             String t= request.getParameter("txtNuTelf");
             String c= request.getParameter("txtCor");
               String m= request.getParameter("txtMen");
               
              
             
               
               
               
               boolean guardar = ad.GuardarReclamo(n, a,nd, dd, t, c,m);
                  AccesoDatos ac= new AccesoDatos();
               if (guardar==true) {
                out.println("Guardado");
                
                 
            }else{
                   out.println("NO GUARDADO");
               }
               out.println("\n<a href=index.jsp>Ir a index </a>");
            
        }catch(Exception ex){
            ex.getMessage();
        }
    }

    

}
