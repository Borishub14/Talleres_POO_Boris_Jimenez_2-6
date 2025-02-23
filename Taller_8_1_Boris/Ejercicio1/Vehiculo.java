package TALLERES_POO_BORIS.Taller_8_1_Boris.Ejercicio1;

public class Vehiculo {
    String marca;
    double VelocidadMaxima;

    public Vehiculo(String marca, double VelocidadMaxima){
        this.marca = marca;
        this.VelocidadMaxima = VelocidadMaxima;
    }

    public void Mostrar_Detalles(){
        System.out.println("Detalles del vehiculo." + "\n"
        + "Marca: " + marca + "\n" + "Velocidad maxima: "
        + VelocidadMaxima + " km/h");
    }
}
