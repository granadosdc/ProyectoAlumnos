
package modelo;

import config.ConexionPro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO {
    Connection conexion;
    
    public ProductosDAO(){
        ConexionPro con =new ConexionPro();
        conexion = con.getConnection(); 
        
    }
    
    public List<Productos> ListarProductos(){
        PreparedStatement ps;
        ResultSet rs;
        List<Productos> Lista = new ArrayList<>();
        try{
            ps = conexion.prepareStatement("SELECT id, prod, descripción, Precio FROM productos");
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String prod = rs.getString("prod");
                String descripción = rs.getString("descripción");
                Float Precio = rs.getFloat("Precio");
                
                Productos productos = new Productos(id, prod, descripción, Precio);
                Lista.add(productos);
            }
            return Lista;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
    
    public Productos mostrarProducto(int _id){
        PreparedStatement ps;
        ResultSet rs;
        Productos producto = null;
         try{
            ps = conexion.prepareStatement("SELECT id, prod, descripción, Precio FROM productos WHERE id=?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String prod = rs.getString("prod");
                String descripción = rs.getString("descripción");
                Float Precio = rs.getFloat("Precio");
                
                producto = new Productos(id, prod, descripción, Precio);
            }
            return producto;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        }
    public boolean insertProductos(Productos producto){
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("INSERT INTO productos(prod, descripción, Precio) VALUES (?,?,?)");
            ps.setString(1,producto.getProd());
            ps.setString(2,producto.getDescripción());
            ps.setFloat(3,producto.getPrecio());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
    public boolean actualizarProducto(Productos producto){
      PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("UPDATE productos SET prod=?, descripción=?, Precio=? WHERE id=?");
            ps.setString(1,producto.getProd());
            ps.setString(2,producto.getDescripción());
            ps.setFloat(3,producto.getPrecio());
            ps.setInt(4,producto.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
    public boolean eliminarProducto(int _id){
      PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("DELETE FROM productos WHERE id=?");
            ps.setInt(1, _id);
            ps.execute();
            
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
    }
    }
}