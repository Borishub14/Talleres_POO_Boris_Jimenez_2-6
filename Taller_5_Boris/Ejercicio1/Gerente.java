package TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio1;

public class Gerente extends Empleado {
    String Departamento;

    public Gerente(double Salario, String Nombre, String Departamento){
        super(Salario, Nombre);
        this.Departamento = Departamento;
    }

    @Override
    public void MostrarInfo(){
        System.out.println("Nombre del gerente: " + Nombre + "\n" + "Salario: " + Salario + "\n" + "Departamento: "
        + Departamento + "\n");
    }
}
