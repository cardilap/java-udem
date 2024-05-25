package co.com.tienda.examples.red;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class TCPClient extends Thread{
    private String ip;
    private int puerto;

    public TCPClient(String ip, int puerto) {
        this.ip = ip;
        this.puerto = puerto;
    }

    public void run(){
        try(Socket cliente = new Socket(this.ip, this.puerto)){

            PrintStream ps = new PrintStream(cliente.getOutputStream());
            DataInputStream dis = new DataInputStream(cliente.getInputStream());
            ps.println("Hola");
            String lee = null;
            do{
                lee = dis.readLine();
                System.out.println("cliente recibe: " + lee);
            }while (!lee.equalsIgnoreCase("exit"));

        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Se termina cliente");
    }
}
