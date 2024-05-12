package co.com.tienda.helpers.namespace;

import java.util.function.Supplier;

public interface Namespace extends NamespaceManager{
    NamespaceEntry[] getRegistry();
    NamespaceEntry validar(int index);
}
