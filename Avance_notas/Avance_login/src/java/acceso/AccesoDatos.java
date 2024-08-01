
package acceso;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccesoDatos extends Conexion {
    //OBTENER UNA CONEXION
    Connection cnn = Connection();
    //METODO PARA VALIDAD CREDENCIALES
    public int BuscarU(String n, String c){
        //FLAG r: 0-> No valido  1->valido
        int r=0;
        try{//PARA GESTIONAR INSTRUCCIONES SQL
            PreparedStatement st=null;
            ResultSet rs = null;
            //ENVIAR INSTRUCCION DE CONSULTA 
            st=cnn.prepareStatement("SELECT usuario,contra FROM usuarios WHERE usuario=? AND contra=?");
            st.setString(1, n);
            st.setString(2, c);
            //EJECUTAR
            rs=st.executeQuery();
            //SI HAY REGISTRO
            if(rs.next()==true){
                r=1;
            }
        }catch(Exception ex){
            ex.getMessage();
        }
        return r;
    }
    
    public int BuscarE(String n, String c){
        //FLAG r: 0-> No valido  1->valido
        int r=0;
        try{//PARA GESTIONAR INSTRUCCIONES SQL
            PreparedStatement st=null;
            ResultSet rs = null;
            //ENVIAR INSTRUCCION DE CONSULTA 
            st=cnn.prepareStatement("SELECT usuario,contra FROM empleado WHERE usuario=? AND contra=?");
            st.setString(1, n);
            st.setString(2, c);
            //EJECUTAR
            rs=st.executeQuery();
            //SI HAY REGISTRO
            if(rs.next()==true){
                r=1;
            }
        }catch(Exception ex){
            ex.getMessage();
        }
        return r;
    }
    
    
    public boolean registrarUsu(String nombre, String correo, String usuario, String contra){
        boolean registro = false;
        int r=0;
        try{
            PreparedStatement st=null;
            String consulta="INSERT INTO usuarios (nombre,correo,usuario,contra) VALUES (?,?,?,?);";
            st = cnn.prepareStatement(consulta);
            st.setString(1, nombre);
            st.setString(2, correo);
            st.setString(3, usuario);
            st.setString(4, contra);
            st.execute();
            //SI HAY REGISTRO
            return true;
        }catch(Exception ex){
            ex.getMessage();
            return false;
        }
    }
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

