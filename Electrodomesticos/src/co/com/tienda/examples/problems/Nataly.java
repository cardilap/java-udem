package co.com.tienda.examples.problems;

public class Nataly {
    public static String evaluarReto() {
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                resultado.append("SieteOnce\n");
            } else if (i % 7 == 0) {
                resultado.append("Siete\n");
            } else if (i % 11 == 0) {
                resultado.append("Once\n");
            } else {
                resultado.append(i).append("\n");
            }
        }

        return resultado.toString();
    }
}
