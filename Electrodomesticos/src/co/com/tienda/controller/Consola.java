package co.com.tienda.controller;

import co.com.tienda.helpers.Teclado;
import co.com.tienda.helpers.namespace.NamespaceEntry;
import co.com.tienda.helpers.namespace.NamespaceFactory;
import co.com.tienda.modelo.Electrodomestico;

import java.util.function.Supplier;

public class Consola extends DataInput{
    public NamespaceEntry validar(String comando){ //objeto validador
        int opcion = Integer.parseInt(comando);
        return NamespaceFactory.getInstance().getNamespace().validar(opcion);
    }
    public NamespaceEntry menuCrearElemento(){
        String comando = Teclado.obtenerDeTeclado("¿Qué elemento desea crear?\n" + NamespaceFactory.getInstance().getNamespace());
        NamespaceEntry tipo = validar(comando);
        if(tipo == null){
            System.out.println("Elección no valida!");
            return null ;
        }
        return tipo;
    }
}
