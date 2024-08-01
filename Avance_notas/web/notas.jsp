<%-- 
    Document   : notas
    Created on : 2022/12/01, 22:35:02
    Author     : RX 5500 XT 8GB
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String usu = (String)session.getAttribute("usr");
            out.println(" <h1>Usuario logueado: " +usu+"</h1>");
        %>
        <table class="table" style="border:1px solid black;margin-left:auto;margin-right:auto;text-align: center;">
            <thead>
                <tr>
                    <th scope="col">ㅤID cursoㅤ</th>
                    <th scope="col">ㅤExamen Parcialㅤ</th>
                    <th scope="col">ㅤExamen Finalㅤ</th>
                </tr>
                 <%
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/cursosweb";
                    String username="root";
                    String password="";
                    String query="select IDCurso, ExaParcial, ExaFinal from notas where IDalumno='"+usu+"'";
                    Connection conn=DriverManager.getConnection(url, username, password);
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(query);
                    while(rs.next())
                {
                %>
                       <tr>
                           <td><%out.println(rs.getString("IDCurso")); %></td>
                           <td><%out.println(rs.getString("ExaParcial")); %></td>
                           <td><%out.println(rs.getString("ExaFinal")); %></td>
                       </tr>
        <%
       }
        %>
        </table>
        <%
        rs.close();
        stmt.close();
        conn.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>
    </body>
</html>
