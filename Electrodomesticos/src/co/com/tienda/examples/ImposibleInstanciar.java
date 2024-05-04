package co.com.tienda.examples;

public final class ImposibleInstanciar { //Singleton
    /*
    * 1. constructor privado
    * 2. metodo de clase para controlar instanciacion
    * 3. variable de clase privada que será nuestra unica instancia
    * */
    private static ImposibleInstanciar unica; // variable de clase
    private ImposibleInstanciar() { //constructor condicionado: siempre son de instancia
        System.out.println("crea la instancia");
    }
    public static ImposibleInstanciar inicializar(){ //metodo de clase
        if(unica == null){ //controla la creacion
            unica = new ImposibleInstanciar();
        }
        return unica;
    }
}
class Inicializador{
    public static void main(String[] args) {
        //ImposibleInstanciar objeto = new ImposibleInstanciar(); //genera error
        ImposibleInstanciar objeto1 = ImposibleInstanciar.inicializar();
        ImposibleInstanciar objeto2 = ImposibleInstanciar.inicializar();
        ImposibleInstanciar objeto3 = ImposibleInstanciar.inicializar();
        ImposibleInstanciar objeto4 = ImposibleInstanciar.inicializar();
    }
}
