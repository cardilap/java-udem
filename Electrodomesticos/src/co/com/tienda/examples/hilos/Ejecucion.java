package co.com.tienda.examples.hilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void hilos() {
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
        Process proceso = pb.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getErrorStream()));
        String line;
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }

    }

    public static void launcherJava() throws IOException {
        String[] cmd = {"cmd", "/c", "java -version"};
        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.redirectError(new File("salida.txt"));
        Process proceso = pb.start();
    }

    public static void main(String[] args) throws IOException {
        launcherJava();
    }
}
