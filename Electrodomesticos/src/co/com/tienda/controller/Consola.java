package co.com.tienda.controller;

import co.com.tienda.helpers.Teclado;
import co.com.tienda.managers.ElectrodomesticoFactory;
import co.com.tienda.managers.ElectrodomesticoManager;
import co.com.tienda.modelo.Electrodomestico;

public class Consola extends DataInput{
    public String validar(String comando){ //objeto validador
        int opcion = Integer.parseInt(comando);
        switch (opcion){
            case 1: return "Pantalla";
            case 2: return "Nevera";
            case 3: return "Telefono";
            case 4: return "EquipoSonido";
        }
        return null;
    }
    public void crearElemento(){
        String comando = Teclado.obtenerDeTeclado("¿Qué elemento desea crear?\n1.Pantalla\n2.Nevera\n3.Telefono\n4.Equipo de Sonido");
        String tipo = validar(comando);
        if(tipo == null){
            System.out.println("Elección no valida!");
            return;
        }

        Electrodomestico instancia = ElectrodomesticoFactory.getElectrodomestico(tipo);
        ElectrodomesticoManager manager = ElectrodomesticoFactory.getManager(instancia);
        manager.poblarElemento();
    }

    public static void main(String[] args) {
        new Consola().crearElemento();
    }
}
