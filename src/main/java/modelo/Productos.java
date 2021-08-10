
package modelo;

public class Productos {
    private int id;
    private String prod;
    private String descripción;
    private Float Precio;
    
    public Productos(int id, String producto, String descripción, Float Precio){
        this.id=id;
        this.prod=prod;
        this.descripción=descripción;
        this.Precio=Precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String producto) {
        this.prod = prod;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setPrecio(Float Precio) {
        this.Precio = Precio;
    }
}
