package TALLERES_POO_BORIS.Taller_8_1_Boris.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Boris", 7000000, "Ventas");
        gerente.Mostrar_Detalles();
        System.out.println("");
        Empleado empleado = new Empleado("Ninguno", 0);
        empleado.Mostrar_Detalles();
    }
}
