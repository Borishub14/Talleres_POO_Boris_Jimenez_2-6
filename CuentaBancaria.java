public class CuentaBancaria {
  String numeroCuenta;
  String saldo;
  String tipoCuenta;

  public CuentaBancaria(){
    this.numeroCuenta = "ninguno";
    this.saldo = "ninguno";
    this.tipoCuenta = "ninguno";
  }

  public CuentaBancaria(String numeroCuenta, String saldo){
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
  }

  public CuentaBancaria(String numeroCuenta, String saldo, String tipoCuenta){
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    this.tipoCuenta = tipoCuenta;
  }
}
