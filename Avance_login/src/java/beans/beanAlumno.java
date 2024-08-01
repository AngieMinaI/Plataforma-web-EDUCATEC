/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;
import conexion.Conexion;
import clases.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class beanAlumno extends Conexion{
    private Alumno al= new Alumno();
     Connection cnn = Connection();
    public beanAlumno() {
    }

    public Alumno getAl() {
        return al;
    }

    public void setAl(Alumno al) {
        this.al = al;
    }
    
    public String AgregarAlumno(Alumno a){
        try{
            String sql="insert into alumno(IDalumno,nombres,apellidos,correo) VALUES(?,?,?,?);";
            PreparedStatement st=cnn.prepareStatement(sql);
            //se debe relacionar cada ? con su dato correspondiente
            st.setString(1, a.getCoda());
            st.setString(2, a.getNombre());
            st.setString(3, a.getApeliido());
            st.setString(4, a.getCorreo());
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "ListarAlumno.jsp";
    }
}
