package TALLERES_POO_BORIS.Taller_12_Boris.Ejercicio2;

public class Producto {
    private String nombre;
    private double precio;
    private String codigo;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
}
