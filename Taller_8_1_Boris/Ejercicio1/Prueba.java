package TALLERES_POO_BORIS.Taller_8_1_Boris.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", 90, 4);
        Vehiculo vehiculo = new Vehiculo("Por defecto", 0);
        vehiculo.Mostrar_Detalles();
        coche.Mostrar_Detalles();
    }
}
