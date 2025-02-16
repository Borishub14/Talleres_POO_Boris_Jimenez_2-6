package TALLERES_POO_BORIS.Taller_4_1_Boris.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Coche coche = new Coche("MAZDA", "Mazda 3", 0);
        
        /*coche.Marca = "Marca";
        coche.Modelo = "Modelo";
        coche.VelocidadMaxima = 120;
        
        Si intentamos acceder a los atributos de forma directa nos saldra error por que solo la clase tiene acceso a ellos
        */
        
        coche.setVelocidad(-120);
        /*Debe mostrar que la velocidad no puede ser negativa o cero.*/

        System.out.println("Marca del auto: " + coche.getMarca() + "\n" + "Modelo: " + coche.getModelo() 
        + "\n" + "Velocidad: " + coche.getVelocidad() + "\n\n");

        coche.setVelocidad(120);

        System.out.println("Marca del auto: " + coche.getMarca() + "\n" + "Modelo: " + coche.getModelo() 
        + "\n" + "Velocidad: " + coche.getVelocidad() + "\n\n");
    }
}
