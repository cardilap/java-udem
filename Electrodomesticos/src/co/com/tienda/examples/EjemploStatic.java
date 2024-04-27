package co.com.tienda.examples;


class SuperPadre{
    public static int capacidad = 600;

    static void publicar(){
        System.out.println("Super");
    }
}
public class EjemploStatic extends SuperPadre{
    public static int capacidad = 60;

    static void publicar(){
        System.out.println("Sub de ejemploStatic");
    }
    public static void main(String[] args) {
        System.out.println("SuperPadre: " + SuperPadre.capacidad);
        System.out.println("EjemploStatic: " + EjemploStatic.capacidad);

        SuperPadre.publicar();
        EjemploStatic.publicar();

        SuperPadre superclase = new EjemploStatic();
        EjemploStatic subclase = (EjemploStatic) superclase;

        System.out.println("SuperPadre: " + superclase.capacidad);
        System.out.println("subclase: " + subclase.capacidad);

        superclase.publicar();
        subclase.publicar();
    }
}
