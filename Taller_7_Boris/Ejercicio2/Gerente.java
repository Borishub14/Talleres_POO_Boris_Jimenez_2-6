package TALLERES_POO_BORIS.Taller_7_Boris.Ejercicio2;

public class Gerente extends Empleado{
    double Horas;

    public Gerente(double Horas){
        this.Horas = Horas;
    }

    @Override
    public double calcularSalario(){
        double salario = Horas*5000;
        return salario;
    }
    public void Mostrar_Detalles(){
        System.out.println("El salario de el gerente es: " + calcularSalario() + " $");
    }
}
