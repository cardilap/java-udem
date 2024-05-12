package co.com.tienda.managers;

import co.com.tienda.controller.Consola;
import co.com.tienda.controller.Validador;
import co.com.tienda.modelo.EquipoSonido;

public class EquipoSonidoManager extends ElectrodomesticoManager<EquipoSonido>{ //Wrapper
    public EquipoSonidoManager(EquipoSonido instancia) {
        super(instancia);
    }

    @Override
    public void poblarElemento(Consola consola, Validador valida) {
        System.out.println("poblar Equipo de Sonido");
    }
}