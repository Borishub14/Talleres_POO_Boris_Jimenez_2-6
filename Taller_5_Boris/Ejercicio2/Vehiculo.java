package TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio2;

public class Vehiculo {
    protected String Tipo;
    protected String Marca; 

    public Vehiculo(String Tipo, String Marca){
        this.Tipo = Tipo;
        this.Marca = Marca;
    }

    public void MostrarInfo(){
        System.out.println("Tipo: " + Tipo + "\n" + "Marca: " + Marca + "\n");
    }
}