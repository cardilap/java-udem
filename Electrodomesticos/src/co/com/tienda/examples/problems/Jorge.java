package co.com.tienda.examples.problems;

public class Jorge {
    public static String retoDeJorge1() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                resultado.append("Siete y Once\n");
            } else if (i % 7 == 0) {
                resultado.append("Siete\n");
            } else if (i % 11 == 0) {
                resultado.append("Once\n");
            } else {
                resultado.append(i).append("\n"); //no concatena
            }
        }
        return resultado.toString();
    }

    public static String retoDeJorge2() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                resultado.append("Siete");
                if (i % 11 == 0) {
                    resultado.append(" y Once\n");
                } else {
                    resultado.append("\n");
                }
            } else if (i % 11 == 0) {
                resultado.append("Once\n");
            } else {
                resultado.append(i).append("\n");
            }
        }
        return resultado.toString();
    }
}
