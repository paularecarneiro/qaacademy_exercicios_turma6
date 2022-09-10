package exrcicios_medium;

public class Exec1 {
    public static void main(String[] args) {
    // 1-) Faça um algoritmo para verificar e exibir de 0 a 100, quais são os números Pares e ímpares.

        int i = 0;
        while (i <= 100){
            if (i % 2 == 0){
           System.out.println("O Numero é: " + i +" é par");
        } else {
           System.out.println("O Número é: " + i + " é ímpar");
        }
    i++;

    }

    }
}


