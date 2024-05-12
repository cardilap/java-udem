package co.com.tienda.examples.interfaces;

import java.util.function.Function;
import java.util.function.Supplier;

public class Functionals {
    private int miInicial = 500;
    static int inicializador(){
        return 50;
    }
    int inicializadorInstancia(){
        return miInicial;
    }
    public static void supplier() {
        Supplier zero = () -> (0);
        Supplier iniciar = Functionals::inicializador;
        Supplier iniciarInstanciado = new Functionals()::inicializadorInstancia;

        System.out.println(zero);
        System.out.println(zero.get());

        System.out.println(iniciar);
        System.out.println(iniciar.get());

        System.out.println(iniciarInstanciado);
        System.out.println(iniciarInstanciado.get());
    }

    public static void consumer() {

    }
    public static void predicate() {

    }
    public static void function() {

    }
    public static void operator() {

    }

    public static void main(String[] args) {
        char opcion = 's';
        switch (opcion){
            case 's': supplier(); break;
            case 'c': consumer(); break;
            case 'p': predicate(); break;
            case 'f': function(); break;
            case 'o': operator(); break;
            case 'n': ejemplo(); break;
            case 'i': nuevaInterfaz();
        }
    }
    public static void ejemplo() {
        Supplier constructor1 = Registro::new;
        Function<String,Registro> constructor2 = Registro::new;
        constructor1.get();
        constructor2.apply("Prueba");
    }
    public static void nuevaInterfaz() {
        @FunctionalInterface
        interface Nueva<T, U, Z, R> {
            R procesar(T t, U u, Z z);
        }
        Nueva<String, String, String, Registro> funcional = Registro::new;
        funcional.procesar("uno", "dos", "tres");
    }
}
class Registro{
    public Registro() {
        System.out.println("Nueva Instancia");
    }
    public Registro(String nombre) {
        System.out.println("Nueva Instancia llamada " + nombre);
    }
    public Registro(String nombre, String marca, String modelo) {
        System.out.println("Nueva Instancia llamada " + nombre + " y " + marca + " y " + modelo);
    }
}