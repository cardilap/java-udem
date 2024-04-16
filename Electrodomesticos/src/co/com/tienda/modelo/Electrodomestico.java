package co.com.tienda.modelo;


public abstract class Electrodomestico {
    protected String nombre = new String();
    protected String marca;

    public Electrodomestico() {
    }

    public Electrodomestico(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString() {
        /* return "Electrodomestico{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}'; //5 constantes + 7 objetos x concat

        */
        return new StringBuilder("Electrodomestico{")
                .append("nombre='").append(nombre).append('\'')
                .append(", marca='").append(marca).append('\'')
                .append('}').toString(); // 1 StringBuilder + 5 constantes
    }

    public abstract int calcularValor();

}
