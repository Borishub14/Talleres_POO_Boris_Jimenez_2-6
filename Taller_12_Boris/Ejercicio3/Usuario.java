package TALLERES_POO_BORIS.Taller_12_Boris.Ejercicio3;

public class Usuario {
    private String nombre;
    private String correo;
    private String password;

    public Usuario(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return password;
    }

    public String getnombre() {
        return nombre;
    }
}
