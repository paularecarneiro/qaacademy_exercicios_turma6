package exemplos;

public class MetodosComRetornoMain {
    public static void main(String[] args) {
        System.out.println(saoPaulo());
        System.out.println(santos());
        System.out.println(osasco());
        System.out.println(guarulhos());
        System.out.println(santos());
        System.out.println(santos()+ saoPaulo()); //concatenar

    }
public static String saoPaulo(){
        return "São Paulo";

}
    public static String osasco(){
        return "Osasco";

    }
    public static String santos(){
        return "Santos";

    }
    public static String guarulhos(){
        return "Guarulhos";

    }
    public static String barueri(){
        return "Barueri";

    }
}

