package co.com.tienda.examples;

public class ExcepcionesImplicitas {

    void metodo1 (){
        try {
            metodo2(); //base de datos
            metodo4();
        }catch (Error e){
            System.out.println("Decidí capturar este error" + e);
        }catch (Exception e){
            System.out.println("Decidí capturar esta excepción" + e);
        }

        System.out.println("metodo 1");
    }
    void metodo2 (){
        metodo3();
        System.out.println("metodo 2");
    }
    void metodo3 (){
        Object o = new ExcepcionesImplicitas();
        Integer i = (Integer) o;
        System.out.println("metodo 3");
    }

    void metodo4 (){
        System.out.println("metodo 4: leyendo un archivo");
    }
    public static void main(String[] args) {
        new ExcepcionesImplicitas().metodo1();
    }
}
