package co.com.tienda.modelo;

public abstract class Nevera extends Electrodomestico {
    public int volumen;
    public int altura;
    public boolean nofrost;

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isNofrost() {
        return nofrost;
    }

    public void setNofrost(boolean nofrost) {
        this.nofrost = nofrost;
    }

    public int calcularValor() {
        return 0;
    }
}
