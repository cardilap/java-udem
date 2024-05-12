package co.com.tienda.examples.problems;

public class Wilson {
    public static int numero1 = 7;
    public static int numero2 = 11;

    public static String retoWill() {
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i < 100; i++) {

            if (i % numero1 ==0) {
                resultado.append("Siete\n");
            } else if (i% numero2 ==0) {
                resultado.append("Once\n");
            } else if (i % numero1 ==0 && i% numero2 ==0) {
                resultado.append("SieteOnce\n");
            }else { resultado.append(i+"\n");
            }

        }
        return resultado.toString();

    }
}
