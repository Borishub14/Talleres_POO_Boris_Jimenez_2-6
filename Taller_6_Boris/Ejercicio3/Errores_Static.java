package TALLERES_POO_BORIS.Taller_6_Boris.Ejercicio3;

public class Errores_Static {
    private String Nombre_Producto;
    private int Stock_Producto;

    /*public static void setStock(int Stock_Producto){
        this.Stock_Producto = Stock_Producto;
    } 
        Este metodo trata de settear un dato en una variable no estatica,
        y un metodo static no recibe instancias de clase por tanto no podra acceder al atributo.
        para corregirlo debemos declarar el metodo no estatico pues stock 
        no es un dato que necesite ser statico en este caso*/

    public void setStock(int Stock_Producto){
        this.Stock_Producto = Stock_Producto;
    } 

    public int getStock() {
        return Stock_Producto;
    }
}
