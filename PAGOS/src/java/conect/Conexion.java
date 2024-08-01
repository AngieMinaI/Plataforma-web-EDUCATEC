/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author angic
 */
public class Conexion {
    // metodo para crear obj conexion mysql
    public Connection conectar(){
        Connection cn= null;
        try{
            //cargar el driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //crea obj conexion
            String url="jdbc:mysql://localhost:3306/cursosweb";
            cn = DriverManager.getConnection(url, "root","");
        }catch(Exception ex){
            ex.getMessage();
            
        }
        return cn;
    }
}
