package co.com.tienda.examples.hilos;


public class Proceso1 implements Runnable{
    String nombre;

    public Proceso1(String nombre){
        this.nombre = nombre;
    }

    public void run(){ //comportamiento en "paralelo"
        long time = System.nanoTime();
        if(nombre.equals("2: ")){
            try {
                Thread.sleep(3000);
                System.out.println(nombre + "dormi todo lo que pude");
            } catch (InterruptedException e) {
                System.out.println(nombre + "Me despertaron");
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.printf("%s %d%n",nombre, i);
        }
        System.out.println(nombre + " tiempo: " + (System.nanoTime() - time));
    }

    public static void main(String[] args) {
        Proceso1 hilo1 = new Proceso1("1: ");
        Proceso1 hilo2 = new Proceso1("2: ");
        Proceso1 nohilo3 = new Proceso1("3: ");
        Thread pal = new Thread(hilo1);
        pal.start();
        new Thread(hilo2).start();

        //System.out.println("procesos terminados");
        try {
            pal.join();
        } catch (InterruptedException e) {
            System.out.println("hilo 1 termina");
        }
        nohilo3.run();
    }
}
