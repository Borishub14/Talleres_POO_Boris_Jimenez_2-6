package TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio3;

class Usuario extends Banco{
    String Nombre;
    
    Usuario(String Nombre, double Saldo){
        super(Saldo);
        this.Nombre = Nombre;
    }
    
    //Si dejaramos el atributo cuenta en protected la subclase Usuario podria acceder al atributo Saldo  
    public void modificarSaldo(double Saldo){
        this.Saldo = Saldo;
    } 
}
