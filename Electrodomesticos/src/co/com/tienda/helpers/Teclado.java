package co.com.tienda.helpers;

import java.util.Scanner;

public class Teclado {
    public static String obtenerDeTeclado(String mensaje){
        Scanner s = new Scanner(System.in); //Gestor de objetos
        //Helpers o Utils: clases con metodos de clase para hacer tareas puntuales (Math)
        //Wrappers: Gestor de objetos (instancia) Envuelto (capas)

        System.out.println(mensaje);
        String str = s.nextLine();

       return str;
    }
}
