package TALLERES_POO_BORIS.Taller_9_Boris.Ejercicio1;

public class Persona implements Hablador, Trabajador{
    String Nombre,habla,trabaja;
    public Persona(String Nombre, String habla, String trabaja){
        this.Nombre = Nombre;
        this.habla = habla;
        this.trabaja = trabaja;
    }
    @Override
    public void hablar(){
        System.out.println(Nombre + " Habla?: " + habla);
    }
    public void trabajar(){
        System.out.println(Nombre + " Trabaja?: " + trabaja);
    }
}
