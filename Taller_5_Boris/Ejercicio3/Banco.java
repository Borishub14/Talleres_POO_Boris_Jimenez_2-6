package TALLERES_POO_BORIS.Taller_5_Boris.Ejercicio3;

public class Banco {
    // protected double Saldo; - Error Atributo Saldo accesible para subclases dentro y fuera del paquete 
    //y clases dentro del paquete.  
    //Dejar el atributo Saldo en private es mas optimo pues solo la clase Banco podra modificarlo.
    private double Saldo;
    
    public Banco(double Saldo){
        setSaldo(Saldo);
    }

    public double getSaldo(){
        return Saldo;
    }

    public void setSaldo(double Saldo){
        if(Saldo<=0){
            System.out.println("ERROR: Saldo invalido");
        }else{
            this.Saldo = Saldo;
        }
    }
}
