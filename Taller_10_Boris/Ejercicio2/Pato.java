package TALLERES_POO_BORIS.Taller_10_Boris.Ejercicio2;

public class Pato implements Nadador, Volador{
    @Override
    public void nadar(){
        System.out.println("El pato puede nadar.");
    }
    public void volar(){
        System.out.println("El pato puede volar.");
    }
}
