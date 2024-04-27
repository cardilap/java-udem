package co.com.tienda.examples;

class Entidad{
    //Nunca usar bloques anonimos de instancia: porque para eso estan los CONSTRUCTORES
    int inicial1 = 10;
    {
        System.out.println("Bloque anonimo 1: " + inicial1);
    }
    int inicial = 10;
    {
        System.out.println("Bloque anonimo 2: " + inicial);
    }
    {
        System.out.println("Bloque anonimo 3");
    }

    static {
        System.out.println("Bloque anonimo estatico de entidad ");
    }
}
class Numero extends Entidad{
    {
        System.out.println("Bloque anonimo 4");
    }
}
class Entero extends Numero{
    static int general1 = 0;
    //inicializadores a nivel de clase: son invocados por el CLASS LOADER
    static {
        System.out.println("Bloque anonimo estatico " + general1);
    }
    static int general2= 10;
    static {
        System.out.println("Bloque anonimo estatico " + general2);
    }
}
public class Inicializacion {
    public static int dato = 0;
    static {
        System.out.println("Bloque anonimo estatico de Inicializacion");
    }
    public static void main(String[] args) {
        //System.out.println(Entero.general1);
        new Numero();
    }
}
