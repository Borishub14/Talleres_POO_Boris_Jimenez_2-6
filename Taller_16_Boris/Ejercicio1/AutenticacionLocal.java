package TALLERES_POO_BORIS.Taller_16_Boris.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        return "Administrador".equals(usuario) && "0011".equals(contraseña);
    }
}
