package co.com.tienda.examples.red;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer extends Thread{
    private int puerto;

    public TCPServer(int puerto) {
        this.puerto = puerto;
    }

    public void run(){
        try(ServerSocket server = new ServerSocket(this.puerto)){
            System.out.println("Escuchando en puerto " + puerto);
            Socket con = server.accept();
            System.out.println("Se conecta " + con.getInetAddress().getHostAddress());
            DataInputStream dis = new DataInputStream(con.getInputStream());
            PrintStream ps = new PrintStream(con.getOutputStream());
            String lee = null;
            do{
                lee = dis.readLine();
                System.out.println("server recibe: " + lee);
                ps.println("Gracias");
            }
            while (!lee.equalsIgnoreCase("exit"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Se termina server");
    }
}
