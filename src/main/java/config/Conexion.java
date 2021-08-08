/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.*;
/**
 *
 * @author cielo
 */
public class Conexion {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConnection() {
        Connection conexion = null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/codoacodo","Veronica","123456");
            /* Aqui te falta retornar la conexion */
        /*    return conexion;*/
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
        }
        return conexion;   
    }
    public static void main (String[]args) throws SQLException{
        System.out.println("Hola");
        Connection con = null;
        Conexion cn = new Conexion();
        con = cn.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM alumnos");
        rs = ps.executeQuery();
        
        while(rs.next()){
        int id = rs.getInt("id");
        String Nombre = rs.getString("Nombre");
        String Apellido = rs.getString("Apellido");
        String Email = rs.getString("Email");
            System.out.println("id: "+id+" Nombre: "+Nombre+" Apellido: "+Apellido+" Email: "+Email);
        
    }
    }
}
