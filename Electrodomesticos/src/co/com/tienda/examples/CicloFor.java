package co.com.tienda.examples;

public class CicloFor {
    public static void ciclos(int n){
        int array[] = {0,1,3};
        long i = 0;

        for(i = 0;i < n;i++){
            if(i % 2 == 0){ //0,1,3 = 5  //0,2,4 = 5 //1,3,5 = 5
                System.out.println(" salta " + i);
                continue;
            }
            System.out.println(" siempre " + i); //0,1,2,3,4,5 = 5
            if(i == 6){
                break;
            }
        }
        System.out.println("el ultimo valor de i: " + i);

        for(int x: array){
            System.out.println(x);
        }
        //System.out.println(x);
    }

    public static void main(String[] args) {
        ciclos(10);
    }
}
