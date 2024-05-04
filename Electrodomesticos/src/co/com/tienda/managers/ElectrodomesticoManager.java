package co.com.tienda.managers;

public abstract class ElectrodomesticoManager implements Poblable{
    private String[] registry = new String[10]; //Espacio de nombres
    protected void register(String elemento){
        for (int i = 0; i < registry.length; i++) {
            if(registry[i] == null){
                registry[i] = elemento;
                break;
            }
        }
    }
    protected void unregister(String elemento){
        for (int i = 0; i < registry.length; i++) {
            if(registry[i].equals(elemento)){
                registry[i] = null;
                break;
            }
        }
    }
    public String getElementos(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < registry.length; i++) {
            sb.append(i+1).append(". ").append(registry[i]).append("\n");
        }

        return sb.toString();
    }

}
