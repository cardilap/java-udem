package co.com.tienda.controller;

import co.com.tienda.helpers.Teclado;
import co.com.tienda.helpers.namespace.NamespaceFactory;

public class Consola extends DataInput{
    public String validar(String comando){ //objeto validador
        int opcion = Integer.parseInt(comando);
        return NamespaceFactory.getInstance().getNamespace().validar(opcion);
    }
    public String crearElemento(){
        String comando = Teclado.obtenerDeTeclado("¿Qué elemento desea crear?\n" + NamespaceFactory.getInstance().getNamespace());
        String tipo = validar(comando);
        if(tipo == null){
            System.out.println("Elección no valida!");
            return null ;
        }
        return tipo;
    }
}
