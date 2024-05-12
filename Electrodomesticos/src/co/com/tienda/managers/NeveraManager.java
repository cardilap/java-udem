package co.com.tienda.managers;

import co.com.tienda.controller.Consola;
import co.com.tienda.controller.Validador;
import co.com.tienda.modelo.Nevera;

public class NeveraManager extends ElectrodomesticoManager<Nevera> { //Wrapper
    public NeveraManager(Nevera instancia) {
        super(instancia);
    }

    @Override
    public void poblarElemento(Consola consola, Validador valida) {
        System.out.println("poblar Nevera");
    }
}
