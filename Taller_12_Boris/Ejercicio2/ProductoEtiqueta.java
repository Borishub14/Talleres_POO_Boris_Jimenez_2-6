package TALLERES_POO_BORIS.Taller_12_Boris.Ejercicio2;

import java.util.UUID;

class ProductoEtiqueta {
    public void generarEtiqueta(Producto producto) {
        String etiquetaAleatoria = UUID.randomUUID().toString().substring(0, 4);
        System.out.println("Etiqueta: " + producto.getCodigo() + "-" + etiquetaAleatoria);
    }
}
