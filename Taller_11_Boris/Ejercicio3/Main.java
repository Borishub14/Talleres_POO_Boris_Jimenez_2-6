package TALLERES_POO_BORIS.Taller_11_Boris.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Estudiante();
        Persona persona3 = new Profesor();
        Persona persona4 = new Secretario();

        persona1.presentarse();
        persona2.presentarse();
        persona3.presentarse();
        persona4.presentarse();

        // Intento de invocar un metodo especifico de Estudiante usando una referencia de Persona.

        persona2.estudiar(); //Ocasiona Error al compilar
    }
}
