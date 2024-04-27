package co.com.tienda.examples;

import static co.com.tienda.examples.EjemploStatic.publicar;

class Clase{
    public static int capacidad; // el static la vuelve una varible de clase

    public Clase() { // constructor siempre es de instancia
        capacidad--;
        System.out.println(capacidad);
    }

    public void setCapacidad(int capacidad) { //metodo de instancia
        this.capacidad = capacidad;
    }

    public static void preparar(){ // metodo de clase por utilizar static
        capacidad = 600;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "capacidad=" + capacidad +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Clase.capacidad);
        Clase.preparar();
        publicar();


        Clase[] arr = {new Clase(), new Clase(), new Clase()};

        for (Object o : arr){
            System.out.println(o);
        }

        arr[0].setCapacidad(600);

        for (Object o : arr){
            System.out.println(o);
        }

    }
}
class Instancia {
    int capacidad; //variable de instancia, diferente en memoria para cada objeto
    void inicializar(){ // metodo de instancia, unico para cada objeto en memoria, metodo de instancia cambia el estado (variables de instancia)
        capacidad = 100;
    }

    public Instancia() {
        capacidad--;
        System.out.println(capacidad);
    }
    public void setCapacidad(int capacidad) { //metodo de instancia
        this.capacidad = capacidad;
    }

    public static void preparar(){ // metodo de clase por utilizar static
        //capacidad = 600;
    }

    @Override
    public String toString() {
        return "Instancia{" +
                "capacidad=" + capacidad +
                '}';
    }

    public static void main(String[] args) {
        Instancia[] arr = {new Instancia(), new Instancia(), new Instancia()};
        for (Object o : arr){
            System.out.println(o);
        }
        //cambio uno de los elementos
        //arr[1].preparar();
        arr[0].setCapacidad(200);
        arr[1].setCapacidad(100);
        arr[2].setCapacidad(1000);


        for (Object o : arr){
            System.out.println(o);
        }

    }
}
