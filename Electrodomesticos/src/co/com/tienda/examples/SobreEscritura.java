package co.com.tienda.examples;

import co.com.tienda.modelo.Electrodomestico;

import java.io.IOException;

class Super{
    Super getCopia(){
        return this;
    }
}
class SobreEscritura extends Super{
    // tdp no puede variar en la sobreEscritura
    /*
    *   tdp: long ->>> int ->> short ->> byte (promoción, casting explicito)
    * */
    public short getTotal(){
        return 0;
    }
    Integer getCantidad(){
        StringBuilder sb = new StringBuilder();
        sb.append("a ").append("b ").append("b ").append("b ").append("b ").append("b ").append("b ");
        return 0;
    }

    /*
    *  definición de metodo:
    *  : default
    *  : SobreEscritura
    *  - depende de la necesidad o lógica de la programación
    *  - patron de diseño................
    * */
    SobreEscritura getCopia(){
        return this;
    }

    Number prueba(){
        return null;
    }
}
class subClase1 extends SobreEscritura {
    public short getTotal() {
        return super.getTotal();
    }

    @Override
    Integer getCantidad() {
        return super.getCantidad();
    }

    @Override
    public subClase1 getCopia() {
        return this;
    }

    @Override
    Short prueba() {
        return null;
    }

    public static void main(String[] args) {
        SobreEscritura padre = new SobreEscritura();
        SobreEscritura hija = new subClase1();

        // imprimen lo mismo: 1

        System.out.println(padre.getCopia());
        System.out.println(hija.getCopia().getCopia().getCopia().getCopia());
    }
}
