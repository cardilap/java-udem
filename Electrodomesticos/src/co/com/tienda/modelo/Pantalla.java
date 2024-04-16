package co.com.tienda.modelo;

import co.com.tienda.modelo.Electrodomestico;

public class Pantalla extends Electrodomestico {
    protected int resolucion;
    String tipo;
    int pulgadas;
    boolean smart;

    public Pantalla(){

    }

    public Pantalla(int resolucion, String tipo) {
        this.resolucion = resolucion;
        this.tipo = tipo;
    }
    public Pantalla(int resolucion, String tipo, int pulgadas, boolean smart) {
        this(resolucion,tipo);
        this.pulgadas = pulgadas;
        this.smart = smart;
    }

    public Pantalla(int resolucion, String tipo, int pulgadas, boolean smart, String nombre, String marca) {
        super(nombre, marca);
        this.resolucion = resolucion;
        this.tipo = tipo;
        this.pulgadas = pulgadas;
        this.smart = smart;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String toString() {
        return "---------------------------------Pantalla{" +
                "resolucion=" + this.resolucion +
                ", tipo='" + tipo + '\'' +
                ", pulgadas=" + pulgadas +
                ", smart=" + smart +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}' + "Pantalla{";
    }

    public int calcularValor() {
        return 0;
    }

    public static void main(String[] args) {
        Electrodomestico p = new Pantalla();
        /*
        int limite = 100_000;
        limite = limite + 1;
        short s = (short) limite;
        System.out.println(40000);
        System.out.println(s);
        System.out.println((byte) 40000);
        System.out.println("resultado:" + limite + ( 28 - 5 * 4) );
        System.out.println("linea 1. " + limite);
        limite++;
        System.out.println("linea 2. " + limite);
        System.out.println(p.toString());

        int x = 0;
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
         */

    }
}
