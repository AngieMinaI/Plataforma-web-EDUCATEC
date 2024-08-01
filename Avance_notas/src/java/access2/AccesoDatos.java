package access2;

import conect.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author angic
 */
public class AccesoDatos extends Conexion {
    //obtener una conexion
    Connection cnn= conectar();
    //Generar un metodo que valide los datos o credenciales
    public boolean GuardarReclamo (String nom, String ape,String nodoc,String dir,String telf,String cor,String men){
        boolean guardar= false;
        int r=0;
        try{ //para gestionar instruccion SQL
            PreparedStatement st=null;
         
            //enviar instruccion  de consulta
            st=cnn.prepareStatement("INSERT INTO t_reclamos (nombre, apellido, doc,direccion, telefono, correo, mensaje) VALUES (?,?,?,?,?,?,?);");
            st.setString(1, nom);
            st.setString(2, ape);
              
               st.setString(3, nodoc);
                st.setString(4, dir);
                 st.setString(5, telf); 
                 st.setString(6,cor);
                 st.setString(7, men);
                 
            //si hay registro de las credencial 
            st.execute();
           return true;
            
        }catch(Exception ex){
            ex.getMessage();
        }
        return false;
    }
  
   
    
}
