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
        return new StringBuilder("Pantalla{")
                .append("resolucion='").append(resolucion).append('\'')
                .append(", tipo='").append(tipo).append('\'')
                .append(", pulgadas='").append(pulgadas).append('\'')
                .append(", smart='").append(smart).append('\'')
                .append(super.printState())
                .append('}').toString(); // 1 StringBuilder + 5 constantes
    }

    public int calcularValor() {
        return 0;
    }
}
