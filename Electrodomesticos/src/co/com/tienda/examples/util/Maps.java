package co.com.tienda.examples.util;

import java.util.*;

public class Maps {
    public static class Registro{

    }
    public static void main(String[] args) {
        HashMap<String, List<Integer>> mapa = new HashMap<>();

        mapa.put("1", List.of(6,7,8));
        mapa.put("2", List.of(6,7,8));
        mapa.put("3", List.of(6,7,8));
        mapa.put(null, List.of(6,7,8));

        /* Archivo para sacar el promedio por estudiante
        *  Daniel 6
        *  Luis 7
        *  Wilson 5
        *  Daniel 9
        *  Daniel 6
        *  Luis 8
        *  Wilson 9
        * */
        //mapa.put("Daniel", List.of(6,9,6));

        Map hashTable = new HashMap(); //fabricar mis elementos
        //hashTable.put(null, "");

        Maps.Registro miRegistro = new Maps.Registro();

        for(Map.Entry e : mapa.entrySet()){
            System.out.println(e);
        }

        System.out.println(mapa);
    }
}
