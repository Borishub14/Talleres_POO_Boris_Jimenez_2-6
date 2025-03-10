package TALLERES_POO_BORIS.Taller_12_Boris.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro();

        LibroReporte libroReporte = new LibroReporte();
        VentaLibro ventaLibro = new VentaLibro();
        libroReporte.generarReporte(libro);
        ventaLibro.ventaFactura(libro, 200000);
    }
}
