package co.com.tienda.examples.estados;

public class Estados {
}
class Pedido{

    ESTADOPEDIDO estado;
    public ESTADOPEDIDO getEstado() {
        return estado;
    }

    public void setEstado(ESTADOPEDIDO estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "estado='" + estado + '\'' +
                '}';
    }
}
class Carrito{
    public static void main(String[] args) {
        Pedido miPedido = new  Pedido();

        miPedido.setEstado(ESTADOPEDIDO.AGOTADO);
        System.out.println(miPedido);
    }
}
