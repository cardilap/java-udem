package co.com.tienda.controller;

import co.com.tienda.helpers.namespace.Namespace;
import co.com.tienda.helpers.namespace.NamespaceEntry;
import co.com.tienda.helpers.namespace.NamespaceFactory;
import co.com.tienda.managers.*;
import co.com.tienda.modelo.*;

public class Admin { //Singleton
    private Consola miConsola;
    private Inventario miInventario;

    private static Admin unico;

    private Admin(){
        registro();
        miConsola = new Consola();
        miInventario = new Inventario();
    }
    public static Admin getInstance(){
        if(unico == null){
            unico = new Admin();
        }

        return unico;
    }

    public void registro(){
        Namespace nm = NamespaceFactory.getInstance().getNamespace();
        nm.register("Pantalla", Pantalla::new, PantallaManager::new);
        nm.register("Telefono", Telefono::new, TelefonoManager::new);
        nm.register("Nevera", Nevera::new, NeveraManager::new);
        nm.register("EquipoSonido", EquipoSonido::new, EquipoSonidoManager::new);
    }

    public void crearElemento(){
        NamespaceEntry config = this.miConsola.menuCrearElemento();

        if(config != null){
            Electrodomestico instancia = config.<Electrodomestico>getFactory().get();
            Poblable manager = config.<Electrodomestico,ElectrodomesticoManager>getManagerFactory().apply(instancia);
            miInventario.agregarElemento(instancia);
            manager.poblarElemento(this.miConsola,new Validador());
            System.out.println(config);
            System.out.println(instancia);
            System.out.println(manager);
        }
    }

    public static void main(String[] args) {
        Admin.getInstance().crearElemento();
    }
}
