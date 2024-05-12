package co.com.tienda.helpers.namespace;

import java.util.function.Function;
import java.util.function.Supplier;

public class NamespaceImpl implements Namespace{
    private NamespaceEntry[] registry = new NamespaceEntry[10]; //Espacio de nombres

    NamespaceImpl(){

    }

    public void register(String elemento, Supplier factory, Function managerFactory){
        for (int i = 0; i < registry.length; i++) {
            if(registry[i] == null){
                registry[i] = new NamespaceEntry(elemento, factory, managerFactory);
                break;
            }
        }
    }
    public void unregister(String elemento){
        for (int i = 0; i < registry.length; i++) {
            if(registry[i].equals(elemento)){
                registry[i] = null;
                break;
            }
        }
    }

    @Override
    public NamespaceEntry[] getRegistry() {
        return this.registry;
    }

    public NamespaceEntry validar(int index){
        index--;
        if(index<0||index>this.registry.length){
            return null;
        }
        return this.registry[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < registry.length; i++) {
            if(registry[i] == null) continue;
            sb.append(i+1).append(". ").append(registry[i].getName()).append("\n");
        }

        return sb.toString();
    }
}
