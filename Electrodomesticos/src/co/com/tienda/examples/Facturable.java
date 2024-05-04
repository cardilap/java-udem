package co.com.tienda.examples;

interface Modificable{
    int capacidad = 100; //constante
    public abstract void modificar();
    void modificar(int valor);
}
interface Agregable{
    int capacidad = 100; //constante
    default void agregar(){
        System.out.println("default desde java 8");
    }
}
public interface Facturable extends Modificable,Agregable{
}

class Ejemplo1 implements Modificable{
    @Override
    public void modificar() {

    }

    @Override
    public void modificar(int valor) {

    }
}
class Ejemplo2 implements Facturable{
    @Override
    public void modificar() {

    }
    @Override
    public void modificar(int valor) {

    }
}

abstract class Ejemplo3 implements Modificable,Agregable{ //superclase
    //delega la implementación
    @Override
    public void modificar(int valor) {

    }
}
class SubEjemplo extends Ejemplo3{
    @Override
    public void modificar() {

    }

    public static void main(String[] args) {
        SubEjemplo instancia = new SubEjemplo();

        System.out.println(instancia instanceof SubEjemplo);
        System.out.println(instancia instanceof Ejemplo3);
        System.out.println(instancia instanceof Modificable);
        System.out.println(instancia instanceof Agregable);
        System.out.println(instancia instanceof Facturable);

        Ejemplo3 superclase = instancia; //de tipo SubEjemplo
        Modificable modifica = instancia;
        Agregable agrega = instancia;
        Facturable factura = (Facturable) instancia;
    }
}