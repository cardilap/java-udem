package co.com.tienda.examples.util;

import java.util.*;

public class Vectores {
    public static void main(String... args) {
        List <String> ejemplo = List.of("Luis", "Jorge", "Daniel", "Wilson", "Nataly");
        ordenar("asistentes", "Luis", "Jorge", "Daniel", "Wilson", "Nataly");
    }
    public static void ordenar(String titulo, String... nombres){
        Arrays.sort(nombres, (o1, o2) -> o2.compareTo(o1));
        System.out.println(titulo);
        for (String n : nombres){
            System.out.println(n);
        }
        System.out.println("opcion 2:  ");
        List<String> lista = Arrays.stream(nombres).sorted(Comparator.reverseOrder()).toList();
        for (String n : lista){
            System.out.println(n);
        }
    }
    public static void ejemplo() {
        //Vector v = new Vector(); //viejo estilo
        Vector<String> v = new Vector<>();
        v.add("Daniel");
        v.add(0, "Luis");
        v.add(0, "Jorge");

        Stack s = new Stack();
        s.push("Juan");

        ArrayList asistentes = new ArrayList<>();


        for (String o : v){
            System.out.println(o);
        }

        //String vs Stream
        //System.out
        //System.in
        System.out.println("----- flujos:");
        String primero = v.stream().filter((x) -> x.startsWith("X")).findFirst().orElse("Ninguno");
        System.out.println("primero: " + primero);
        v.stream().filter((x) -> x.startsWith("D")).forEach(System.out::println);

        System.out.println(v);
    }
}
