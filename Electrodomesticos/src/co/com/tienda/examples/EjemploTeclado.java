package co.com.tienda.examples;

import java.util.Scanner;

public class EjemploTeclado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Gestor de objetos
        //Helpers o Utils: clases con metodos de clase para hacer tareas puntuales (Math)
        //Wrappers: Gestor de objetos (instancia) Envuelto (capas)

        System.out.println("Escribe: ");
        String str = s.nextLine();

        System.out.println("eco: " + str);
    }
}
