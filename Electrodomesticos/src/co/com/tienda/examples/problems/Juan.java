package co.com.tienda.examples.problems;

public class Juan {
    public static String retoDeJuan() {
        StringBuilder resultado = new StringBuilder();
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 7 == 0 && numero % 11 == 0) {
                resultado.append("sieteOnce\n");
            } else if (numero % 7 == 0) {
                resultado.append("siete\n");
            } else if (numero % 11 == 0) {
                resultado.append("once\n");
            } else {
                resultado.append(numero + "\n");
            }
        }
        return resultado.toString();
    }
}
