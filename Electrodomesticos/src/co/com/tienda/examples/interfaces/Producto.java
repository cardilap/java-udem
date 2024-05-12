package co.com.tienda.examples.interfaces;

public class Producto implements Facturable{
    @Override
    public void facturar() {
        System.out.println("metodo facturar de Producto");
    }
}
