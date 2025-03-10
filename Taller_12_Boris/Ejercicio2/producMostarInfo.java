package TALLERES_POO_BORIS.Taller_12_Boris.Ejercicio2;

public class producMostarInfo {
    public void mostrarInformacion(Producto producto) {
        System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Código: "
                + producto.getCodigo());
    }
}
