package TALLERES_POO_BORIS.Taller_3_2_Boris.Sobreescribir_vehiculo;

public class Prueba_vehiculo_polimorfismo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bicicleta = new Bicicleta();

        vehiculo.Moverse();
        bicicleta.Moverse();
    }
}
