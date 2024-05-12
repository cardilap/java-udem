package co.com.tienda.examples.interfaces;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Funciones { //Funciones del contrato
    public void facturar(Facturable producto){
        producto.facturar();
        System.out.println("llamada de facturar");
    }

    public int simple(){
        System.out.println("llamada de simple");
        return 0;
    }

    public void operar(Facturable producto){
        System.out.println("llamada de operar");
    }

    public static void ejemploSupplier() { //se hace el cruce entre lo definido y lo contratado
        Entidad entidad = new Entidad();
        Producto producto = new Producto();
        Servicio servicio = new Servicio();
        Funciones proceso = new Funciones();

        //referencia a un metodo (dinamico)
        Supplier refMetodo = entidad::simple;
        refMetodo.get();

        Consumer<String> consumidor = (o) -> {System.out.println("log: " + o);};

        consumidor.accept("imprima esto");

        Supplier refMetodo2 = () -> entidad.simple();
        refMetodo2.get();

        proceso.facturar(servicio);
    }

    public static void ejemploConstructores(){
        //referencia a un método (Dinamico)
        Supplier<Entidad> fabrica = Entidad::new;
        fabrica.get();
        fabrica.get();
        fabrica.get();
        fabrica.get();
        fabrica.get();
    }

    public static void main(String[] args) {
        //ejemploSupplier();
        ejemploConstructores();
    }
}
