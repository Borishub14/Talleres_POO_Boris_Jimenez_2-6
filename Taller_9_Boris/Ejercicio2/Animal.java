package TALLERES_POO_BORIS.Taller_9_Boris.Ejercicio2;

public class Animal implements Volador, Nadador{
    String especie, vuela, nada;

    public Animal(String especie, String vuela, String nada){
        this.especie = especie;
        this.vuela = vuela;
        this.nada = nada;
    }
    
    @Override
    public void volar(){
        System.out.println("El animal '"+ especie + "' " + vuela + " nada.");
    }
    public void nadar(){
        System.out.println("El animal '"+ especie + "' " + nada + " vuela.");
    }
}