package TALLERES_POO_BORIS.Taller_4_2_Boris.Ejercicio2;

public class CuentaBancaria {
    private String NumeroCuenta;
    private double Saldo;
    public String TipoCuenta;

    public CuentaBancaria(String NumeroCuenta, double Saldo, String TipoCuenta){
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
        this.TipoCuenta = TipoCuenta;
    }
    public double getSaldo(){
        return Saldo;
    }

    public void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }

    public void Mostrar(){
        System.out.println("Numero de la cuenta: " + NumeroCuenta + "\n" + "Saldo: " + Saldo + "\n" + 
        "Tipo de cuenta: " + TipoCuenta + "\n");
    }
}
