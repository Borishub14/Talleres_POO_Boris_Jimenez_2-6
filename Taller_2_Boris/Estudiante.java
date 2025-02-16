package TALLERES_POO_BORIS.Taller_2_Boris;

public class Estudiante {
    String Nombre;
    int Edad;

    public Estudiante(){
        this("Oracio", 24);
    }

    public Estudiante(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    /*Si por ejemplo definieramos el metodo mostrar como static:
    public  static void Mostrar(){
        System.out.print("Nombre del estudiante: " + this.Nombre + "\n" + "Edad:" + this.Edad);
    }
    no podriamos acceder a los valores de los atributos de la clase que se asignaron en el constructor por defecto.
    */
    public void Mostrar(){
        System.out.print("Nombre del estudiante: " + this.Nombre + "\n" + "Edad:" + this.Edad);
    }

}
