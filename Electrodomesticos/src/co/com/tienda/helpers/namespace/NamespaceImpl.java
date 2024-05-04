package co.com.tienda.helpers.namespace;

public class NamespaceImpl implements Namespace{
    private String[] registry = new String[10]; //Espacio de nombres

    NamespaceImpl(){

    }

    public void register(String elemento){
        for (int i = 0; i < registry.length; i++) {
            if(registry[i] == null){
                registry[i] = elemento;
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
    public String[] getRegistry() {
        return this.registry;
    }

    public String validar(int index){
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
            sb.append(i+1).append(". ").append(registry[i]).append("\n");
        }

        return sb.toString();
    }
}
