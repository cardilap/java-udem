package co.com.tienda.helpers;

import java.lang.*; //regalo

public class Reporte1 extends Object { //regalo extends object
    static int instancias = 0;
    static{
        System.out.println("primer uso de la clase");
    }
    Reporte1(){
        super(); //regalo
        System.out.println("constructor de instancia " + instancias++);
    }

    public static String letras(int n){
        StringBuilder letras = new StringBuilder();
        int i=1;
        int j = (n<10)?50:-1;
        if(i < 10){
            System.out.println(i);
        }
        else{
            System.out.println("menor");
        }

        // i (n + 1) - 1
        letras.append("abcdefghijklmnopqrstuvwxyz")
                .insert((i++)*(n + 1) - 1," ")
                .insert((i++)*(n + 1) - 1, " ")
                .insert((i++)*(n + 1) - 1, " ")
                .insert((i++)*(n + 1) - 1, " ")
                .insert((i++)*(n + 1) - 1, " ")
                .insert((i++)*(n + 1) - 1, " ")
                .insert((i++)*(n + 1) - 1, " ")
                .insert((i++)*(n + 1) - 1, " ");
        return letras.toString();
    }
}
