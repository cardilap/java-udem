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
            while (dis.available() > 0){
                System.out.println(dis.readLine());
                ps.println("recibido");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Se termina server");
    }
}
