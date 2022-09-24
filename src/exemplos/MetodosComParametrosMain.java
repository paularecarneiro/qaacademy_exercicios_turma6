package exemplos;

public class MetodosComParametrosMain {
    public static void main(String[] args) {
        textos("azul", "preto");
        numeros(1, 2);
        amarelo("amarelo");
        cidade("São Paulo", "Rio de Janeiro");
        nota(10, 5);
        valor(2, 6);


    }
    public static void textos(String c, String d){
        System.out.println("A cor é " + c + " e " + d);
    }
    public static void numeros(int a, int b) {
        System.out.println("O número é " + b + " e " + a);
    }
    public static void amarelo(String a){
            System.out.println("A cor é" + " " + a);
        }
    public static String cidade(String x, String y){
        System.out.println("A cidade é: " + y + " e " + x);
        return y+x;
    }
    public static int nota(int a, int b) {
        System.out.println("A nota é " + " " + b);
    return b;

    }
    public static int valor(int a, int b){
        System.out.println("O valor é " + " " + a + " e " + b);
        return a+b;
    }

    }




