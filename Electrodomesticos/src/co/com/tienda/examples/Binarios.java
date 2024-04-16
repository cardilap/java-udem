package co.com.tienda.examples;

public class Binarios {

    public static void operadoresbin(int x){
        x = x & 4;
        System.out.println("resultado " + x);
        System.out.println("resultado " + (x>>2));

        x &= 4;
        System.out.println("resultado " + x);

        x =  x >> 1;
        System.out.println("resultado " + x);
        x >>= 1;
        System.out.println("resultado " + x);
    }

    public static void obtener3erBit(int x){
        x &= 4;
        System.out.println("resultado " + x);
        System.out.println("resultado " + (x>>2));
    }

    public static void main(String[] args) {
        operadoresbin(5);
    }
}
