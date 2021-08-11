package config;
import java.sql.*;

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
    public static void main (String[] args) throws SQLException{
    Connection conexion = null;
    ConexionPro con = new ConexionPro();
    conexion = con.getConnection();
    PreparedStatement ps;
    ResultSet rs;
        ps = conexion.prepareStatement("SELECT * FROM productos");
        rs = ps.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");
            String prod = rs.getString("prod");
            String descripción = rs.getString("descripción");
            Float Precio = rs.getFloat("Precio");
            System.out.println("Id: "+ id +" Productos: "+ prod +"Descripción: "+ descripción + "Precio: "+ Precio);
        }
    
    }
}
