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
        int valor = 0;

        if(this.alcance > 50){
            valor = this.esInalambrico?300:100;
        }
        else{
            valor = this.esInalambrico?160:60;
        }

        return valor;
    }
}
