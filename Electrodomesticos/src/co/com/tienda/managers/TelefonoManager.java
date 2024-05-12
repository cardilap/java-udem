package co.com.tienda.managers;

import co.com.tienda.controller.Consola;
import co.com.tienda.controller.Validador;
import co.com.tienda.modelo.Telefono;

public class TelefonoManager extends ElectrodomesticoManager<Telefono> { //Wrapper
    public TelefonoManager(Telefono instancia) {
        super(instancia);
    }

    @Override
    public void poblarElemento(Consola consola, Validador valida) {
        System.out.println("poblar Telefono");
    }
}