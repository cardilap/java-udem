package co.com.tienda.examples;

import java.util.function.Consumer;
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
            case 'o': operator();
        }
    }
}
