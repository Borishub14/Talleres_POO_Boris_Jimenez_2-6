package TALLERES_POO_BORIS.Taller_8_1_Boris.Ejercicio3;

public class Gerente extends Empleado{
    String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void Mostrar_Detalles(){
        System.out.println("Detalles del gerente." + "\n"
        +"Nombre: " + nombre + "\n" + "Salario: " + salario);
        System.out.println("Departamento: " + departamento + "\n");
    }

}
