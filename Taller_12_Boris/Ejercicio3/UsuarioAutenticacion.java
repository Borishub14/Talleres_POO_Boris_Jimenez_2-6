package TALLERES_POO_BORIS.Taller_12_Boris.Ejercicio3;

class UsuarioAutenticacion {
    public boolean autenticar(Usuario usuario, String correo, String contrasena) {
        return usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena);
    }
}