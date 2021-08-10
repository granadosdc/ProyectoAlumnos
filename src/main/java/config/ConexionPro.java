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
public class ConexionPro {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConnection(){
        Connection conexion = null;
    try{
        Class.forName(driver);
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","Veronica","123456");
    
    }catch(ClassNotFoundException | SQLException e){
        System.out.println(e.toString());
    }
    return conexion;
    }
}
