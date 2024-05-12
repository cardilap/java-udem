package co.com.tienda.examples.interfaces;

class Entidad implements Facturable, Simplify { //cumple con el contrato

    public Entidad() {
        System.out.println("constructor por defecto");
    }
    public Entidad(String nombre) {
        System.out.println("constructor con " + nombre);
    }

    @Override
    public void facturar() { // cumple los requisitos
        System.out.println("metodo facturar de Entidad");
    }

    @Override
    public int simple() {
        System.out.println("metodo simple de Entidad");
        return 0;
    }
}
