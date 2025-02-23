package TALLERES_POO_BORIS.Taller_7_Boris.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Prueba_error prueba_error = new Prueba_error();

        /*Las clases abstracts no se pueden instanciar como objetos 
        directamente a menos que sea para hacer herencia de esta a otra.
        */
        M_concreto m_concreto = new M_concreto();
        //las subclases derivadas del la clase adstract si pueden ser instanciadas.
        m_concreto.Error();
        m_concreto.Metodo_concreto();
        //Dejar un metodo concreto en una clase abstracta no tiene mucho sentido
        //pues si es un metodo con una finalidad especifica seria mejor definirlo
        //en las subclases directamente.
    }
}
