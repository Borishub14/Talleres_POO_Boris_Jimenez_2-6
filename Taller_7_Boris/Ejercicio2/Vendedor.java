package TALLERES_POO_BORIS.Taller_7_Boris.Ejercicio2;

public class Vendedor extends Empleado{
    double ventas;

    public Vendedor(double ventas){
        this.ventas = ventas;
    }

    @Override
    public double calcularSalario(){
        double salario = ventas*1000;
        return salario;
    }
    public void Mostrar_Detalles(){
        System.out.println("El salario de el vendedor es: " + calcularSalario() + " $");
    }
}
