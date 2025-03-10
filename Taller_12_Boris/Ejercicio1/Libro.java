package TALLERES_POO_BORIS.Taller_12_Boris.Ejercicio1;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int precio;

    public Libro(){
        titulo = "Satanas";
        autor = "Mario Mendoza";
        isbn = "9788432211225";
        precio = 200000;
    }

    public Libro(String titulo, String autor, String isbn, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }
    public  int getPrecio(){
        return precio;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
