package co.com.tienda.managers;

import co.com.tienda.controller.Consola;
import co.com.tienda.controller.Validador;
import co.com.tienda.modelo.Pantalla;

public class PantallaManager extends ElectrodomesticoManager{ //Wrapper
    private Pantalla instancia;

    public PantallaManager(Pantalla instancia) {
        this.instancia = instancia;
        super.register("Pantalla");
    }

    public Pantalla getInstancia() {
        return instancia;
    }

    @Override
    public void poblarElemento(Consola consola, Validador valida) {

    }
}
