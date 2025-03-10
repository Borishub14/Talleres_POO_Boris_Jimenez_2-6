package TALLERES_POO_BORIS.Taller_12_Boris.Ejercicio2;

public class ProductoPrecio {
    public double calcularPrecioConImpuesto(Producto producto, double iva) {
        return producto.getPrecio() + (producto.getPrecio() * iva);
    }
}
