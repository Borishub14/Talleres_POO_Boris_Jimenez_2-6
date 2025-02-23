package TALLERES_POO_BORIS.Taller_8_1_Boris.Ejercicio1;

public class Coche extends Vehiculo{
    int Num_puertas;

    public Coche(String marca, double VelocidadMaxima, int Num_puertas){
        super(marca, VelocidadMaxima);
        this.Num_puertas = Num_puertas;
    }

    @Override
    public void Mostrar_Detalles(){
        super.Mostrar_Detalles();
        System.out.println("Numero de puertas: " + Num_puertas);
    }
}
