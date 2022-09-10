package exrcicios_medium;

public class Exec3 {
    public static void main(String[] args) {
                int i = 1, soma = 0;
                while (i < 1000 && soma < 1500) {
                    soma = i + soma;
                    i++;
                }
                System.out.println("contador: " + i + " soma: " + soma);

            }
        }
