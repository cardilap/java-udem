package co.com.tienda.examples;

/*
*  crear 3 clases:
*  1. Ser Humano
*  2. Entidad Viviente
*  3. Colombiano
*
*  Definir constructores para las 3 clases que impriman el nombre de cada clase
*
*  Definir un constructor extra para la clase Entidad Viviente que reciba el genero como parámetro
*  Navegar entre los dos constructores de la clase Entidad Viviente
*
*  Definir un main que cree instancias de las 3 clases.
* */
class EntidadViviente{
    private String genero;
    /*
    default:
    public EntidadViviente(){
        super();
    }
     */
    public EntidadViviente(){
        System.out.println("EntidadViviente");
    }
    public EntidadViviente(String genero){
        this(); // se invoca el constructor sin argumentos, equivalente super()
        System.out.println("linea 22: genero: " + genero);
    }
    public EntidadViviente(EntidadViviente origen){
        this.genero = origen.genero;
    }
}
class SerHumano extends EntidadViviente{
    public SerHumano() {
        System.out.println("SerHumano");
    }

    public SerHumano(String genero) {
        super(genero);
        System.out.println("linea 32");
    }

    public SerHumano(SerHumano origen) {
        super(origen);
    }
}
class Colombiano extends SerHumano{
    public Colombiano() {
        System.out.println("Colombiano");
    }

    public Colombiano(String genero) {
        super(genero);
        System.out.println("linea 42");
    }
}
public class EjercicioEnClase {
    public static void main(String[] args) {
        new Colombiano("femenino");
        new SerHumano("masculino");
        new EntidadViviente();
        new EntidadViviente("masculino");
    }
}
