package ar.edu.frc.milexamen6;

public class Computadora {
    
    private int id;
    private String nombre;
    private String modelo;
    private int precio;
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Computadora(int id,String nombre , String modelo,int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.modelo = modelo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
