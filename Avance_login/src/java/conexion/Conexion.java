
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static java.sql.Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //METODO PARA CREAR OBJETO CONEXION MYSQL
    public Connection Connection(){
        Connection cn=null;
        try{
            //CARGAR EL DRIVER
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //CREA OBJETO CONEXION
            String url="jdbc:mysql://localhost:3306/cursosweb";
            cn = (Connection) DriverManager.getConnection(url, "root", "");
        }catch(Exception ex){
            ex.getMessage();
        }
        return cn;
    }
}
