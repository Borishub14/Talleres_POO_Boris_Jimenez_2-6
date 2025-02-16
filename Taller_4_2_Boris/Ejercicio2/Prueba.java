package TALLERES_POO_BORIS.Taller_4_2_Boris.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria("0222", 120000, "Corriente");
        cuentaBancaria.Mostrar();

        /*cuentaBancaria.NumeroCuenta = "0221";
         * Intentar redefinir el atributo de NumeroCuenta del objeto creado marcara error, pues este es privado.
        */

        cuentaBancaria.setSaldo(130000);
        cuentaBancaria.Mostrar();

        /*Se usan los metodos get y set como el mostrar(publico) para poder tener acceso a atributos del objeto creado*/
    }
}
