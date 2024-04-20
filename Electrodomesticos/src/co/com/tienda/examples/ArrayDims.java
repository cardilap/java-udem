package co.com.tienda.examples;

public class ArrayDims {

    public static void asignar(int [][] val, int i, int j, int valor){
        if(i >= val.length){
            return;
        }
        if(j >= val[i].length){
            return;
        }
        val[i][j] = valor;
    }
    public static void inicializar(int [][] val, int inicial){
        System.out.println("inicializar:");
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length; j++) {
                asignar(val,i,j,inicial);
            }
        }
    }
    public static void imprimirFor(int [][] val){
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length; j++) {
                System.out.println(val[i][j]);
            }
        }
    }
    public static void imprimir(int [][] val){
        /*
        foreach: aplica a elementos iterables = valores
        iterador: auxiliar que devuelve cada elemento.
        e: variable transitoria que va a recibir cada elemento

        para cada articulo que esté en articulos asignelo a la variable e.
        sin tener en cuenta: orden, tipo (herencia + polimorfismo)
        */
        System.out.println("foreach:");
        for (int[] arrDim1 : val){
            for (int valor: arrDim1) {
                System.out.print(valor + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int [][] valores; //inicia en null
        //int [][] valores = {{1,2}, {5,6,7}};
        //int [][] valores = new int[2][3];
        //int [][] valores = new int[][]{{1,2}, {5,6,7}};

        //construir:
        valores = new int[2][];
        valores[0] = new int[2];
        valores[1] = new int[3];

        System.out.println("0,1: " + valores[0][1]);

        imprimir(valores);
        inicializar(valores, 5);
        imprimir(valores);
    }
}
