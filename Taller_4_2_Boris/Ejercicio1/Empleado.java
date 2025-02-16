package TALLERES_POO_BORIS.Taller_4_2_Boris.Ejercicio1;

public class Empleado {
    public String Nombre;
    double Salario;

    public Empleado(String Nombre, double Salario){
        this.Nombre = Nombre;
        setSalario(Salario);
    }

    public double getSalario(){
        return Salario;
    }

    public void setSalario(double Salario){
        if(Salario <=0){
            System.out.println("Salario invalido.");
        }else{
            this.Salario = Salario;
        }
    }
}
