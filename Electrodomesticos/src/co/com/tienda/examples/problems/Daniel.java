package co.com.tienda.examples.problems;

public class Daniel {
        public static String validarDivisores() {
            StringBuilder resultado = new StringBuilder();
            for (int i = 1; i < 14; i++){
                if (i == 7){
                    resultado.append("Siete\n");
                    continue;
                }
                if (i == 11) {
                    resultado.append("Once\n");
                    continue;
                }
                resultado.append(i + "\n");
            }
            for (int i = 14; i <= 100; i++) {
                if (i % 7 == 0 && i % 11 == 0) {
                    resultado.append("SieteOnce\n");
                    continue;
                }else if(i % 7 == 0) {
                    resultado.append("Siete\n");
                    continue;
                } else if (i % 11 == 0) {
                    resultado.append("Once\n");
                    continue;
                } else {
                    resultado.append(i + "\n");
                }
            }

            return resultado.toString();
        }

        public static void main(String[] args) {
            System.out.println(validarDivisores());
        }

}
