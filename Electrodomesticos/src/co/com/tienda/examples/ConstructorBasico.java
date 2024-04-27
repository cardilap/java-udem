package co.com.tienda.examples;

class NivelSuperior {
    public NivelSuperior() {
        System.out.println("Nivel Superior");
    }
}
public class ConstructorBasico extends NivelSuperior{
    // variables de instancia
    // variables de clase
    public ConstructorBasico(String prefijo){ //variable local, argumentos del método
        System.out.println(prefijo);
    }

    public ConstructorBasico() {
    }

    public static void main(String[] args) {
        String arg = "que imprime?";
        new ConstructorBasico("que imprime?");
    }
}
