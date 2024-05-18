package co.com.tienda.examples.archivos;

import java.io.*;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        String filename = "archivo.txt";
        escribir(filename);
        leer(filename);
    }
    public static void escribir(String filename) {

        Scanner scan = new Scanner(System.in);
        try (
                FileOutputStream fio = new FileOutputStream(filename);
                BufferedOutputStream bio = new BufferedOutputStream(fio);
                PrintStream ps = new PrintStream(bio);
        ) {
                do {
                    //System.setOut(ps);
                    String line = scan.nextLine();
                    if(line.equalsIgnoreCase("exit")) break;
                    ps.println(line);
                }while (true);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    public static void leer(String filename) {
        try (
                FileInputStream fio = new FileInputStream(filename);
                DataInputStream dio = new DataInputStream(fio)
        ){
            for(/*inicializo variables*/;dio.available() > 0 ; /*incrementos*/){
                System.out.println(dio.read());
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
