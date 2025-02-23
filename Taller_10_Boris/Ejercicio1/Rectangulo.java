package TALLERES_POO_BORIS.Taller_10_Boris.Ejercicio1;

import java.util.Scanner;

public class Rectangulo extends Figura{
    private double ancho, largo;
    Scanner leer = new Scanner(System.in);
    public Rectangulo(){
        set_ancho();
        set_largo();
    }

    public void set_ancho(){ 
        System.out.print("Ingrese el ancho del rectangulo: ");
        this.ancho = leer.nextDouble();
    }
    public void set_largo(){
        System.out.print("Ingrese el largo del rectangulo: ");
        this.largo = leer.nextDouble();
    }
    @Override
    public void calcularArea(){
        System.out.println("El area de su rectangulo es: " + (ancho*largo) + " cm^2");
    }
}
