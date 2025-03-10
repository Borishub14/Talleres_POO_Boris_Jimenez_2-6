package TALLERES_POO_BORIS.Taller_15_Boris.Ejercicio2;

public class Pagos implements PagoFactura {
    @Override
    public void pagarFactura(double monto) {
        System.out.println("Pago de factura: " + monto + " $ realizado.");
    }
}