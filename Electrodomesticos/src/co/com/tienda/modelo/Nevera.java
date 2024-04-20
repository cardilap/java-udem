package co.com.tienda.modelo;

public class Nevera extends Electrodomestico {
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
        return this.volumen>400?1200:850;
    }

    @Override
    public String toString() {
        return "Nevera{" +
                "volumen=" + volumen +
                ", altura=" + altura +
                ", nofrost=" + nofrost +
                super.printState() +
                '}';
    }
}
