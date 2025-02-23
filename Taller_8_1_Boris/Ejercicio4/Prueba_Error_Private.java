package TALLERES_POO_BORIS.Taller_8_1_Boris.Ejercicio4;

public class Prueba_Error_Private extends Prueba1{
    public Prueba_Error_Private(String error){
        super(error);
    }
    
    public void Mostrar_error(){
        System.out.println("Error: " + error);
        //Aunque la clase derivada tiene los atributos y metodos de la clase base
        //no puede acceder a error directamente por que es un atributo que solo la clase base puede modificar
        // la solucion seria usar metodos de getter y setter (super.get_error())
    }
}
