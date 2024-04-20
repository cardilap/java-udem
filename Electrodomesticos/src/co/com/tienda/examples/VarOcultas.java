package co.com.tienda.examples;

public class VarOcultas {
    int edad = 10;

    public void imprimir(int edad1){
        int edad = 98;
        System.out.println(this.edad);
    }

    public static void main(String[] args) {
        int edad = 0;
        System.out.println(edad);
    }
}
