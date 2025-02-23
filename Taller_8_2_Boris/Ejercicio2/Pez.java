package TALLERES_POO_BORIS.Taller_8_2_Boris.Ejercicio2;

public class Pez extends Animal{
    String Tipodeagua;

    public Pez(String especie){
        super(especie);
        set_Tipodeagua();
    }

    public void set_Tipodeagua(){
        System.out.print("Ingrese el tipo de agua: ");
        this.Tipodeagua = leer.nextLine();
    }

    public String get_Tipodeagua(){
        return this.Tipodeagua;
    } 

    @Override
    public void Mostrar_especie(){
        super.Mostrar_especie();
        System.out.println("Tipo de agua: " + Tipodeagua);
    }
}
