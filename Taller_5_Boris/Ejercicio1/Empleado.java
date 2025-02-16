package TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio1;

public class Empleado {
    protected double Salario;
    protected String Nombre;

    public Empleado(double Salario, String Nombre){
        this.Salario = Salario;
        this.Nombre = Nombre;
    }

    public void MostrarInfo(){
        System.out.println("Nombre del Empleado: " + Nombre + "\n" + "Salario: " + Salario + "\n");
    }
}
