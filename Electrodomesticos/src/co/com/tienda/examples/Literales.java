package co.com.tienda.examples;

public class Literales {
    public static void main(String[] args) {
        int valorenbytes = 0b0010; //literal:0b
        int valorenoctal = 071; //literal: 0 al inicio
        int valorenhexa = 0x11; //literal: 0x al inicio
        byte minimo = 34;
        short maximo = 20;

        long masGrande = 34L;
        float decimales = 5.6f;

        System.out.println(valorenbytes);
        System.out.println(valorenoctal);
        System.out.println(valorenhexa);
        System.out.println(Float.parseFloat("1.56f"));
        System.out.println(Long.parseLong("1l"));

    }
}
