package co.com.tienda.controller;


import co.com.tienda.modelo.Electrodomestico;
import co.com.tienda.modelo.EquipoSonido;

public class Inventario {
    public final static int CAPACIDAD_TOTAL = 100;
    Electrodomestico articulos[] = new Electrodomestico[CAPACIDAD_TOTAL];

    public void agregarElemento(Electrodomestico elemento){

    }

    public int calcularValorTotal(){
        int total = 0;

        for(Electrodomestico e : articulos){
            total += e.calcularValor();
        }

        return total;
    }

    public String mostrarInventario(){ //Ustedes la hacen
        StringBuilder sb = new StringBuilder();

        for(Electrodomestico e : articulos){
            sb.append(e);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Electrodomestico var = new EquipoSonido();
        EquipoSonido subvar = (EquipoSonido) var;

        EquipoSonido subvar2 = new EquipoSonido();
        Electrodomestico var2 = subvar2;

        Object inv = new Inventario();
        if(inv instanceof Electrodomestico){
            Electrodomestico var3 = (Electrodomestico) inv;
        }

        System.out.println(var.calcularValor());
    }
}
