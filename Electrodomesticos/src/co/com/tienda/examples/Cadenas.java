package co.com.tienda.examples;

public class Cadenas {
    public static void main(String[] args) {
        int a = "5".length();
        String nombre = "Jose";
        System.out.println(nombre);
        nombre = nombre.concat(" Martinez");
        nombre = nombre + new String(" Martinez");
        nombre += " Martinez";
        System.out.println(nombre);

        StringBuilder nombre2 = new StringBuilder(nombre);
        System.out.println(nombre2);
        nombre2.append(" Martinez").append(" Martinez").append(" Martinez");
        System.out.println(nombre2);
    }
}
