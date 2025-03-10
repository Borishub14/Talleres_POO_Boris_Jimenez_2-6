package TALLERES_POO_BORIS.Taller_3_1_Boris.Persona;

public class Prueba_persona {
    public static void main(String[] args) {
        Persona persona = new Persona("Boris", 24);
        persona.MostrarInfo();
        System.out.println("\n");

        /*Si quisieramos editar el nombre no podriamos hacer: persona.Nombre = "Orlando" pues el atributo Nombre solo 
         es accesible para la clase Persona y no para el archivo Prueba_persona asi que usamos el metodo setNombre para 
         modificar que es un metodo de tipo default y al pertenecer a la clase Persona puede acceder al atributo Nombre.
        */
        persona.setNombre("Orlando");

        /*Por otro lado Edad es un atributo de tipo default y es accesible por cualquier archivo que pertenezca al mismo
         paquete.
        */
        persona.Edad = 25;
        persona.MostrarInfo();
    }
}
