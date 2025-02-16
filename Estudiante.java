public class Estudiante{
    String Nombre;
    String Edad;
    String Curso;

    public Estudiante(){
        this.Nombre = "ninguno";
        this.Edad = "ninguna";
        this.Curso = "ninguno";
    }

    public Estudiante(String Nombre, String Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public Estudiante(String Nombre, String Edad, String Curso){
        this(Nombre, Edad);
        this.Curso = Curso;
    }

    public void Mostrar(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Curso: " + Curso);
    }
}