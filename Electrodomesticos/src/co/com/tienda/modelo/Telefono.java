package co.com.tienda.modelo;

public class Telefono extends Electrodomestico{
    int alcance;
    boolean identificador;
    boolean esInalambrico;

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public boolean isIdentificador() {
        return identificador;
    }

    public void setIdentificador(boolean identificador) {
        this.identificador = identificador;
    }

    public boolean isEsInalambrico() {
        return esInalambrico;
    }

    public void setEsInalambrico(boolean esInalambrico) {
        this.esInalambrico = esInalambrico;
    }

    public int calcularValor() {
        return 0;
    }
}
