package TALLERES_POO_BORIS.Taller_15_Boris.Ejercicio3;

public class Camion implements Conduccion, CargaMercancia {
    @Override
    public void conducir() {
        System.out.println("El camión está en movimiento.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("El camión está cargando mercancía.");
    }
}