package TALLERES_POO_BORIS.Taller_7_Boris.Ejercicio1;
public class Circulo extends Figura{
    double radio;


    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double Calcular_area(){
        double area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    public void Mostrar_area(){
        System.out.println("El area de su circulo es: " + Calcular_area() + "cm^2");
    }
}
