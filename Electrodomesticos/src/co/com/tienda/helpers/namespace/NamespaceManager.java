package co.com.tienda.helpers.namespace;

import java.util.function.Function;
import java.util.function.Supplier;

public interface NamespaceManager {
    <T>void register(String elemento, Supplier factory, Function<T, ?> managerFactory);
    void unregister(String elemento);
}
