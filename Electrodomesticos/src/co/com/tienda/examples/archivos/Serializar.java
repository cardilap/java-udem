package co.com.tienda.examples.archivos;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Serializar {
    static class Registro implements Serializable{
        private String nombre;
        transient private String valor;

        public Registro(String nombre, String valor) {
            this.nombre = nombre;
            this.valor = valor;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Registro{");
            sb.append("nombre='").append(nombre).append('\'');
            sb.append(", valor='").append(valor).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String filename = "archivo.txt";
        escribir(filename, new Registro("Jorge", "un punto"));
        System.out.println(leer(filename));
    }
    public static void escribir(String filename, Registro objeto) {

        try (
                FileOutputStream fio = new FileOutputStream(filename);
                ObjectOutputStream bio = new ObjectOutputStream(fio);
        ) {
            bio.writeObject(objeto);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    public static Object leer(String filename) {
        Object leido = null;
        try (
                FileInputStream fio = new FileInputStream(filename);
                ObjectInputStream dio = new ObjectInputStream(fio)
        ){
            leido = dio.readObject();
            return leido;
        }catch (Exception ioe){
            ioe.printStackTrace();
        }

        return null;
    }
}
