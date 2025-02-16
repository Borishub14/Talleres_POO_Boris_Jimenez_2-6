package TALLERES_POO_BORIS.Taller_3_2_Boris.Sobreescribir_errores;

public class Error_firmas extends Sobreescribir_error{
    @Override
    /*El compilador marca que se debe utilizar las funciones de super o Override para usar el metodo. */
    public void MostrarError(){
        System.out.println("ERROR #2: No usar las firmas correctas del metodo sobreescrito");
    }
}
