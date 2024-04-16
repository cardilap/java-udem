package co.com.tienda.examples;

public class Constructores {
    public static void main(String[] args) {
        new SuperClase("Electrodomestico");
        new SubClaseA();
        new SubClaseB("Pantalla");
    }
}

class SuperClase{
    private String nombre;
    protected String version;
    public SuperClase() {
        System.out.println("default de SuperClase");
    }

    public SuperClase(String nombre) {
        this();
        this.nombre = nombre;
        System.out.printf("Recibe un nombre: %s\n", nombre);

    }

    public SuperClase(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
    }
}

class SubClaseA extends SuperClase{

}
class SubClaseB extends SuperClase{
    public SubClaseB(String nombre) {
        super(nombre);
    }

    public SubClaseB(String nombre, String version) {
        super(nombre, version);
    }
}