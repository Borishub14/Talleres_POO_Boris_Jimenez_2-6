package TALLERES_POO_BORIS.Taller_4_1_Boris.Ejercicio2;

public class Coche {
    private String Marca;
    private String Modelo;
    private double VelocidadMaxima;

    public Coche(String Marca, String Modelo, double VelocidadMaxima){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.VelocidadMaxima = VelocidadMaxima;
    }

    public double getVelocidad(){
        return VelocidadMaxima;
    }

    public String getModelo(){
        return Modelo;
    }

    public String getMarca(){
        return Marca;
    }
    
    public void setVelocidad(double Incremento){
        if(Incremento<=0){
            System.out.println("La velocidad debe ser positiva.");
        }else{
            this.VelocidadMaxima += Incremento;
        }
    }
}
