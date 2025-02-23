package TALLERES_POO_BORIS.Taller_8_2_Boris.Ejercicio2;

import java.util.Scanner;

public class Animal {
    String especie;
    Scanner leer = new Scanner(System.in);

    public Animal(String especie){
        this.especie = especie;
    }

    public void Mostrar_especie(){
        System.out.println("La especie de este animal es: " + especie);
    }
}
