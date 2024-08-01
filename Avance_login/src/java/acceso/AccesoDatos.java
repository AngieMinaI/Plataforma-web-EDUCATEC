
package acceso;
import clases.*;
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
            st=cnn.prepareStatement("SELECT usuario,contra FROM usuario WHERE usuario=? AND contra=?");
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
    
    public void AgregarAlumno(Alumno a){
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
    }
    public List<Alumno> lisAlumno(){
         List<Alumno> lis=new ArrayList();
        try{
            String sql="Select IDalumno,nombres,apellidos,correo from alumno";
            PreparedStatement st=cnn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                // leer fila xfila
                Alumno a=new Alumno();
                a.setCoda(rs.getString(1));
                a.setNombre(rs.getString(2));
                a.setApeliido(rs.getString(3));
                a.setCorreo(rs.getString(4));
                lis.add(a);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cnn.close();}catch(Exception e2){}
        }
        return lis;
    }
    public void modificaAlumno(Alumno a){
        try{
            String sql="update alumno set nombres=?, apellidos=?, correo=? where IDalumno=?";
            PreparedStatement st=cnn.prepareStatement(sql);
            //se debe relacionar cada ? con su dato correspondiente
            st.setString(1, a.getNombre());
            st.setString(2, a.getApeliido());
            st.setString(3, a.getCorreo());
            st.setString(4, a.getCoda());
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void borraAlumno(String id){
        try{
            String sql="delete from alumno where IDalumno=?";
            PreparedStatement st=cnn.prepareStatement(sql);
            //se debe relacionar cada ? con su dato correspondiente
           
            st.setString(1, id);
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public Alumno buscaAl(String id){
        Alumno a=null;
        try{
            String sql="Select IDalumno,nombres,apellidos,correo from alumno where IDalumno=?";
            PreparedStatement st=cnn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next()){// leer fila siginifca que existe el registro
                
                a=new Alumno();
                a.setCoda(rs.getString(1));
                a.setNombre(rs.getString(2));
                a.setApeliido(rs.getString(3));
                a.setCorreo(rs.getString(4));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cnn.close();}catch(Exception e2){}
        }
        return a;
    }
    public Curso buscaCurso(String id){
         Curso c=null;
        try{
            String sql="select IDCurso,Nombre, Duración,Categoria from curso where IDCurso=?";
            PreparedStatement st=cnn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next()){// leer fila siginifca que existe el registro
                
                c=new Curso();
                c.setCod(rs.getString(1));
                c.setNome(rs.getString(2));
                c.setDuracion(rs.getString(3));
                c.setCat(rs.getString(4));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cnn.close();}catch(Exception e2){}
        }
        return c;
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
            String consulta="INSERT INTO usuario (nombre,correo,usuario,contra) VALUES (?,?,?,?);";
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
    public void AgregarCurso(String id, String nome, String dura,String cat){
        
         try{
            String sql="insert into curso(IDCurso,Nombre, Duración, Categoria) VALUES(?,?,?,?);";
            PreparedStatement st=cnn.prepareStatement(sql);
            //se debe relacionar cada ? con su dato correspondiente
            st.setString(1, id);
            st.setString(2, nome);
            st.setString(3, dura);
            st.setString(4, cat);
            
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
    public void anulacionCurso(String id) {
        
        try{
            String sql="delete from curso where IDCurso=?";
            PreparedStatement st=cnn.prepareStatement(sql);
            //se debe relacionar cada ? con su dato correspondiente
           
            st.setString(1, id);
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void modificaCurso(Curso c) {
        try{
            String sql="update curso set Nombre=?, Duración=?, Categoria=? where IDCurso=?";
            PreparedStatement st=cnn.prepareStatement(sql);
            //se debe relacionar cada ? con su dato correspondiente
            st.setString(1, c.getNome());
            st.setString(2, c.getDuracion());
            st.setString(3, c.getCat());
            st.setString(6, c.getCod());
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
    public void AgregarProf(String cod, String ape, String nom){
        
         try{
            String sql="insert into profesores(codProf,Apellido,Nombre) VALUES(?,?,?);";
            PreparedStatement st=cnn.prepareStatement(sql);
            //se debe relacionar cada ? con su dato correspondiente
            st.setString(1, cod);
            st.setString(2, ape);
            st.setString(3, nom);
            
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void ModificarProf(String codIni, String cod, String ape, String nom){
        
         try{
            String sql="UPDATE profesores SET codProf = ?, Apellido = ?, Nombre = ? WHERE codProf = ?";
            PreparedStatement st=cnn.prepareStatement(sql);
            st.setString(1, cod);
            st.setString(2, ape);
            st.setString(3, nom);
            st.setString(4, codIni);
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void EliminarProf(String codIni){
        
         try{
            String sql="DELETE FROM profesores WHERE codProf = ? ";
            PreparedStatement st=cnn.prepareStatement(sql);
            st.setString(1, codIni);
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public List<Profesores> listarProf(){
        List<Profesores> lis= new ArrayList();
        try{
            String sql="select codProf,Apellido,Nombre from profesores";
            PreparedStatement st=cnn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while (rs.next()) {
                Profesores pro=new Profesores();
                pro.setCod(rs.getString(1));
                pro.setApe(rs.getString(2));
                pro.setNom(rs.getString(3));
                lis.add(pro);
            }
 
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cnn.close();}catch(Exception e2){}
        }
        return lis;
    }
    public void AgregarNotas(Notas n){
        try{
            String sql="insert into notas(IDalumno,IDcurso,exaParcial,exaFinal) VALUES(?,?,?,?);";
            PreparedStatement st=cnn.prepareStatement(sql);
            //se debe relacionar cada ? con su dato correspondiente
            st.setString(1, n.getA().getCoda());
            st.setString(2, n.getC().getCod());
            st.setDouble(3, n.getExaParcial());
            st.setDouble(4, n.getExaFinal());
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public List<Notas> lisNotas(){
        List<Notas> lis= new ArrayList();
        try{
            String sql="select IDalumno,IDcurso,exaParcial,exaFinal from notas";
            PreparedStatement st=cnn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while (rs.next()) {
                Notas n=new Notas();
                n.setA(buscaAl(rs.getString(1)));
                n.setC(buscaCurso(rs.getString(2)));
                n.setExaParcial(rs.getDouble(3));
                n.setExaFinal(rs.getDouble(4));
                lis.add(n);
            }
 
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cnn.close();}catch(Exception e2){}
        }
        return lis;
    }
    
}
