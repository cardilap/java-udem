package co.com.tienda.controller;

public class Admin { //Singleton
    private Consola miConsola;
    private Inventario miInventario;

    private static Admin unico;

    private Admin(){

    }
    public static Admin getInstance(){
        if(unico == null){
            unico = new Admin();
        }

        return unico;
    }
}
