package co.com.tienda.examples.interfaces;

interface Facturable { //contrato
    public default void facturar() { //requisitos del contrato
        System.out.println("comportamiento default");
    }
}
