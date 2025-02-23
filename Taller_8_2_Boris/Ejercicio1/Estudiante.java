package TALLERES_POO_BORIS.Taller_8_2_Boris.Ejercicio1;

import java.util.Scanner;

public class Estudiante extends Persona{
    private String matricula;
    Scanner leer = new Scanner(System.in);

    public Estudiante(String nombre, short edad){
        super(nombre, edad);
        set_Matricula();
    }   
    public void set_Matricula(){
        System.out.print("Ingrese la matricula del estudiante: ");
        this.matricula = leer.nextLine(); 
    }
    public String get_Matricula(){
        return this.matricula;
    }

    @Override
    public void Mostrar_detalles(){
        super.Mostrar_detalles();
        System.out.println("Matricula: " + get_Matricula() + "\n" + "Ocupacion: Estudiante");
    }
}
