package TALLERES_POO_BORIS.Taller_16_Boris.Ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando reporte Excel con contenido: " + contenido);
    }
}
