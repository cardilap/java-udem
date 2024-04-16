package co.com.tienda.examples;

public class Casos {
    public static void main(String[] args) {
        final int i = 10;
        final int caso3 = 3;
        final String vardos = "dos";

        switch (i){
            default: System.out.println("ninguno");
                System.out.println("hola");
                System.out.println("hola");
                System.out.println("hola");
                break;
            case 0: System.out.println(i);
            case 1: System.out.println(i);
            case 2: System.out.println(i);
            case caso3: System.out.println(i);
            case 4: System.out.println(i);
            case 5: System.out.println(i);
        }
        switch (vardos){
            case vardos: System.out.println(vardos);
            case "hola" : System.out.println("hola");
        }
    }
}
