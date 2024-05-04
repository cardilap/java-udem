package co.com.tienda.managers;

import co.com.tienda.modelo.*;

public class ElectrodomesticoFactory {

    public static Electrodomestico getElectrodomestico(String tipo){
        switch (tipo){
            case "Pantalla": return new Pantalla();
            case "Nevera": return new Nevera();
            case "Telefono": return new Telefono();
            case "EquipoSonido": return new EquipoSonido();
        }

        return null;
    }
    public static ElectrodomesticoManager getManager(Electrodomestico instancia){
        if(instancia instanceof Pantalla){
            return new PantallaManager((Pantalla) instancia);
        }

        return null;
    }
}
