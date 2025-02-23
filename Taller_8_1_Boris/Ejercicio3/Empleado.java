package TALLERES_POO_BORIS.Taller_8_1_Boris.Ejercicio3;

public class Empleado {
    //Define una clase Empleado con atributos nombre y salario y un método mostrarDetalles que muestre ambos atributos.
    String nombre;
    double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void Mostrar_Detalles(){
        System.out.println("Detalles del empleado." + "\n"
        +"Nombre: " + nombre + "\n" + "Salario: " + salario);
    }
}
