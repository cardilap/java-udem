package co.com.tienda.examples;

import java.io.EOFException;
import java.io.IOException;

class UDEMException extends Throwable{

}
public class Excepciones {
    void metodo1 () throws IOException {
        try {
            metodo2();
        }catch (IOException e) {
            //busco nuevo archivo
            System.out.println("error y la propago");
            throw new IOException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UDEMException e){

        }
        finally {
            System.out.println("TODO ESTO SE EJECUTA SIN IMPORTAR QUE");
        }

        System.out.println("metodo 1");
    }
    void metodo2 () throws IOException, ClassNotFoundException, UDEMException {
        try{
            metodo3();
            System.out.println("metodo 2");
            return;
        }
        finally {
            System.out.println("pasó por el metodo 2 ");
        }

    }
    void metodo3 () throws IOException, ClassNotFoundException {
        Object o = new ExcepcionesImplicitas();
        Integer i = (Integer) o;
        throw new EOFException("Fin de archivo erroneo");
        //System.out.println("metodo 3");
    }

    void metodo4 () throws Exception {
        //try with resources: esta si puede ir solo con el try
        // for : normal
        // enhanced for: for(Item i: recurso)
        //try
        MiRecurso recurso = new MiRecurso();
        MiRecurso recurso2 = new MiRecurso();
        MiRecurso recurso3 = new MiRecurso();

        try(recurso; recurso2; recurso3){

        }
        finally {
            System.out.println("finally del try con recursos");
        }
        System.out.println("metodo 4: leyendo un archivo");
    }
    public static void main(String[] args){
        try {
            new Excepciones().metodo4();
        } catch (Exception e) {
            System.out.println("Contacte a su administrador");
        }
    }
}

class MiRecurso implements AutoCloseable{//esta clase va a acceder a un archivo
    @Override
    public void close() throws Exception {
        System.out.println("Cerrando mi recurso");
    }

}
