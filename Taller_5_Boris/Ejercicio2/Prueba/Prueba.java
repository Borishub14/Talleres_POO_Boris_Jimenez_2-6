package TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio2.Prueba;

import TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio2.Vehiculo;
import TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio2.Moto;

public class Prueba {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Carro", "Mazda");
        Moto moto = new Moto("Moto", "Zusuki", "250");

        vehiculo.MostrarInfo();
        moto.MostrarInfo();

        System.out.println(vehiculo.tipo);
        System.out.println(moto.marca); 
        /*No se puede acceder a los atributos protected por que prueba pertenece a un paquete distinto. */
    }
}
