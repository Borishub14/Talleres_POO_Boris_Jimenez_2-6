package TALLERES_POO_BORIS.Taller_8_2_Boris.Ejercicio3;

public class Prueba2 extends Error1{
    public Prueba2(String Prueba1){
        super(Prueba1);
    }
    public void mostrar_private(){
        System.out.println("Mostrar error: " + this.prueba1);//No se puede acceder al dato private.
    }
}
