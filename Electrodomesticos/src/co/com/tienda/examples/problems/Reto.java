package co.com.tienda.examples.problems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Reto {
    int[] results;
    String[] nombres;
    boolean log = false;

    public Reto(int participantes, boolean log) {
        this.results = new int[participantes];
        this.log = log;
    }

    public void imprimir(){
        for (int i = 0; i < results.length; i++) {
            //System.out.printf("# %d con %d ejecuciones\n", i, this.results[i]);
            System.out.printf("# %d de %s fue más rápido en %d ejecuciones\n", i+1, this.nombres[i], this.results[i]);
        }
    }

    public static int buscarElPrimero(long[] ops){
        Map.Entry<Integer, Long> primero = IntStream.range(0, ops.length)
                .mapToObj(x -> Map.entry(x, ops[x]))
                .min(Map.Entry.comparingByValue()).get();
        return primero.getKey();
    }

    /*
        numeros de 1 a 100
        evaluar cada numero si es divisible por 7: imprimir Siete
        si es divisible por 11: imprimir Once
        Si es divisible por los 2: imprimir SieteOnce
        si no es ninguno de los anteriores imprimir el numero
        condiciones adicionales:
        - hacerlo en un método.
        - que el método retorne todo lo que se a imprimir.
        */

    public static long evaluarTiempo(Supplier<String> reto){
        long tiempo = System.nanoTime();
        reto.get();
        return System.nanoTime() - tiempo;
    }

    public void ejecucion() {
        this.nombres = new String[]{"David", "Jorge", "Jorge", "Juan", "Wilson", "Nataly"};
        long[] ops = {
                evaluarTiempo(David::retoDavid),
                evaluarTiempo(Jorge::retoDeJorge1),
                evaluarTiempo(Jorge::retoDeJorge2),
                evaluarTiempo(Juan::retoDeJuan),
                evaluarTiempo(Wilson::retoWill),
                evaluarTiempo(Nataly::evaluarReto),
        };
        int elmasRapido = buscarElPrimero(ops);
        this.results[elmasRapido]++;

        if(log) {
            System.out.println("el mas rapido es " + elmasRapido + " de " + this.nombres[elmasRapido]);
            for (int i = 0; i < ops.length; i++) {
                System.out.printf("ejecución %d: %d\n", i, ops[i]);
            }
        }

    }
    public void run(int total){
        for (int i=0; i<total;i++){
            ejecucion();
        }
        //Arrays.sort(this.results);
    }

    public static void main(String[] args) {
        Reto primerReto = new Reto(6, false);
        primerReto.run(1000);
        primerReto.imprimir();
    }
}
