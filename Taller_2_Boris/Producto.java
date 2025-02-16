package TALLERES_POO_BORIS.Taller_2_Boris;

public class Producto {
    String Nombre;
    int Precio ;

    public Producto(String Nombre, int Precio){
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public void mostrar(){
        System.out.println("Nombre del producto: " + this.Nombre +  "\n" + "Precio: " + this.Precio);
    }
}
