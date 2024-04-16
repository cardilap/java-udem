package co.com.tienda.examples;

public class Operadores {
    public static Boolean valida(int x){
        Boolean eval = (x>0); // 2 operaciones + boxing tdp > objeto
        System.out.println("Entra valida con " + x);

        if(eval) System.out.println("valida true");
            //System.out.println("otra cosa");
        else System.out.println("valida false");

        return eval;
    }
    public static void operadores(int x, int y, int z){
        if(x > 0 ){
            System.out.println("Rango x positivo");
        }
        else if(y > 0){
            System.out.println("Rango x negativo");
        }
        else{
            System.out.println("otro else");
        }

        if(y > 0 ){
            System.out.println("Rango y positivo");
        }
        else{
            System.out.println("Rango y negativo");
        }
        System.out.println("----------------------");
        if(valida(x) && valida(y) && valida(z)){
            System.out.println("Rango x,y positivo");
        }
        else{
            System.out.println("Rango x negativo");
        }
    }

    public static void main(String[] args) {
        operadores(-5,7, 8);
    }
}
