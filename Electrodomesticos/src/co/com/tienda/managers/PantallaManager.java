package co.com.tienda.managers;

import co.com.tienda.controller.Consola;
import co.com.tienda.controller.Validador;
import co.com.tienda.modelo.Pantalla;

public class PantallaManager extends ElectrodomesticoManager<Pantalla>{ //Wrapper
    public PantallaManager(Pantalla instancia) {
        super(instancia);
    }

    @Override
    public void poblarElemento(Consola consola, Validador valida) {
        System.out.println("poblar Pantalla");
    }
}
