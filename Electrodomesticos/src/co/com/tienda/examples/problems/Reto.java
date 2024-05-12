package co.com.tienda.examples.problems;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Player{
    private int id;
    private String nombre;
    private Supplier solucion;
    private int primerLugar;
    private long tiempo;

    public Player(int id, String nombre, Supplier solucion) {
        this.id = id;
        this.nombre = nombre;
        this.solucion = solucion;
    }

    public int getPrimerLugar() {
        return primerLugar;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Supplier getSolucion() {
        return solucion;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public void primerLugar(){
        this.primerLugar++;
    }

    @Override
    public String toString() {
        return String.format("%d. %s con %d nanosegundos",id,nombre,tiempo);
    }

    public String getScoreTotal() {
        return String.format("%d. %s fue más rápido en %d ejecuciones",id,nombre,primerLugar);
    }
}
public class Reto {
    private List<Player> jugadores = new ArrayList<>();
    boolean log = false;

    public Reto(boolean log) {
        this.log = log;
    }

    public void addJugador(Player player){
        this.jugadores.add(player);
    }

    public void imprimir(){
        this.jugadores.sort(Comparator.comparingInt(Player::getPrimerLugar).reversed());
        for (Player player : this.jugadores) {
            System.out.println(player.getScoreTotal());
        }
    }

    public Player buscarElPrimero(){
        Map.Entry<Player, Long> primero = this.jugadores.stream()
                .map(x -> Map.entry(x, x.getTiempo()))
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

    public long evaluarTiempo(Supplier<String> reto){
        long tiempo = System.nanoTime();
        String print = reto.get();
        if(log){
            System.out.println(print);
        }
        return System.nanoTime() - tiempo;
    }

    public void test(Player player) {
        this.log = true;
        System.out.println("tiempo : " +  evaluarTiempo(player.getSolucion()));
    }

    public void ejecucion() {
        this.jugadores.stream().forEach(player -> {
            player.setTiempo(evaluarTiempo(player.getSolucion()));
        });
        Player elmasRapido = buscarElPrimero();
        elmasRapido.primerLugar();

        if(log) {
            System.out.printf("el mas rápido es %s \n", elmasRapido);
            for (Player p : this.jugadores) {
                System.out.printf("ejecución %s\n", p);
            }
        }

    }
    public void run(int total){
        for (int i=0; i<total;i++){
            ejecucion();
        }
    }

    public static void main(String[] args) {
        Reto primerReto = new Reto(false);
        primerReto.addJugador(new Player(1,"David", David::retoDavid));
        primerReto.addJugador(new Player(2,"Jorge", Jorge::retoDeJorge1));
        primerReto.addJugador(new Player(3,"Jorge", Jorge::retoDeJorge2));
        primerReto.addJugador(new Player(4,"Juan", Juan::retoDeJuan));
        primerReto.addJugador(new Player(5,"Wilson", Wilson::retoWill));
        primerReto.addJugador(new Player(6,"Nataly", Nataly::evaluarReto));
        primerReto.run(1000);
        primerReto.imprimir();
    }
}
