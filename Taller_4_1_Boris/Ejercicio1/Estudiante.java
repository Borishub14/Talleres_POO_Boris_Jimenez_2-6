package TALLERES_POO_BORIS.Taller_4_1_Boris.Ejercicio1;

public class Estudiante {
    private String Nombre;
    private short Edad;
    private float Nota;
    
    public Estudiante(String Nombre, short Edad, float Nota){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Nota = Nota;
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public int getEdad(){
        return Edad;
    }
    public void setEdad(short Edad){
        if(Edad<=0){
            System.out.println("Edad invalida.");
        }else{
            this.Edad = Edad;
        }
    }

    public float getNota(){
        return Nota;
    }
    public void setNota(float Nota){
        if(Nota<0 || Nota>5){
            System.out.println("Nota invalida.");
        }else{
            this.Nota = Nota;
        }
    }
}
