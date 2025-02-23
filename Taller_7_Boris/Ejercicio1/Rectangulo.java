package TALLERES_POO_BORIS.Taller_7_Boris.Ejercicio1;

public class Rectangulo extends Figura{
    double altura;
    double ancho;

    public Rectangulo(double altura, double ancho){
        this.altura = altura;
        this.ancho = ancho;
    }
    
    @Override
    public double Calcular_area(){
        double area = altura*ancho;
        return area;
    }
    public void Mostrar_area(){
        System.out.println("El area de su rectangulo es: " + Calcular_area() + " cm^2");
    }
}
