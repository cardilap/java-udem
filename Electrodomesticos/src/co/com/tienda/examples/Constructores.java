package co.com.tienda.examples;

public class Constructores {
    public static void main(String[] args) {
        new SuperClase("Electrodomestico");
        new SubClaseA();
    }
}

class SuperClase{
    private String nombre;
    public SuperClase() {
        System.out.println("default de SuperClase");
    }

    public SuperClase(String nombre) {
        this();
        this.nombre = nombre;
        System.out.printf("Recibe un nombre: %s\n", nombre);

    }
}

class SubClaseA extends SuperClase{

}
class SubClaseB extends SuperClase{

}