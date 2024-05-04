package co.com.tienda.examples;

public class Wraps {
    public static void main(String[] args) {
        long largo = 50L;
        float decimales = 5F;
        byte octal = 00010;
        byte hexa = 0x0010;
        byte binary = 0b0010;
        char ch = '\u0061';

        System.out.println(largo);
        System.out.println(decimales);
        System.out.println(octal);
        System.out.println(hexa);
        System.out.println(binary);
        System.out.println(ch);
        ch = 255;
        System.out.println(ch);
        ch = 'j';
        System.out.println(ch);

        System.out.println("--------------------");
        System.out.println(Float.toHexString(decimales));
        System.out.println(Float.floatToIntBits(decimales));
        System.out.println(Long.toHexString(largo));
        System.out.println(Long.toOctalString(largo));
        System.out.println(Long.toBinaryString(largo));
        System.out.println(String.format("0x%08X", hexa));

        System.out.println("--------------------");
        System.out.println(Float.parseFloat("5F"));
        System.out.println(Long.parseLong("5L"));

    }
}
