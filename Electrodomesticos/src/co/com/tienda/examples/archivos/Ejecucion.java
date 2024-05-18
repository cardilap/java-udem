package co.com.tienda.examples.archivos;

import java.io.File;
import java.io.IOException;

public class Ejecucion {
    static class MiHilo extends Thread{
        private String prefijo;

        public MiHilo(String prefijo){
            this.prefijo = prefijo;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(this.prefijo + " " + i);
            }
        }
    }

    public static void main(String[] args) {
        //procesos un hilo principal
        MiHilo h1 = new MiHilo("hilo 1: ");
        MiHilo h2 = new MiHilo("hilo 2: ");
        MiHilo h3 = new MiHilo("hilo 3: ");
        h1.start(); // segundo hilo
        h2.start(); // tercer hilo
        h3.run(); //secuencia normal
    }
    public static void launcher() throws IOException {
        String[] cmd = {"cmd", "/c", "java -version"};
        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.redirectOutput(new File("salida.txt"));
        pb.start();


    }
}
