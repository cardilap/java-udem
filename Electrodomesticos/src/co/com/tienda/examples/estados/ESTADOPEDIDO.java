package co.com.tienda.examples.estados;

public enum ESTADOPEDIDO {
    DISPONIBLE("5526"), EN_PEDIDO("6789"), AGOTADO("0000");
    String codigo;

    ESTADOPEDIDO(String codigo) {
        this.codigo = codigo;
        System.out.println("enum");
    }

    @Override
    public String toString() {
        return "ESTADOPEDIDO{" +
                "codigo='" + codigo + '\'' +
                '}';
    }
}
