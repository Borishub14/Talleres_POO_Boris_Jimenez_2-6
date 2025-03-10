package TALLERES_POO_BORIS.Taller_16_Boris.Ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre) {
        System.out.println("Archivo '" + nombre + "' subido a la nube.");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Recuperando archivo '" + nombre + "' desde la nube.";
    }
}