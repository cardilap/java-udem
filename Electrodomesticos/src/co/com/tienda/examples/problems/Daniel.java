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

    public static String validarDivisoresV2() {
        StringBuilder resultado = new StringBuilder();
        int contadorSietes = 7;
        int contadorOnces = 11;
        for (int i = 1; i <= 100; i++){
            if (i == 7){
                resultado.append("Siete\n");
                contadorSietes += 7;
                continue;
            }
            if (i == 11){
                resultado.append("Once\n");
                contadorOnces += 11;
                continue;
            }
            if (i == contadorSietes){
                contadorSietes += 7;
                if (i % 11 == 0){
                    resultado.append("SieteOnce\n");
                    contadorOnces += 11;
                    continue;
                }
                resultado.append("Siete\n");
                continue;
            }
            if (i == contadorOnces){
                contadorOnces += 11;
                if (i % 7 == 0){
                    resultado.append("SieteOnce\n");
                    continue;
                }
                resultado.append("Once\n");
                continue;
            }
            resultado.append(i + "\n");
        }

        return resultado.toString();
    }

    public static String validarDivisoresV3() {
        StringBuilder resultado = new StringBuilder();
        int contadorSietes = 7;
        int contadorOnces = 11;
        for (int i = 1; i < 14; i++){
            if (i == 7){
                resultado.append("Siete\n");
                contadorSietes += 7;
                continue;
            }
            if (i == 11) {
                resultado.append("Once\n");
                contadorOnces += 11;
                continue;
            }
            resultado.append(i + "\n");
        }
        for (int i = 14; i <= 100; i++) {
            if (i == contadorSietes){
                contadorSietes += 7;
                if (i % 11 == 0){
                    resultado.append("SieteOnce\n");
                    contadorOnces += 11;
                    continue;
                }
                resultado.append("Siete\n");
                continue;
            }
            if (i == contadorOnces){
                contadorOnces += 11;
                if (i % 7 == 0){
                    resultado.append("SieteOnce\n");
                    continue;
                }
                resultado.append("Once\n");
                continue;
            }
            resultado.append(i + "\n");
        }

        return resultado.toString();
    }

    public static String validarDivisoresV4() {
        StringBuilder resultado = new StringBuilder();
        int contadorSietes = 7;
        int contadorOnces = 11;
        int contadorMultiplo = 7*11;
        for (int i = 1; i < 14; i++){
            if (i == 7){
                resultado.append("Siete\n");
                contadorSietes += 7;
                continue;
            }
            if (i == 11) {
                resultado.append("Once\n");
                contadorOnces += 11;
                continue;
            }
            resultado.append(i + "\n");
        }
        for (int i = 14; i <= 100; i++) {
            if (i == contadorMultiplo){
                resultado.append("SieteOnce\n");
                contadorMultiplo += 11*7;
                contadorSietes += 7;
                contadorOnces += 11;
                continue;
            }
            if (i == contadorSietes){
                contadorSietes += 7;
                resultado.append("Siete\n");
                continue;
            }
            if (i == contadorOnces){
                contadorOnces += 11;
                resultado.append("Once\n");
                continue;
            }
            resultado.append(i + "\n");
        }

        return resultado.toString();
    }
    public static void main(String[] args) {
            System.out.println(validarDivisores());
        }

}
