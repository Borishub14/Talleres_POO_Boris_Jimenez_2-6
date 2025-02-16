package TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(1300000, "Boris");
        empleado.MostrarInfo();

        Gerente gerente = new Gerente(3000000, "Boris", "Ventas");
        gerente.MostrarInfo();
    }
}
