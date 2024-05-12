package co.com.tienda.managers;

public abstract class ElectrodomesticoManager<T> implements Poblable{
    private T instancia;

    public ElectrodomesticoManager(T instancia) {
        this.instancia = instancia;
    }

    public T getInstancia() {
        return instancia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ElectrodomesticoManager{");
        sb.append("instancia=").append(instancia);
        sb.append('}');
        return sb.toString();
    }
}
