package co.com.tienda.controller;


import co.com.tienda.modelo.*;

public class Inventario {
    public final static int CAPACIDAD_TOTAL = 100;
    private int valoresIngresados = 0; //variable de control: donde debo guardar
    private Electrodomestico[] articulos = new Electrodomestico[CAPACIDAD_TOTAL];

    public void agregarElemento_forma1(Electrodomestico elemento){
        //verificar si ya se llenó
        //se podria utilizar un for (no el foreach)

        //Forma 1: controlar los valores ingresados para validar y agregar (sin for) +Optima -necesita ordenar elementos
        if(valoresIngresados == CAPACIDAD_TOTAL){
            System.out.println("Se alcanzó la capacidad total:" + this.articulos.length);
            return;
        }
        this.articulos[this.valoresIngresados++] = elemento;
        System.out.println("elemento asignado en posición :" + (this.valoresIngresados-1));
    }

    public void borrarElemento(int posicion){
        if(posicion < 0 || posicion >= CAPACIDAD_TOTAL){
            return;
        }
        this.articulos[posicion] = null;
    }
    public void agregarElemento(Electrodomestico elemento){
        //Forma 2: Recorrer y encontrar un espacio +Dinamica +Costosa
        System.out.println("se agrega el elemento: " + elemento);
        //elemento = new Pantalla(); // =

        elemento.setMarca("Mi Marca");

        for (int i = 0; i < this.articulos.length; i++) {
            if(this.articulos[i] == null){
                this.articulos[i] = elemento;
                System.out.println("elemento asignado en posición :" + i);
                break;
            }
        }
    }

    public int calcularValorTotal(){
        int total = 0;

        for(Electrodomestico e : this.articulos){
            if(e != null) {
                total += e.calcularValor();
            }
        }

        return total;
    }

    public String mostrarInventario(){ //Ustedes la hacen
        StringBuilder sb = new StringBuilder();

        /*
        foreach: aplica a elementos iterables
        iterador: auxiliar que devuelve cada elemento.
        e: variable transitoria que va a recibir cada elemento

        para cada articulo que esté en articulos asignelo a la variable e.
        sin tener en cuenta: orden, tipo (herencia + polimorfismo)
        */

        for(Electrodomestico e : this.articulos){
            if(e != null) {
                sb.append(e).append("\n");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Inventario inv = new Inventario();
        Electrodomestico e = new Pantalla(50,"SNG");
        inv.agregarElemento(new EquipoSonido());
        inv.agregarElemento(e);
        inv.agregarElemento(new Nevera());
        inv.agregarElemento(new Telefono());
        inv.borrarElemento(3);
        inv.agregarElemento(new EquipoSonido());

        int j = 5;

        System.out.println("valor total:" + inv.calcularValorTotal());
        System.out.println("Elementos:\n" + inv.mostrarInventario());
    }
}
