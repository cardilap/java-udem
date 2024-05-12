package co.com.tienda.managers;

import co.com.tienda.modelo.*;

public class ElectrodomesticoFactory {

    public static ElectrodomesticoManager getManager(Electrodomestico instancia){
        if(instancia instanceof Pantalla){
            return new PantallaManager((Pantalla) instancia);
        }

        return null;
    }
}
