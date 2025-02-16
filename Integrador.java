import java.util.Scanner;
public class Integrador {
  public static Scanner leer = new Scanner(System.in);
  public static void main(String[] args) {
    agregar();
  }
  
  public static void agregar(){
    String Titulo;
    String cantidad_pag;
    String Autor;

    System.out.print("Ingrese el nombre del libro: ");
    Titulo = leer.nextLine();
    System.out.print("Ingrese la cantidad de paginas del libro: ");
    cantidad_pag = leer.nextLine();
    System.out.print("Ingrese el autor del libro: ");
    Autor = leer.nextLine();
    System.out.println("");
    
    Libro libro = new Libro(Titulo, cantidad_pag, Autor);

    String Nombre;
    String Edad;
    String Curso;

    System.out.print("Ingrese el nombre del estudiante: ");
    Nombre = leer.nextLine();
    System.out.print("Ingrese la edad del estudiante: ");
    Edad = leer.nextLine();
    System.out.print("Ingrese el curso del estudiante: ");
    Curso = leer.nextLine();
    System.out.println("");

    Estudiante estudiante = new Estudiante(Nombre,Edad,Curso);

    String numeroCuenta;
    String saldo;
    String tipoCuenta;

    System.out.print("Ingrese el numero de cuenta: ");
    numeroCuenta = leer.nextLine();
    System.out.print("Ingrese el saldo de la cuenta: ");
    saldo = leer.nextLine();
    System.out.print("Ingrese el tipo de cuenta: ");
    tipoCuenta = leer.nextLine();
    System.out.println("");

    CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

    System.out.println("Titulo del libro agregado: " + libro.titulo.toString() + "\n" 
    + "Cantidad de paginas: " + libro.n_pag.toString() + "\n" + "Autor: " + libro.author.toString() + "\n");

    System.out.println("Nombre del estudiante agregado: " + estudiante.Nombre.toString() + "\n" + 
    "Edad del estudiante: " + estudiante.Edad.toString() + "\n" + "Curso del estudiante: " + estudiante.Curso.toString() + "\n");

    System.out.println("Numero de cuenta agregada: " + cuentaBancaria.numeroCuenta.toString() + "\n" + 
    "Saldo de la cuenta: " + cuentaBancaria.saldo.toString() + "\n" + "Tipo de cuenta: " + cuentaBancaria.tipoCuenta.toString() + "\n");
  }
}
