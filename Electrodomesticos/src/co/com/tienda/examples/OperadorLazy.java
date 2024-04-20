package co.com.tienda.examples;

public class OperadorLazy {
    public static boolean valida(int x){
        System.out.println("entra a valida con x: " + x);
        return x>0;
    }

    public static void main(String[] args) {
        if(valida(5) || valida(8)){
            System.out.println("entra a el if");
        }
    }
    /* AND
    false false = false
    false true = false
    true false = false
    true true = true

    OR
    false false = false
    false true = true
    true false = true
    true true = true
    * */
}
