package co.com.tienda.examples.problems;

public class David  {
    public static String retoDavid() {
        StringBuilder imprimir = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                imprimir.append("sieteonce\n");
            } else if (i % 7 == 0) {
                imprimir.append("siete\n");
            } else if (i % 11 == 0) {
                imprimir.append("once\n");
            } else {
                imprimir.append(i).append("\n");
            }
        }
        imprimir.append("siete\n");
        return imprimir.toString(); // Devuelve la cadena resultante
    }
}
