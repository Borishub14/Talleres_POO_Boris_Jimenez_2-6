package TALLERES_POO_BORIS.Taller_10_Boris.Ejercicio3;

public abstract class Abstracta {
    default void Prueba_error(){
        System.out.println("");
    }
    //Los metodos default no son posible de implementar en clases abstractas
    //solo se permiten metodos concretos y abstractos, los metodos default se usan mas
    //en interfaces para permitir compatibilidad entre clases y subclases.
}
