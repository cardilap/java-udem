package co.com.tienda.helpers.namespace;

import java.util.function.Function;
import java.util.function.Supplier;

public class NamespaceEntry {
    private String name;
    private Supplier factory;
    private Function managerFactory;

    public NamespaceEntry(String name, Supplier factory, Function managerFactory) {
        this.name = name;
        this.factory = factory;
        this.managerFactory = managerFactory;
    }

    public String getName() {
        return name;
    }

    public <T>Supplier<T> getFactory() {
        return factory;
    }

    public <T,R>Function<T,R> getManagerFactory() {
        return managerFactory;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NamespaceEntry{");
        sb.append("name='").append(name).append('\'');
        sb.append(", factory=").append(factory);
        sb.append(", managerFactory=").append(managerFactory);
        sb.append('}');
        return sb.toString();
    }
}
