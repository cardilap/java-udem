package co.com.tienda.controller;

import co.com.tienda.helpers.namespace.Namespace;
import co.com.tienda.helpers.namespace.NamespaceFactory;
import co.com.tienda.managers.ElectrodomesticoFactory;
import co.com.tienda.managers.ElectrodomesticoManager;
import co.com.tienda.modelo.Electrodomestico;

public class Admin { //Singleton
    private Consola miConsola;
    private Inventario miInventario;

    private static Admin unico;

    private Admin(){
        registro();
        miConsola = new Consola();
    }
    public static Admin getInstance(){
        if(unico == null){
            unico = new Admin();
        }

        return unico;
    }

    public void registro(){
        Namespace nm = NamespaceFactory.getInstance().getNamespace();
        nm.register("Pantalla");
        nm.register("Telefono");
        nm.register("Nevera");
        nm.register("EquipoSonido");
    }

    public void crearElemento(){
        String tipo = this.miConsola.crearElemento();

        if(tipo != null){
            Electrodomestico instancia = ElectrodomesticoFactory.getElectrodomestico(tipo);
            ElectrodomesticoManager manager = ElectrodomesticoFactory.getManager(instancia);
            System.out.println(manager);
        }
    }

    public static void main(String[] args) {
        Admin.getInstance().crearElemento();
    }
}
