package TALLERES_POO_BORIS.Taller_10_Boris.Ejercicio1;

import java.util.Scanner;

public class Triangulo extends Figura{
    double base, altura;
    Scanner leer = new Scanner(System.in);

    public Triangulo(){
        set_altura();
        set_base();
    }

    public void set_base(){
        System.out.print("Ingrese la base de su triangulo: ");
        this.base = leer.nextDouble();
    }
    public void set_altura(){
        System.out.print("Ingrese la altura de su triangulo: ");
        this.altura = leer.nextDouble();
    }
    @Override
    public void calcularArea(){
        System.out.println("El area de su triangulo es: " + (altura*base)/2 + " cm^2");
    }
}
