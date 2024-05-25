package co.com.tienda.examples.hilos;

import java.util.Date;

public class Revision extends Thread{
    volatile private boolean alive = true;

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public void run() {
        while (this.alive){
            System.out.println("Evaluo " + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

        System.out.println("Termina hilo");
    }

    public static void main(String[] args) {
        Revision proc = new Revision();
        proc.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            proc.setAlive(false); //me despertaron
        }
        proc.setAlive(false); //dormir todo el tiempo
    }
}
