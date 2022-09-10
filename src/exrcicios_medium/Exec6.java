package exrcicios_medium;

import javax.swing.*;

public class Exec6 {
    public static void main(String[] args) {
        //6-) Faça um algoritmo para ler um número inteiro, calcular e exibir o
        //Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3)..
        //*(10-1) = 3.628.800
        int fatorial, i;
        fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite 10"));
        i = fatorial;
        while(i>1) {
            fatorial = fatorial * (i - 1);
            i--; // o i deverá ser menor que 1
            System.out.println("O fatorial do número digitado é "+ fatorial);
        }
    }

}



