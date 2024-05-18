package co.com.tienda.examples.problems;

public class Explicacion {
    public static String solucion1() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                resultado.append("SieteOnce\n");
                continue;
            }
            if (i % 7 == 0) {
                resultado.append("Siete\n");
                continue;
            }
            if (i % 11 == 0) {
                resultado.append("Once\n");
                continue;
            }
            resultado.append(i).append("\n"); //no concatena
        }
        return resultado.toString();
    }

    public static String solucion2() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i < 77; i++) {
            if (i % 7 == 0) {
                resultado.append("Siete\n");
                continue;
            }
            if (i % 11 == 0) {
                resultado.append("Once\n");
                continue;
            }
            resultado.append(i).append("\n"); //no concatena
        }
        resultado.append("SieteOnce\n");
        for (int i = 78; i <= 100; i++) {
            if (i % 7 == 0) {
                resultado.append("Siete\n");
                continue;
            }
            if (i % 11 == 0) {
                resultado.append("Once\n");
                continue;
            }
            resultado.append(i).append("\n"); //no concatena
        }
        return resultado.toString();
    }

    public static String solucion3() {
        String[] salida = new String[101];
        for (int i = 7; i <= 100; i+=7) { //multiplos de 7
            salida[i] = "Siete\n";
        }
        for (int i = 11; i <= 100; i+=11) { //multiplos de 11
            salida[i] = "Once\n";
        }
        for (int i = 11*7; i <= 100; i+=11*7) { //multiplos de 77 = 7 y de 11
            salida[i] = "SieteOnce\n";
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <=100 ; i++) {
            if(salida[i] == null){
                resultado.append(i).append("\n");
                continue;
            }
            resultado.append(salida[i]);
        }
        return resultado.toString();
    }
}
