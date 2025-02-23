package TALLERES_POO_BORIS.Taller_8_1_Boris.Ejercicio2;

public class Estudiante extends Persona{
    String Matricula;

    public Estudiante(String Nombre, short Edad, String Matricula){
        super(Nombre, Edad);
        this.Matricula = Matricula;
    }

    @Override
    public void Mostrar_detalles(){
        System.out.println("Detalles del estudiante." + "\n"
        + "Nombre: " + Nombre + "\n" + "Edad: " + Edad + "\n" +"Matricula: " + Matricula + "\n");

    }
}
