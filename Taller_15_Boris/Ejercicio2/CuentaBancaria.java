package TALLERES_POO_BORIS.Taller_15_Boris.Ejercicio2;

public class CuentaBancaria implements Transferencia, Retiro {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia de $" + monto + " realizada.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado.");
    }
}
