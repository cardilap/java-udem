package co.com.tienda.examples;

class Abuela {
    int total = 50;
    public void imprimir(Integer total){
        System.out.println("Integer: " + total);
    }

    public void imprimir(Long total){
        System.out.println("Long: " + total);
    }
}
class Hija extends Abuela{
    int total = 100;
    static int general = 890;

    public void imprimir(int total){
        System.out.println("Hija");
        System.out.println(total); // imprime la variable local = 60: ok
        System.out.println(this.total); // imprime la variable de subclase = 100
        System.out.println(super.total); // imprime la variable de superclase = 50
    }

    public static void main(String[] args) {
        System.out.println(Hija.general); // imprime la variable static = 890
    }
}
public class VarLocales extends Hija{
    int total = 190;
    public void imprimir(int total){
        System.out.println("VarLocales");
        super.imprimir(total);
        System.out.println(this.total); // imprime la variable de subclase = 100
        System.out.println(super.total); // imprime la variable de superclase = 100
        System.out.println(Hija.general); // imprime la variable static = 890
    }

    public static void main(String[] args) {
        // new VarLocales().imprimir(60);
        // gc lo marca para borrado

        //Declaración
        //Inicialización
        //Ejecución 1
        //Ejecución 2
        //Ejecución 3
        //Se Destruye

        short s = 70;
        long l = 60L;

        VarLocales vl = new VarLocales();
        vl.imprimir(s); // promoción

        Hija h = vl;
        h.imprimir(Integer.valueOf(80));
        h.imprimir(l); //Autoboxing: new Long(l)
    }
}
