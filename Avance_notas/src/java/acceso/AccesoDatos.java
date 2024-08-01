
package acceso;

import clases.Notas;
import clases.Curso;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
            st=cnn.prepareStatement("SELECT IDalumno,contra FROM alumno WHERE IDalumno=? AND contra=?");
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
    public void EliminarCurso(String codIni){
        
         try{
            String sql="DELETE FROM curso WHERE IDCurso = ? ";
            PreparedStatement st=cnn.prepareStatement(sql);
            st.setString(1, codIni);
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void ModificarCurso(String codIni, String id, String nome, String dura,String cat){
        
         try{
            String sql="UPDATE curso SET IDCurso = ?, Nombre = ?, Duración = ?, Categoria = ? WHERE IDCurso = ?";
            PreparedStatement st=cnn.prepareStatement(sql);
            st.setString(1, id);
            st.setString(2, nome);
            st.setString(3, dura);
            st.setString(4, cat);
            st.setString(5, codIni);
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public List<Curso> listarCurso(){
        List<Curso> lis= new ArrayList();
        try{
            String sql="select IDCurso,Nombre, Duración,Categoria from curso";
            PreparedStatement st=cnn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while (rs.next()) {
                Curso c=new Curso();
                c.setCod(rs.getString(1));
                c.setNome(rs.getString(2));
                c.setDuracion(rs.getString(3));
                c.setCat(rs.getString(4));
                lis.add(c);
            }
 
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cnn.close();}catch(Exception e2){}
        }
        return lis;
    }

        
}
