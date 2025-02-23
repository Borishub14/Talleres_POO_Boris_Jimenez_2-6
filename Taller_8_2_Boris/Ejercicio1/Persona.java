package TALLERES_POO_BORIS.Taller_8_2_Boris.Ejercicio1;

public class Persona {
    private String Nombre;
    private short Edad;

    public Persona(String Nombre, short Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public void Mostrar_detalles(){
        System.out.println("Detalles de la persona." + "\n"
        + "Nombre: " + Nombre + "\n" + "Edad: " + Edad);
    }
}
