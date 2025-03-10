package TALLERES_POO_BORIS.Taller_11_Boris.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(14);
        Figura figura2 = new Rectangulo(12,4);

        figura1.calcularArea();
        figura2.calcularArea();
    }
}
