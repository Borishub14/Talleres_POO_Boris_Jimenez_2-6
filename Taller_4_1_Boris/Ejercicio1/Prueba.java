package TALLERES_POO_BORIS.Taller_4_1_Boris.Ejercicio1;
import java.util.Scanner;
public class Prueba {
    public static Scanner leer = new Scanner(System.in);
    public static Scanner leer_n = new Scanner(System.in);
    public static void main(String[] args) {
        String Nombre = "";
        short Edad = 0;
        float Nota = 0;

        Estudiante estudiante = new Estudiante(Nombre, Edad, Nota);

        System.out.print("Ingresa el nombre del estudiante: ");
        Nombre = leer.nextLine();
        estudiante.setNombre(Nombre);

        System.out.print("Ingresa la edad del estudiante: ");
        Edad = leer_n.nextShort();
        estudiante.setEdad(Edad);

        System.out.print("Ingresa la nota promedio del estudiante: ");
        Nota = leer_n.nextFloat();
        estudiante.setNota(Nota);

        System.out.println("Nombre del estudiante: " + estudiante.getNombre() + "\n"
        + "Edad del estudiante: " + estudiante.getEdad() + "\n" + "Nota promedio del estudiante: " + 
        estudiante.getNota());
    }
}
