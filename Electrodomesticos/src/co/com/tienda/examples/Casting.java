package co.com.tienda.examples;

import co.com.tienda.controller.Inventario;
import co.com.tienda.modelo.Electrodomestico;
import co.com.tienda.modelo.EquipoSonido;

public class Casting {
    public void primitivos(){
        int limite = 100_000;
        limite = limite + 1;
        short s = (short) limite;
        System.out.println(40000);
        System.out.println(s);
        System.out.println((byte) 40000);
        System.out.println("resultado:" + limite + ( 28 - 5 * 4) );
        System.out.println("linea 1. " + limite);
        limite++;
        System.out.println("linea 2. " + limite);
    }
    public static void main(String[] args) {
        Electrodomestico var = new EquipoSonido();
        EquipoSonido subvar = (EquipoSonido) var;

        EquipoSonido subvar2 = new EquipoSonido();
        Electrodomestico var2 = subvar2;

        Object inv = new Inventario();
        if(inv instanceof Electrodomestico){
            Electrodomestico var3 = (Electrodomestico) inv;
        }

        System.out.println(var.calcularValor());
    }
}
