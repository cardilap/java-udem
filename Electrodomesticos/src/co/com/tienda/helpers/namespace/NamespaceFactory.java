package co.com.tienda.helpers.namespace;

public class NamespaceFactory {
    private static NamespaceFactory unica;
    private Namespace namespace;

    private NamespaceFactory(){
        namespace = new NamespaceImpl();
    }
    public static NamespaceFactory getInstance(){
        if(unica == null){
            unica = new NamespaceFactory();
        }
        return unica;
    }

    public Namespace getNamespace() {
        return namespace;
    }
}
