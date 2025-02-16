package TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio2;

public class Moto extends Vehiculo{
    String Cilindrada;

    public Moto(String Tipo, String Marca, String Cilindrada){
        super(Tipo, Marca);
        this.Cilindrada = Cilindrada;
    }

    @Override
    public void MostrarInfo(){
        System.out.println("Tipo: " + Tipo + "\n" + "Marca: " + Marca + "\n" + "Cilindrada: " + Cilindrada + "\n");
    }
}
