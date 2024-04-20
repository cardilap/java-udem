package co.com.tienda.modelo;

public class EquipoSonido extends Electrodomestico{
    int potencia;
    int nroBafles;
    boolean tieneUSB;
    boolean tieneBlueTooth;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNroBafles() {
        return nroBafles;
    }

    public void setNroBafles(int nroBafles) {
        this.nroBafles = nroBafles;
    }

    public boolean isTieneUSB() {
        return tieneUSB;
    }

    public void setTieneUSB(boolean tieneUSB) {
        this.tieneUSB = tieneUSB;
    }

    public boolean isTieneBlueTooth() {
        return tieneBlueTooth;
    }

    public void setTieneBlueTooth(boolean tieneBlueTooth) {
        this.tieneBlueTooth = tieneBlueTooth;
    }

    public int calcularValor() {
        if(potencia > 100){
            return 500;
        }
        return 100;
    }

    @Override
    public String toString() {
        return "EquipoSonido{" +
                "potencia=" + potencia +
                ", nroBafles=" + nroBafles +
                ", tieneUSB=" + tieneUSB +
                ", tieneBlueTooth=" + tieneBlueTooth +
                super.printState() +
                '}';
    }
}
