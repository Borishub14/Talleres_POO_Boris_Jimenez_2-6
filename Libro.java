public class Libro{
  String titulo;
  String author;
  String n_pag;

  public Libro(){
      this.titulo="desconocido";
      this.author="desconocido";
      this.n_pag="ninguna";
  }

  public Libro(String titulo, String n_pag, String author){
      this.titulo=titulo;
      this.author=author;
      this.n_pag=n_pag;
  }

  public void mostrar(){
      System.out.println("Titulo: " + titulo);
      System.out.println("Autor: " + author);
      System.out.println("Numero de pag:" + n_pag);
  }
}
