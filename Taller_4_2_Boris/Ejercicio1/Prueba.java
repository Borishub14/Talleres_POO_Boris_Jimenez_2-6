package TALLERES_POO_BORIS.Taller_4_2_Boris.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Boris", 1200000);

        System.out.println("Nombre del empleado: " + empleado.Nombre + "\n" + "Salario: " + empleado.getSalario() + "\n");

        empleado.setSalario(1250000);
        System.out.println("Nombre del empleado: " + empleado.Nombre + "\n" + "Salario: " + empleado.getSalario() + "\n");

        empleado.setSalario(-1250000);
        System.out.println("Nombre del empleado: " + empleado.Nombre + "\n" + "Salario: " + empleado.getSalario() + "\n");

    }
}
